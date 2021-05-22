# Generated from C_Grammar.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .C_GrammarParser import C_GrammarParser
else:
    from C_GrammarParser import C_GrammarParser

# This class defines a complete listener for a parse tree produced by C_GrammarParser.
class C_GrammarListener(ParseTreeListener):

    # Enter a parse tree produced by C_GrammarParser#compilationUnit.
    def enterCompilationUnit(self, ctx:C_GrammarParser.CompilationUnitContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#compilationUnit.
    def exitCompilationUnit(self, ctx:C_GrammarParser.CompilationUnitContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#externalDeclaration.
    def enterExternalDeclaration(self, ctx:C_GrammarParser.ExternalDeclarationContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#externalDeclaration.
    def exitExternalDeclaration(self, ctx:C_GrammarParser.ExternalDeclarationContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#declaration.
    def enterDeclaration(self, ctx:C_GrammarParser.DeclarationContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#declaration.
    def exitDeclaration(self, ctx:C_GrammarParser.DeclarationContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:C_GrammarParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:C_GrammarParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#functionDeclaration.
    def enterFunctionDeclaration(self, ctx:C_GrammarParser.FunctionDeclarationContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#functionDeclaration.
    def exitFunctionDeclaration(self, ctx:C_GrammarParser.FunctionDeclarationContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#assignmentExpression.
    def enterAssignmentExpression(self, ctx:C_GrammarParser.AssignmentExpressionContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#assignmentExpression.
    def exitAssignmentExpression(self, ctx:C_GrammarParser.AssignmentExpressionContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#variableAssignment.
    def enterVariableAssignment(self, ctx:C_GrammarParser.VariableAssignmentContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#variableAssignment.
    def exitVariableAssignment(self, ctx:C_GrammarParser.VariableAssignmentContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#arrayAssignment.
    def enterArrayAssignment(self, ctx:C_GrammarParser.ArrayAssignmentContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#arrayAssignment.
    def exitArrayAssignment(self, ctx:C_GrammarParser.ArrayAssignmentContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#variableInitializer.
    def enterVariableInitializer(self, ctx:C_GrammarParser.VariableInitializerContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#variableInitializer.
    def exitVariableInitializer(self, ctx:C_GrammarParser.VariableInitializerContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#arrayDeclaration.
    def enterArrayDeclaration(self, ctx:C_GrammarParser.ArrayDeclarationContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#arrayDeclaration.
    def exitArrayDeclaration(self, ctx:C_GrammarParser.ArrayDeclarationContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#arrayProperies.
    def enterArrayProperies(self, ctx:C_GrammarParser.ArrayProperiesContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#arrayProperies.
    def exitArrayProperies(self, ctx:C_GrammarParser.ArrayProperiesContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#arrayInitializer.
    def enterArrayInitializer(self, ctx:C_GrammarParser.ArrayInitializerContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#arrayInitializer.
    def exitArrayInitializer(self, ctx:C_GrammarParser.ArrayInitializerContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#expression.
    def enterExpression(self, ctx:C_GrammarParser.ExpressionContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#expression.
    def exitExpression(self, ctx:C_GrammarParser.ExpressionContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#unaryExpression.
    def enterUnaryExpression(self, ctx:C_GrammarParser.UnaryExpressionContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#unaryExpression.
    def exitUnaryExpression(self, ctx:C_GrammarParser.UnaryExpressionContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#unaryOperator.
    def enterUnaryOperator(self, ctx:C_GrammarParser.UnaryOperatorContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#unaryOperator.
    def exitUnaryOperator(self, ctx:C_GrammarParser.UnaryOperatorContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#typeSpecifier.
    def enterTypeSpecifier(self, ctx:C_GrammarParser.TypeSpecifierContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#typeSpecifier.
    def exitTypeSpecifier(self, ctx:C_GrammarParser.TypeSpecifierContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#statement.
    def enterStatement(self, ctx:C_GrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#statement.
    def exitStatement(self, ctx:C_GrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#compoundStatement.
    def enterCompoundStatement(self, ctx:C_GrammarParser.CompoundStatementContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#compoundStatement.
    def exitCompoundStatement(self, ctx:C_GrammarParser.CompoundStatementContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#blockItem.
    def enterBlockItem(self, ctx:C_GrammarParser.BlockItemContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#blockItem.
    def exitBlockItem(self, ctx:C_GrammarParser.BlockItemContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#ifStatement.
    def enterIfStatement(self, ctx:C_GrammarParser.IfStatementContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#ifStatement.
    def exitIfStatement(self, ctx:C_GrammarParser.IfStatementContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#iterationStatement.
    def enterIterationStatement(self, ctx:C_GrammarParser.IterationStatementContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#iterationStatement.
    def exitIterationStatement(self, ctx:C_GrammarParser.IterationStatementContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#forCondition.
    def enterForCondition(self, ctx:C_GrammarParser.ForConditionContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#forCondition.
    def exitForCondition(self, ctx:C_GrammarParser.ForConditionContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#forDeclaration.
    def enterForDeclaration(self, ctx:C_GrammarParser.ForDeclarationContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#forDeclaration.
    def exitForDeclaration(self, ctx:C_GrammarParser.ForDeclarationContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#forExpression.
    def enterForExpression(self, ctx:C_GrammarParser.ForExpressionContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#forExpression.
    def exitForExpression(self, ctx:C_GrammarParser.ForExpressionContext):
        pass


    # Enter a parse tree produced by C_GrammarParser#jumpStatement.
    def enterJumpStatement(self, ctx:C_GrammarParser.JumpStatementContext):
        pass

    # Exit a parse tree produced by C_GrammarParser#jumpStatement.
    def exitJumpStatement(self, ctx:C_GrammarParser.JumpStatementContext):
        pass


