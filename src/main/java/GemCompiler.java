import org.antlr.v4.codegen.CodeGenerator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GemCompiler {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java GemCompiler <source_file> [--stop-at <lexing|parsing|semantic>]");
            return;
        }

        String sourceFile = args[0];
        String stopAt = null;

        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--stop-at") && i + 1 < args.length) {
                stopAt = args[i + 1];
                break;
            }
        }

        if (stopAt != null && (!stopAt.equals("lexing") && !stopAt.equals("parsing") && !stopAt.equals("semantic"))) {
            System.out.println("Invalid --stop-at argument. Must be one of: lexing, parsing, semantic");
            return;
        }

        try {
            String sourceCode = new String(Files.readAllBytes(Paths.get(sourceFile)));

            // Create lexer
            CharStream input = CharStreams.fromString(sourceCode);
            gemLexer lexer = new gemLexer(input);

            // Create error listeners for lexer
            GemErrorListener lexerErrorListener = new GemErrorListener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(lexerErrorListener);

            // Create token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // If stopping at lexing, print tokens and exit
            if (stopAt != null && stopAt.equals("lexing")) {
                tokens.fill();
                printTokens(tokens.getTokens());
                printErrors(lexerErrorListener.getErrors(), null, null);
                return;
            }

            // Create parser
            gemParser parser = new gemParser(tokens);

            // Create error listeners for parser
            GemErrorListener parserErrorListener = new GemErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(parserErrorListener);

            // Parse the program
            ParseTree tree = parser.program();

            // If stopping at parsing, print parse tree and exit
            if (stopAt != null && stopAt.equals("parsing")) {
                printParseTree(tree, 0);
                printErrors(lexerErrorListener.getErrors(), parserErrorListener.getErrors(), null);
                return;
            }

            // Semantic analysis
            GemSemanticAnalyzer semanticAnalyzer = new GemSemanticAnalyzer();
            semanticAnalyzer.analyzeTree(tree);

            // If stopping at semantic, print symbol tables and exit
            if (stopAt == null || !semanticAnalyzer.getErrors().isEmpty()) {
                // Generate class name from source file name
                String className = Paths.get(sourceFile).getFileName().toString().replaceAll("\\.gem$", "");
                String outputFile = className + ".class";

                // Generate bytecode
                CodeGenerator codeGenerator = new CodeGenerator();
                codeGenerator.generate(tree, semanticAnalyzer, className, outputFile);

                System.out.println("Code generation successful: " + outputFile);
            }

            // Code generation - only proceed if no semantic errors
            if (semanticAnalyzer.getErrors().isEmpty()) {
                // Generate class file name from source file name
                String className = Paths.get(sourceFile).getFileName().toString();
                className = className.replaceAll("\\.gem$", "");
                String outputFile = className + ".class";

                // Generate code
                CodeGenerator codeGenerator = new CodeGenerator();
                codeGenerator.generate(tree, semanticAnalyzer, className, outputFile);

                System.out.println("Code generation successful: " + outputFile);
            } else {
                System.out.println("Semantic errors found, cannot generate code:");
                printErrors(
                        lexerErrorListener.getErrors(),
                        parserErrorListener.getErrors(),
                        semanticAnalyzer.getErrors()
                );
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Feature not yet implemented: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error during compilation: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void printTokens(List<Token> tokens) {
        System.out.println("Lexical Analysis Results:");
        for (Token token : tokens) {
            if (token.getType() != Token.EOF) {
                String tokenName = gemLexer.VOCABULARY.getSymbolicName(token.getType());
                System.out.printf("  %s('%s') at %d:%d\n",
                        tokenName, token.getText(), token.getLine(), token.getCharPositionInLine());
            }
        }
    }

    private static void printParseTree(ParseTree tree, int indent) {
        if (tree == null) return;

        String indentStr = "  ".repeat(indent);

        // Print the current node
        if (tree instanceof TerminalNode) {
            Token token = ((TerminalNode)tree).getSymbol();
            String tokenName = gemLexer.VOCABULARY.getSymbolicName(token.getType());
            System.out.printf("%s%s: '%s'\n", indentStr, tokenName, token.getText());
        } else {
            String context = tree.getClass().getSimpleName().replace("Context", "");
            System.out.println(indentStr + context);

            // Print children
            for (int i = 0; i < tree.getChildCount(); i++) {
                printParseTree(tree.getChild(i), indent + 1);
            }
        }
    }

    private static void printErrors(List<String> lexerErrors, List<String> parserErrors, List<CompilationError> semanticErrors) {
        if (lexerErrors != null && !lexerErrors.isEmpty()) {
            System.out.println("\nLexical Errors:");
            for (String error : lexerErrors) {
                System.out.println("  " + error);
            }
        }

        if (parserErrors != null && !parserErrors.isEmpty()) {
            System.out.println("\nParsing Errors:");
            for (String error : parserErrors) {
                System.out.println("  " + error);
            }
        }

        if (semanticErrors != null && !semanticErrors.isEmpty()) {
            System.out.println("\nSemantic Errors:");
            for (CompilationError error : semanticErrors) {
                System.out.println("  " + error);
            }
        }
    }
}