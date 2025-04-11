package com.gem;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GemGrammarTest {
    private List<String> exampleFiles;
    
    @Before
    public void setup() {
        // Find all .gem files in the resources directory
        try {
            Path resourcesPath = Paths.get("src/main/resources");
            exampleFiles = Files.walk(resourcesPath)
                .filter(path -> path.toString().endsWith(".gem"))
                .map(Path::toString)
                .collect(Collectors.toList());
        } catch (IOException e) {
            fail("Failed to read example files: " + e.getMessage());
        }
        
        // Make sure we found at least one example file
        assertFalse("No example files found", exampleFiles.isEmpty());
    }
    
    @Test
    public void testParseExampleFiles() {
        for (String path : exampleFiles) {
            parseFile(path);
        }
    }
    
    private void parseFile(String path) {
        try {
            // Read the file content
            String input = new String(Files.readAllBytes(Paths.get(path)));
            
            // Create a CharStream from the input
            CharStream charStream = CharStreams.fromString(input);
            
            // Create a lexer
            gemLexer lexer = new gemLexer(charStream);
            
            // Create a token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Create a parser
            gemParser parser = new gemParser(tokens);
            
            // Track errors
            final boolean[] hasError = {false};
            
            // Add custom error listener
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg, RecognitionException e) {
                    System.err.println(path + ":" + line + ":" + charPositionInLine + ": " + msg);
                    hasError[0] = true;
                }
            });
            
            // Parse the program
            ParseTree tree = parser.program();
            
            // Assert no errors occurred
            assertFalse("Parsing failed for " + path, hasError[0]);
            
        } catch (IOException e) {
            fail("Failed to read file " + path + ": " + e.getMessage());
        }
    }
}