package com.gem;

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
        // NOTE: This will use the generated lexer class after building
        gemLexer lexer = new gemLexer(input);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser using the token stream
        // NOTE: This will use the generated parser class after building
        gemParser parser = new gemParser(tokens);

        // Begin parsing at the 'program' rule
        ParseTree tree = parser.program();

        // Print the parse tree (for simple visualization)
        System.out.println(tree.toStringTree(parser));

        System.out.println("Parsing completed successfully!");
    }
}
