grammar gem;

program
    : START statement* FINISH EOF
    ;

statement
    : variableDeclaration
    | assignment
    | functionCall
    | ifStatement
    | forLoop
    | whileLoop
    | loopStatement
    | printStatement
    | readStatement
    | functionDefinition
    | structDefinition
    | classDefinition
    | returnStatement
    | breakStatement
    | messageDefinition
    ;

variableDeclaration
    : type ID (ASSIGN expression)?
    ;

assignment
    : lvalue ASSIGN expression
    ;

lvalue
    : ID
    | memberAccess
    | arrayAccess
    ;

ifStatement
    : IF expression THEN statement       // One-line if
    | IF expression block (ELSE IF expression block)* (ELSE block)? END IF
    ;

block
    : statement*
    ;

forLoop
    : FOR ID FROM expression TO expression block END FOR
    ;

whileLoop
    : WHILE expression block END WHILE
    ;

loopStatement
    : LOOP block END LOOP
    ;

printStatement
    : PRINT expression
    ;

readStatement
    : ID ASSIGN READ_LINE LPAREN RPAREN
    | ID ASSIGN READ_INTEGER LPAREN RPAREN
    ;

functionDefinition
    : FUNCTION ID LPAREN parameterList? RPAREN RETURNS type block END FUNCTION
    ;

structDefinition
    : STRUCT ID (EXTENDS ID)? field* END STRUCT
    ;

field
    : type ID
    ;

classDefinition
    : CLASS ID (IS ID)? (field | functionDefinition)* END CLASS
    ;

returnStatement
    : RETURN expression
    ;

breakStatement
    : BREAK
    ;

messageDefinition
    : MESSAGE ID field* END MESSAGE
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : (REF)? type ID
    ;

expression
    : logicalExpression
    ;

logicalExpression
    : comparisonExpression
    ;

comparisonExpression
    : additiveExpression ((LT | GT | LE | GE | EQ | NE) additiveExpression)?
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : primaryExpression ((MULT | DIV) primaryExpression)*
    ;

primaryExpression
    : LPAREN expression RPAREN
    | functionCall
    | messagePassingCall
    | arrayAccess
    | memberAccess
    | REF ID
    | literal
    ;

literal
    : ID
    | INT
    | FLOAT
    | STRING
    | CHAR
    | BOOLEAN
    | arrayLiteral
    ;

messagePassingCall
    : ID ARROW functionCall
    ;

functionCall
    : ID LPAREN expressionList? RPAREN
    ;

expressionList
    : expression (COMMA expression)*
    ;

arrayAccess
    : ID LBRACK expression RBRACK
    ;

memberAccess
    : ID DOT ID (DOT ID)*
    ;

arrayLiteral
    : LBRACK expressionList? RBRACK
    ;

type
    : basicType arrayDimension?
    ;

basicType
    : STRING_TYPE
    | INTEGER_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | CHAR_TYPE
    | ID  // User-defined type
    ;

arrayDimension
    : LBRACK RBRACK
    ;

// Lexer Rules
START : 'start';
FINISH : 'finish';
IF : 'if';
ELSE : 'else';
THEN : 'then';
FOR : 'for';
FROM : 'from';
TO : 'to';
WHILE : 'while';
LOOP : 'loop';
PRINT : 'print';
FUNCTION : 'function';
RETURNS : 'returns';
STRUCT : 'struct';
EXTENDS : 'extends';
CLASS : 'class';
IS : 'is';
END : 'end';
RETURN : 'return';
BREAK : 'break';
MESSAGE : 'message';
REF : 'ref';
READ_LINE : 'read_line';
READ_INTEGER : 'read_integer';

// Types
STRING_TYPE : 'string';
INTEGER_TYPE : 'integer';
NUMBER_TYPE : 'number';
BOOLEAN_TYPE : 'boolean';
CHAR_TYPE : 'char';

// Literals
BOOLEAN : 'yes' | 'no';
ID : [a-zA-Z][a-zA-Z0-9_]*;
INT : '-'?[0-9]+;
FLOAT : '-'?[0-9]+ '.' [0-9]+;
STRING : '"' (~["\r\n])* '"';
CHAR : '\'' . '\'';

// Operators
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
EQ : '==';
NE : '!=';
ASSIGN : '=';
LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';
DOT : '.';
COMMA : ',';
ARROW : '->';

// Skip whitespace and comments
COMMENT : '--' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip;
