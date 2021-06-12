from antlr4 import *
from C_GrammarLexer import C_GrammarLexer
from C_GrammarListener import C_GrammarListener
from C_GrammarParser import C_GrammarParser
import sys

class C_GrammarPrintListener(C_GrammarListener):

	# Conversion result
	convertedString = ""
	# NOT USED
	def showExternalDeclarations(self, ctx):
		variables = []
		arrays = [];
		
		for i in range(len(ctx.externalDeclaration())):
			if(ctx.externalDeclaration()[i].declaration().variableDeclaration()):
				#print('Var Index = ' + str(ctx.externalDeclaration()[i].declaration().variableDeclaration().getRuleIndex()))
				variables.append(ctx.externalDeclaration()[i].declaration().variableDeclaration())
			elif(ctx.externalDeclaration()[i].declaration().arrayDeclaration()):
				#print('Arr Index = ' + str(ctx.externalDeclaration()[i].declaration().arrayDeclaration().getRuleIndex()))
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
			#print('Size: '+ arr.expression().getText())
			print('Type: ' + arr.typeSpecifier().getText())
			if(arr.arrayInitializer()):
				print('Value: ' + str(arr.arrayInitializer().getText()))
			print()
	# NOT USED
	def showAssignmentExpressions(self, assignments):
		varAssignments = []
		arrayAssignments = []
		unaryExpressions = []

		for item in assignments:
			print('Assignment Index = ' + str(item.getRuleIndex()))
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

	def convertFunctionDeclaration(self, ctx, level):

		# Extracting function name
		funcName = ctx.Identifier()[0].getText()
		parameters = ""

		# Extracting parameters (first Identifier - funcName, others - parameters)
		if(len(ctx.Identifier()) > 1):
			parameters = ctx.Identifier()[1].getText()
			for i in range(2, len(ctx.Identifier())):
				parameters += ", " + ctx.Identifier()[i].getText()

		# Making "type functionName(type var, ...):" string
		self.convertedString += self.getTabs(level) + "def " + funcName + "(" + parameters + "):\n"

		# Increase level of indendation
		return level + 1
	def convertIfStatement(self, ctx, level):
		condition = ctx.expression()[0].getText()
		self.convertedString += self.getTabs(level) + "if (" + condition + "):\n"
		if len(ctx.statement()) >= 2:
			self.convertedString += self.getTabs(level) + "else:\n"
		return level + 1
			
	# iteration statements for, while
	def convertIterationStatement(self, ctx, level):
		resConditionString = ''
		if (ctx.forCondition()):
			conditions = ctx.forCondition().forExpression().expression().expression()
			numLess = ctx.forCondition().forDeclaration().variableDeclaration().variableInitializer().getText()
			letter = conditions[0].getText()
			numMore = conditions[1].getText()
			if (numLess == '0'):
				rangeNums = numMore
			else:
				rangeNums = numLess + ', ' + numMore
			resConditionString = letter + ' in range (' + rangeNums + ')'
			self.convertedString += self.getTabs(level) + "for " + resConditionString + ":\n"
		elif (ctx.expression()):
			condition = ctx.expression().getText()
			self.convertedString += self.getTabs(level) + "while " + condition + ":\n"
		return level + 1

	def convertReturnStatement(self, ctx, level):
		# return 'expression'
		self.convertedString += self.getTabs(level) + ctx.getText() + '\n'

	def convertFunctionCall(self, ctx, level):
		# functionName(arg1, arg2, ...)
		# self.convertedString += self.getTabs(level) + ctx.Identifier().getText() + "("

		# numOfExpressions = len(ctx.expression())

		# if(numOfExpressions >= 1):
		# 	self.convertedString += ctx.expression()[0].getText()
		# 	if(numOfExpressions > 1):
		# 		for i in range(1, numOfExpressions):
		# 			self.convertedString += ", " + ctx.expression()[i].getText()

		# self.convertedString += ")\n"

		self.convertedString += ctx.getText();


	def convertVariableDeclaration(self, ctx, level):

		# type var = 
		self.convertedString += self.getTabs(level) + ctx.Identifier().getText() + ' = '

		if (ctx.variableInitializer() is not None):

			if(ctx.variableInitializer().minusOperator() is not None):
				self.convertedString += '-'

			# type var = 'expression'
			self.convertedString += ctx.variableInitializer().expression().getText()
		else:
			# type var = None
			self.convertedString += "None"

		self.convertedString += '\n'

	def convertArrayDeclaration(self, ctx, level):

		# type arr = [
		self.convertedString += self.getTabs(level) + ctx.Identifier().getText() + ' = '

		# # If array was initialized with variables
		# if(ctx.arrayInitializer() is not None):

		# 	if(len(ctx.arrayInitializer().arraySubInitializer()) == 1):
		# 		self.convertedString += ctx.arrayInitializer().arraySubInitializer()[0].expression()[0].getText()
		# 		for i in range(1, len(ctx.arrayInitializer().arraySubInitializer()[0].expression())):
		# 			self.convertedString += ', ' + ctx.arrayInitializer().arraySubInitializer()[0].expression()[i].getText()
		# 	else:
		# 		#if(len(ctx.arrayInitializer().arraySubInitializer()) == 1 and ctx.arrayInitializer().arraySubInitializer()[0].expression() is not None):
		# 		for k in range(len(ctx.arrayInitializer().arraySubInitializer())):

		# 			# Extracting first variable: type arr = [var1
		# 			self.convertedString += '[' + ctx.arrayInitializer().arraySubInitializer()[k].expression()[0].getText()

		# 			# In case there're multiple variables: type arr = [var1, var2, var3, ...
		# 			for i in range(1, len(ctx.arrayInitializer().arraySubInitializer()[k].expression())):
		# 				self.convertedString += ', ' + ctx.arrayInitializer().arraySubInitializer()[k].expression()[i].getText()

		# 			self.convertedString += ']'

		arrayDeclarationStr = ctx.arrayInitializer().getText();
		arrayDeclarationStr = arrayDeclarationStr.replace('{','[');
		arrayDeclarationStr = arrayDeclarationStr.replace('}',']');

		self.convertedString += arrayDeclarationStr + '\n';

	def convertAssignmentExpression(self, ctx, level):

		# Currently we're at assignmentExpression rule, we need to get
		# a child from context in order to get assignment type (variableAssignment, arrayAssignment or unaryExpression)
		assignmentCtx = ctx.getChild(0)
		assignmentCtxRuleName = C_GrammarParser.ruleNames[assignmentCtx.getRuleIndex()]

		# Choosing appropriate action for the correct assignment
		if (ctx.variableAssignment() is not None):
			self.convertedString += ctx.variableAssignment().getText()

		elif (ctx.arrayAssignment() is not None):
			self.convertedString += ctx.arrayAssignment().getText()

		elif (C_GrammarParser.ruleNames[assignmentCtx.getChild(0).getRuleIndex()] == "incrementOperation"):
			self.convertedString += assignmentCtx.getChild(0).Identifier().getText() + " += 1"

		elif(C_GrammarParser.ruleNames[assignmentCtx.getChild(0).getRuleIndex()] == "decrementOperation"):
			self.convertedString += assignmentCtx.getChild(0).Identifier().getText() + " -= 1"

		self.convertedString += '\n'

	def convertDeclaration(self, ctx, level):
		childCtx = ctx.getChild(0)
		childCtxRuleName = str(C_GrammarParser.ruleNames[childCtx.getRuleIndex()])
		self.convertedString += self.getTabs(level)
		if(childCtxRuleName == "functionDeclaration"):
			level = self.convertFunctionDeclaration(childCtx, level)
		elif(childCtxRuleName == "variableDeclaration"):
			self.convertVariableDeclaration(childCtx, level)
		elif(childCtxRuleName == "arrayDeclaration"):
			self.convertArrayDeclaration(childCtx, level)
		elif(childCtxRuleName == "functionCall"):
			self.convertFunctionCall(childCtx, level)
		elif(childCtxRuleName == "ifStatement"):
			level = self.convertIfStatement(childCtx, level)
		elif(childCtxRuleName == "iterationStatement"):
			level = self.convertIterationStatement(childCtx, level)
		return level

	def getTabs(self, level):
		tabs = ""
		for i in range(level):
			tabs += "    "
		return tabs

	def explore(self, ctx, level, indentation):
		ruleName = str(C_GrammarParser.ruleNames[ctx.getRuleIndex()])

		for i in range(indentation):
			print("    ", end = '')

		print(ruleName + ": " + ctx.getText())

		if(ruleName == "declaration" or ruleName == "statement"):
			level = self.convertDeclaration(ctx, level)
		elif(ruleName == "returnStatement"):
			self.convertReturnStatement(ctx, level)

		elif(ruleName == "assignmentExpression"):
			self.convertAssignmentExpression(ctx, level)

		for i in range(ctx.getChildCount()):
			element = ctx.getChild(i)
			if (isinstance(element, RuleContext)):
				self.explore(element, level, indentation + 1)

	def enterCompilationUnit(self, ctx):

		self.explore(ctx, 0, 0)

		print("\n\n-----------------------------------\nConversion result:")
		print(self.convertedString)
		
		#self.showExternalDeclarations(ctx);
		#self.showAssignmentExpressions(ctx.assignmentExpression())

# INPUT EXAMPLE:

# int x = 1;
# int f1(int a, int b){
# 	return a+b;
# }
# int y = 2;
# int func(int c, int d){
# 	return f1(c, d);
# }
# func(x, y);



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
