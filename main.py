from antlr4 import *
from C_GrammarLexer import C_GrammarLexer
from C_GrammarListener import C_GrammarListener
from C_GrammarParser import C_GrammarParser
import sys

class C_GrammarPrintListener(C_GrammarListener):

	def showExternalDeclarations(self, ctx):
		variables = []
		arrays = [];
		
		for i in range(len(ctx.externalDeclaration())):
			if(ctx.externalDeclaration()[i].declaration().variableDeclaration()):
				variables.append(ctx.externalDeclaration()[i].declaration().variableDeclaration())
			elif(ctx.externalDeclaration()[i].declaration().arrayDeclaration()):
				arrays.append(ctx.externalDeclaration()[i].declaration().arrayDeclaration())

		for var in variables:
			print('\n\nDeclared variables: ')
			print('Identifier: ' + str(var.Identifier()))
			print('Type: ' + var.typeSpecifier().getText())
			if(var.variableInitializer()):
				print('Value: ' + str(var.variableInitializer().getText()))
			print()

		for arr in arrays:
			print('\n\nDeclared arrays: ')
			print('Identifier: ' + str(arr.Identifier()))
			print('Size: '+ arr.expression().getText())
			print('Type: ' + arr.typeSpecifier().getText())
			if(arr.arrayInitializer()):
				print('Value: ' + str(arr.arrayInitializer().getText()))
			print()

	def showAssignmentExpressions(self, assignments):
		varAssignments = []
		arrayAssignments = []
		unaryExpressions = []

		for item in assignments:
			if(item.variableAssignment()):
				varAssignments.append(item.variableAssignment())
			elif(item.arrayAssignment()):
				arrayAssignments.append(item.arrayAssignment())
			elif(item.unaryExpression()):
				arrayAssignments.append(item.unaryExpression())

		print('\n\nVariable Assignments: ')
		for var in varAssignments:
			print('Identifier: ' + var.Identifier().getText())
			print('New value: ' + var.variableInitializer().getText())

		print('\n\nArray Assignments: ')
		for arrVar in arrayAssignments:
			print('Identifier: ' + arrVar.Identifier().getText())
			print('Index: [' + arrVar.expression().getText() + ']')
			print('New value: ' + arrVar.variableInitializer().getText())

	def enterCompilationUnit(self, ctx):

		print('hello')
		
		#self.showExternalDeclarations(ctx);

		#self.showAssignmentExpressions(ctx.assignmentExpression())

def main():	
	print('Input: ')
	lexer = C_GrammarLexer(StdinStream())
	stream = CommonTokenStream(lexer)
	parser = C_GrammarParser(stream)
	tree = parser.compilationUnit()
	printer = C_GrammarPrintListener()
	walker = ParseTreeWalker()
	walker.walk(printer, tree)

main()
