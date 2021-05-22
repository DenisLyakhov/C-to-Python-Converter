grammar C_Grammar;

compilationUnit
    :   (externalDeclaration|assignmentExpression)* EOF
    ;

externalDeclaration : declaration ;


declaration
    :   variableDeclaration
    |   arrayDeclaration
    |   functionDeclaration
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

variableAssignment
    :   Identifier '=' variableInitializer
    ;

arrayAssignment
    :   Identifier '[' expression ']' '=' variableInitializer
    ;

variableInitializer
    :   expression
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
    :   '{' expression (',' expression)* '}'
    ;


expression
    :   '(' expression ')'
    |   Number
    |   Identifier
    |   FloatNumber
    |   Apostrophe (Char|Identifier|Number)? Apostrophe
    |   Quotes (Char|Identifier|Number)? Quotes
    |   unaryExpression
    |   expression unaryOperator expression (unaryOperator expression)*
    ;


unaryExpression
    :
    (('++' |  '--') Identifier) 
    | (Identifier ('++'|'--')) 
    | ('!' Identifier)
    ;

unaryOperator
    :   '||' |'&&' | '*' | '+' | '-' | '/' | '%' | '==' | '>' | '<' | '<=' | '>='
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
    | ifStatement
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

ifStatement 
    :   'if' '(' expression+ ')' statement ('else' statement)? 
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
    :   (('continue'| 'break')
    |   'return' expression?
    )
    ';'
    ;

Apostrophe : '\'';
Quotes : '"';

Whitespace
    :   [ \t\r\n]+ -> skip
    ;