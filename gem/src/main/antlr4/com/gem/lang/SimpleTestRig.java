package com.gem.lang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class SimpleTestRig {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleTestRig <filename>");
            return;
        }

        // Create a CharStream from file
        CharStream input = CharStreams.fromFileName(args[0]);

        // Create a lexer using the input
        GemLexer lexer = new GemLexer(input);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser using the token stream
        GemParser parser = new GemParser(tokens);

        // Add error handling
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