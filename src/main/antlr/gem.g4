grammar gem;

// Lexer Rules (Tokens)
START: 'start';
FINISH: 'finish';
IF: 'if';
ELSE: 'else';
THEN: 'then';
END: 'end';
FOR: 'for';
FROM: 'from';
TO: 'to';
WHILE: 'while';
LOOP: 'loop';
BREAK: 'break';
FUNCTION: 'function';
RETURNS: 'returns';
STRUCT: 'struct';
EXTENDS: 'extends';
CLASS: 'class';
IS: 'is';
IS_MESSAGE: 'message'; // Changed from MESSAGE to IS_MESSAGE for clarity
REF: 'ref';
PRINT: 'print';
RETURN: 'return';
INTEGER_TYPE: 'integer';
NUMBER_TYPE: 'number';
STRING_TYPE: 'string';
BOOLEAN_TYPE: 'boolean';
CHAR_TYPE: 'char';
AND: 'and';
OR: 'or';

// Operators
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
NEQ: '!=';
ARROW: '->';
DOT: '.';
ASSIGN: '=';

// Punctuation
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
COMMA: ',';

BOOLEAN_LITERAL: 'yes' | 'no';

// Identifier and built-in function names - make sure ID comes before comment rules
ID: [a-zA-Z][a-zA-Z0-9_]*;

// Literals
INTEGER_LITERAL: '-'? [0-9]+;
FLOAT_LITERAL: '-'? [0-9]+ '.' [0-9]+;
STRING_LITERAL: '"' (~["\r\n] | '""')* '"';
CHAR_LITERAL: '\'' (~['\r\n] | '\'\'') '\'';


// Comments
COMMENT: '--' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '--[' .*? ']--' -> skip;

NEWLINE: [\r\n]+ -> skip;
WS: [ \t]+ -> skip;

// Parser Rules
program
    : declaration* START statement* FINISH
    ;

declaration
    : structDeclaration
    | classDeclaration
    | functionDeclaration
    ;

statement
    : variableDeclaration
    | assignment
    | ifStatement
    | forLoop
    | whileLoop
    | loop
    | functionCall
    | innerFunctionDeclaration
    | printStatement
    | readStatement
    | returnStatement
    | breakStatement
    | expression
    ;

innerFunctionDeclaration
    : FUNCTION ID LPAREN parameterList? RPAREN (RETURNS type)? statement* END FUNCTION
    ;

variableDeclaration
    : type ID (ASSIGN expression)?
    | struct_type ID
    | class_type ID
    ;

type
    : INTEGER_TYPE
    | NUMBER_TYPE
    | STRING_TYPE
    | BOOLEAN_TYPE
    | CHAR_TYPE
    | type LBRACK RBRACK  // Array type
    | ID                  // Custom type
    ;

struct_type
    : ID
    ;

class_type
    : ID
    ;

assignment
    : ID ASSIGN expression
    | ID DOT ID ASSIGN expression  // Struct/class field assignment
    | ID LBRACK expression RBRACK ASSIGN expression  // Array assignment
    ;

ifStatement
    : IF expression statement* (ELSE IF expression statement*)* (ELSE statement*)? END IF
    | IF expression THEN statement (ELSE statement)?  // Single line conditional
    ;

forLoop
    : FOR ID FROM expression TO expression statement* END FOR
    ;

whileLoop
    : WHILE expression statement* END WHILE
    ;

loop
    : LOOP statement* END LOOP
    ;

functionDeclaration
    : FUNCTION ID LPAREN parameterList? RPAREN (RETURNS type)? statement* END FUNCTION
    ;

structDeclaration
    : STRUCT ID (EXTENDS ID)? (IS IS_MESSAGE)? field* END STRUCT
    ;

field
    : type ID
    ;

classDeclaration
    : CLASS ID (IS ID)? (field | functionDeclaration)* END CLASS
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : (REF)? type ID
    ;

functionCall
    : ID LPAREN argumentList? RPAREN
    | ID DOT ID LPAREN argumentList? RPAREN  // Method call
    | ID ARROW ID LPAREN argumentList? RPAREN // Message passing (for structs marked as messages)
    ;

argumentList
    : argument (COMMA argument)*
    ;

argument
    : (REF)? expression
    ;

printStatement
    : PRINT expression
    ;

readStatement
    : ID LPAREN RPAREN  // Generic function call for read_line or read_integer
    ;

returnStatement
    : RETURN expression
    ;

breakStatement
    : BREAK
    ;

expression
    : logicalExpression
    ;

logicalExpression
    : comparisonExpression ((AND | OR) comparisonExpression)*
    ;

comparisonExpression
    : additiveExpression ((LT | GT | LE | GE | EQ | NEQ) additiveExpression)?
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : messageExpression ((MULT | DIV | MOD) messageExpression)*
    ;

messageExpression
    : primaryExpression
    | primaryExpression ARROW ID LPAREN argumentList? RPAREN // Message passing
    | primaryExpression DOT ID LPAREN argumentList? RPAREN  // Method call
    | primaryExpression DOT ID                      // Property access
    | primaryExpression LBRACK expression RBRACK    // Array access
    ;

message_type
    : ID
    ;

primaryExpression
    : ID                                        // Simple identifier
    | literal                                   // Literal value
    | LPAREN expression RPAREN                  // Parenthesized expression
    | ID LPAREN argumentList? RPAREN            // Function call (including 'read_line', 'read_integer', 'uppercase', 'split', 'length')
    ;

literal
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | BOOLEAN_LITERAL
    | arrayLiteral
    ;

arrayLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK
    ;