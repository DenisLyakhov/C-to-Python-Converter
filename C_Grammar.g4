grammar C_Grammar;

compilationUnit
    :   (externalDeclaration|assignmentExpression|statement)* EOF
    ;

externalDeclaration : declaration ;


declaration
    :   variableDeclaration
    |   arrayDeclaration
    |   functionDeclaration
    |   functionCall ';'
    ;


variableDeclaration
    :   typeSpecifier Identifier ('=' variableInitializer)? ';'
    ;


functionDeclaration
    : typeSpecifier Identifier '(' (typeSpecifier Identifier)? (',' typeSpecifier Identifier)* ')' statement
    ;


assignmentExpression
    :   variableAssignment ';'
    |   arrayAssignment ';'
    |   unaryExpression ';'
    ;

functionCall
    :   Identifier '(' (minusOperator? expression)? (',' minusOperator? expression)* ')'
    ;

variableAssignment
    :   Identifier '=' variableInitializer
    ;

arrayAssignment
    :   Identifier '[' expression ']' '=' variableInitializer
    ;

variableInitializer
    :   minusOperator? expression
    ;

arrayDeclaration
    :   typeSpecifier Identifier ('[' expression? ']')+ ('=' arrayInitializer)? ';'
    ;

arrayProperies
    :   Identifier
    |   Number
    ;

Number
    : Digit+
    ;

arrayInitializer
    :   arraySubInitializer | '{' arraySubInitializer (',' arraySubInitializer)* '}'
    ;

arraySubInitializer
    :   '{' minusOperator? expression (',' minusOperator? expression)* '}'
    ;


expression
    :   '(' minusOperator? expression ')'
    |   Number
    |   Identifier
    |   FloatNumber
    |   Apostrophe (Char|Identifier|Number)? Apostrophe
    |   Quotes (Char|Identifier|Number)? Quotes
    |   unaryExpression
    |   expression (binaryOperator|minusOperator) expression ((binaryOperator|minusOperator) expression)*
    |   functionCall
    ;


unaryExpression
    :
    incrementOperation | decrementOperation | notOperation;

incrementOperation
    :   '++' Identifier | Identifier '++'
    ;

decrementOperation
    :   '--' Identifier | Identifier '--'
    ;

notOperation
    :   '!' Identifier
    ;

minusOperator
    :   '-'
    ;

binaryOperator
    :   '||' |'&&' | '*' | '+' | '/' | '%' | '==' | '>' | '<' | '<=' | '>='
    ;


Identifier
    :   IdentNondigit (IdentDigit | IdentNondigit)*
    ;

Char
    :   Digit | Nondigit;

fragment
IdentNondigit
    : Nondigit
    ;

fragment
IdentDigit
    : Digit
    ;


fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

FloatNumber
    :   IdentDigit+ '.' IdentDigit+
    ;


typeSpecifier
    :   'void'
    |   'char'
    |   'char*'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

statement
    : compoundStatement
    | conditionStatement
    | iterationStatement
    | jumpStatement
    ;

compoundStatement
    : '{' blockItem* '}'
    ;

blockItem
    : statement
    | declaration
    | assignmentExpression
    ;

conditionStatement 
    : ifStatement 
    | ifElseStatement* 
    | elseStatement?
    ;

ifStatement
    : 'if (' minusOperator? expression+ ')' statement
    ;

ifElseStatement
    :   'else if (' minusOperator? expression+ ')' statement   
    ;

elseStatement
    :   'else' statement
    ;

iterationStatement
    :   'while' '(' expression ')' statement
    |   'for' '(' forCondition ')' statement
    ;

forCondition
    :   forDeclaration?  forExpression? ';' unaryExpression? 
    ;

forDeclaration
    :   variableDeclaration | assignmentExpression
    ;

forExpression
    : expression
    ;

jumpStatement
    :   ((continueStatement| breakStatement) | returnStatement) ';'
    ;

returnStatement
    :   'return' (minusOperator? expression)?
    ;

breakStatement
    :   'break'
    ;

continueStatement
    :   'continue'
    ;

Apostrophe : '\'';
Quotes : '"';

Whitespace
    :   [ \t\r\n]+ -> skip
    ;
