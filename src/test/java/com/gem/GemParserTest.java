package com.gem;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GemParserTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java GemParserTest <Gem source file>");
            System.exit(1);
        }

        String fileName = args[0];
        try {
            String input = new String(Files.readAllBytes(Paths.get(fileName)));

            // Create a CharStream from the input string
            CharStream charStream = CharStreams.fromString(input);

            // Create a lexer
            gemLexer lexer = new gemLexer(charStream);

            // Create a token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser
            gemParser parser = new gemParser(tokens);

            // Error handling
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

            // Parse the program
            ParseTree tree = parser.program();

            // Print success message
            System.out.println("Successfully parsed: " + fileName);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
    }
}
