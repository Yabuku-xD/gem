package com.gem;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

// Import the generated lexer and parser classes
import gemLexer;
import gemParser;

public class SimpleTestRig {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleTestRig <filename>");
            return;
        }

        // Create a CharStream from file
        CharStream input = CharStreams.fromFileName(args[0]);

        // Create a lexer using the input
        gemLexer lexer = new gemLexer(input);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser using the token stream
        gemParser parser = new gemParser(tokens);
        
        // Add error handling similar to GemParserTest
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
                System.exit(1);
            }
        });

        // Begin parsing at the 'program' rule
        ParseTree tree = parser.program();

        // Print the parse tree (for simple visualization)
        System.out.println(tree.toStringTree(parser));

        System.out.println("Parsing completed successfully!");
    }
}
