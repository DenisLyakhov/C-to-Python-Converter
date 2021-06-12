// Generated from d:\AGH\Semestr_6\kompilatory\1\C-to-Python-Converter\C_Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C_GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, Number=41, Identifier=42, Char=43, FloatNumber=44, 
		Apostrophe=45, Quotes=46, Whitespace=47;
	public static final int
		RULE_compilationUnit = 0, RULE_externalDeclaration = 1, RULE_declaration = 2, 
		RULE_variableDeclaration = 3, RULE_functionDeclaration = 4, RULE_assignmentExpression = 5, 
		RULE_functionCall = 6, RULE_variableAssignment = 7, RULE_arrayAssignment = 8, 
		RULE_variableInitializer = 9, RULE_arrayDeclaration = 10, RULE_arrayProperies = 11, 
		RULE_arrayInitializer = 12, RULE_arraySubInitializer = 13, RULE_expression = 14, 
		RULE_unaryExpression = 15, RULE_incrementOperation = 16, RULE_decrementOperation = 17, 
		RULE_notOperation = 18, RULE_minusOperator = 19, RULE_binaryOperator = 20, 
		RULE_typeSpecifier = 21, RULE_statement = 22, RULE_compoundStatement = 23, 
		RULE_blockItem = 24, RULE_conditionStatement = 25, RULE_ifStatement = 26, 
		RULE_ifElseStatement = 27, RULE_elseStatement = 28, RULE_iterationStatement = 29, 
		RULE_forCondition = 30, RULE_forDeclaration = 31, RULE_forExpression = 32, 
		RULE_jumpStatement = 33, RULE_returnStatement = 34, RULE_breakStatement = 35, 
		RULE_continueStatement = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "externalDeclaration", "declaration", "variableDeclaration", 
			"functionDeclaration", "assignmentExpression", "functionCall", "variableAssignment", 
			"arrayAssignment", "variableInitializer", "arrayDeclaration", "arrayProperies", 
			"arrayInitializer", "arraySubInitializer", "expression", "unaryExpression", 
			"incrementOperation", "decrementOperation", "notOperation", "minusOperator", 
			"binaryOperator", "typeSpecifier", "statement", "compoundStatement", 
			"blockItem", "conditionStatement", "ifStatement", "ifElseStatement", 
			"elseStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "returnStatement", "breakStatement", 
			"continueStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "','", "')'", "'['", "']'", "'{'", "'}'", 
			"'++'", "'--'", "'!'", "'-'", "'||'", "'&&'", "'*'", "'+'", "'/'", "'%'", 
			"'=='", "'>'", "'<'", "'<='", "'>='", "'void'", "'char'", "'char*'", 
			"'short'", "'int'", "'long'", "'float'", "'double'", "'if ('", "'else if ('", 
			"'else'", "'while'", "'for'", "'return'", "'break'", "'continue'", null, 
			null, null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Number", "Identifier", "Char", "FloatNumber", 
			"Apostrophe", "Quotes", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C_Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C_GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(C_GrammarParser.EOF, 0); }
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << Identifier))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					externalDeclaration();
					}
					break;
				case 2:
					{
					setState(75);
					assignmentExpression();
					}
					break;
				case 3:
					{
					setState(76);
					statement();
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_externalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				functionCall();
				setState(90);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			typeSpecifier();
			setState(95);
			match(Identifier);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(96);
				match(T__1);
				setState(97);
				variableInitializer();
				}
			}

			setState(100);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(C_GrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(C_GrammarParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			typeSpecifier();
			setState(103);
			match(Identifier);
			setState(104);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(105);
				typeSpecifier();
				setState(106);
				match(Identifier);
				}
			}

			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(110);
				match(T__3);
				setState(111);
				typeSpecifier();
				setState(112);
				match(Identifier);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__4);
			setState(120);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExpression);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				variableAssignment();
				setState(123);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				arrayAssignment();
				setState(126);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				unaryExpression();
				setState(129);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MinusOperatorContext> minusOperator() {
			return getRuleContexts(MinusOperatorContext.class);
		}
		public MinusOperatorContext minusOperator(int i) {
			return getRuleContext(MinusOperatorContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Identifier);
			setState(134);
			match(T__2);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Number) | (1L << Identifier) | (1L << FloatNumber) | (1L << Apostrophe) | (1L << Quotes))) != 0)) {
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(135);
					minusOperator();
					}
				}

				setState(138);
				expression(0);
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(141);
				match(T__3);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(142);
					minusOperator();
					}
				}

				setState(145);
				expression(0);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Identifier);
			setState(154);
			match(T__1);
			setState(155);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Identifier);
			setState(158);
			match(T__5);
			setState(159);
			expression(0);
			setState(160);
			match(T__6);
			setState(161);
			match(T__1);
			setState(162);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusOperatorContext minusOperator() {
			return getRuleContext(MinusOperatorContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(164);
				minusOperator();
				}
			}

			setState(167);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			typeSpecifier();
			setState(170);
			match(Identifier);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				match(T__5);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Number) | (1L << Identifier) | (1L << FloatNumber) | (1L << Apostrophe) | (1L << Quotes))) != 0)) {
					{
					setState(172);
					expression(0);
					}
				}

				setState(175);
				match(T__6);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(180);
				match(T__1);
				setState(181);
				arrayInitializer();
				}
			}

			setState(184);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayProperiesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public TerminalNode Number() { return getToken(C_GrammarParser.Number, 0); }
		public ArrayProperiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayProperies; }
	}

	public final ArrayProperiesContext arrayProperies() throws RecognitionException {
		ArrayProperiesContext _localctx = new ArrayProperiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayProperies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ArraySubInitializerContext> arraySubInitializer() {
			return getRuleContexts(ArraySubInitializerContext.class);
		}
		public ArraySubInitializerContext arraySubInitializer(int i) {
			return getRuleContext(ArraySubInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayInitializer);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				arraySubInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__7);
				setState(190);
				arraySubInitializer();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(191);
					match(T__3);
					setState(192);
					arraySubInitializer();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraySubInitializerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MinusOperatorContext> minusOperator() {
			return getRuleContexts(MinusOperatorContext.class);
		}
		public MinusOperatorContext minusOperator(int i) {
			return getRuleContext(MinusOperatorContext.class,i);
		}
		public ArraySubInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySubInitializer; }
	}

	public final ArraySubInitializerContext arraySubInitializer() throws RecognitionException {
		ArraySubInitializerContext _localctx = new ArraySubInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arraySubInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__7);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(203);
				minusOperator();
				}
			}

			setState(206);
			expression(0);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(207);
				match(T__3);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(208);
					minusOperator();
					}
				}

				setState(211);
				expression(0);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MinusOperatorContext> minusOperator() {
			return getRuleContexts(MinusOperatorContext.class);
		}
		public MinusOperatorContext minusOperator(int i) {
			return getRuleContext(MinusOperatorContext.class,i);
		}
		public TerminalNode Number() { return getToken(C_GrammarParser.Number, 0); }
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public TerminalNode FloatNumber() { return getToken(C_GrammarParser.FloatNumber, 0); }
		public List<TerminalNode> Apostrophe() { return getTokens(C_GrammarParser.Apostrophe); }
		public TerminalNode Apostrophe(int i) {
			return getToken(C_GrammarParser.Apostrophe, i);
		}
		public TerminalNode Char() { return getToken(C_GrammarParser.Char, 0); }
		public List<TerminalNode> Quotes() { return getTokens(C_GrammarParser.Quotes); }
		public TerminalNode Quotes(int i) {
			return getToken(C_GrammarParser.Quotes, i);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<BinaryOperatorContext> binaryOperator() {
			return getRuleContexts(BinaryOperatorContext.class);
		}
		public BinaryOperatorContext binaryOperator(int i) {
			return getRuleContext(BinaryOperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(220);
				match(T__2);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(221);
					minusOperator();
					}
				}

				setState(224);
				expression(0);
				setState(225);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(227);
				match(Number);
				}
				break;
			case 3:
				{
				setState(228);
				match(Identifier);
				}
				break;
			case 4:
				{
				setState(229);
				match(FloatNumber);
				}
				break;
			case 5:
				{
				setState(230);
				match(Apostrophe);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << Identifier) | (1L << Char))) != 0)) {
					{
					setState(231);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << Identifier) | (1L << Char))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(234);
				match(Apostrophe);
				}
				break;
			case 6:
				{
				setState(235);
				match(Quotes);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << Identifier) | (1L << Char))) != 0)) {
					{
					setState(236);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << Identifier) | (1L << Char))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(239);
				match(Quotes);
				}
				break;
			case 7:
				{
				setState(240);
				unaryExpression();
				}
				break;
			case 8:
				{
				setState(241);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(244);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(247);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
						{
						setState(245);
						binaryOperator();
						}
						break;
					case T__12:
						{
						setState(246);
						minusOperator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(249);
					expression(0);
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(252);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case T__13:
							case T__14:
							case T__15:
							case T__16:
							case T__17:
							case T__18:
							case T__19:
							case T__20:
							case T__21:
							case T__22:
							case T__23:
								{
								setState(250);
								binaryOperator();
								}
								break;
							case T__12:
								{
								setState(251);
								minusOperator();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(254);
							expression(0);
							}
							} 
						}
						setState(260);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public IncrementOperationContext incrementOperation() {
			return getRuleContext(IncrementOperationContext.class,0);
		}
		public DecrementOperationContext decrementOperation() {
			return getRuleContext(DecrementOperationContext.class,0);
		}
		public NotOperationContext notOperation() {
			return getRuleContext(NotOperationContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryExpression);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				incrementOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				decrementOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				notOperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementOperationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public IncrementOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementOperation; }
	}

	public final IncrementOperationContext incrementOperation() throws RecognitionException {
		IncrementOperationContext _localctx = new IncrementOperationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_incrementOperation);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__9);
				setState(272);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Identifier);
				setState(274);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecrementOperationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public DecrementOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementOperation; }
	}

	public final DecrementOperationContext decrementOperation() throws RecognitionException {
		DecrementOperationContext _localctx = new DecrementOperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decrementOperation);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__10);
				setState(278);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(Identifier);
				setState(280);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOperationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C_GrammarParser.Identifier, 0); }
		public NotOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperation; }
	}

	public final NotOperationContext notOperation() throws RecognitionException {
		NotOperationContext _localctx = new NotOperationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_notOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__11);
			setState(284);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusOperatorContext extends ParserRuleContext {
		public MinusOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusOperator; }
	}

	public final MinusOperatorContext minusOperator() throws RecognitionException {
		MinusOperatorContext _localctx = new MinusOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_minusOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				compoundStatement();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				conditionStatement();
				}
				break;
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				iterationStatement();
				}
				break;
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				jumpStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__7);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << Identifier))) != 0)) {
				{
				{
				setState(299);
				blockItem();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockItem);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<IfElseStatementContext> ifElseStatement() {
			return getRuleContexts(IfElseStatementContext.class);
		}
		public IfElseStatementContext ifElseStatement(int i) {
			return getRuleContext(IfElseStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			ifStatement();
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					ifElseStatement();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(319);
				elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MinusOperatorContext minusOperator() {
			return getRuleContext(MinusOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__32);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(323);
				minusOperator();
				}
			}

			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				expression(0);
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Number) | (1L << Identifier) | (1L << FloatNumber) | (1L << Apostrophe) | (1L << Quotes))) != 0) );
			setState(331);
			match(T__4);
			setState(332);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MinusOperatorContext minusOperator() {
			return getRuleContext(MinusOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifElseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__33);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(335);
				minusOperator();
				}
			}

			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				expression(0);
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Number) | (1L << Identifier) | (1L << FloatNumber) | (1L << Apostrophe) | (1L << Quotes))) != 0) );
			setState(343);
			match(T__4);
			setState(344);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__34);
			setState(347);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_iterationStatement);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(T__35);
				setState(350);
				match(T__2);
				setState(351);
				expression(0);
				setState(352);
				match(T__4);
				setState(353);
				statement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__36);
				setState(356);
				match(T__2);
				setState(357);
				forCondition();
				setState(358);
				match(T__4);
				setState(359);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(363);
				forDeclaration();
				}
				break;
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Number) | (1L << Identifier) | (1L << FloatNumber) | (1L << Apostrophe) | (1L << Quotes))) != 0)) {
				{
				setState(366);
				forExpression();
				}
			}

			setState(369);
			match(T__0);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Identifier))) != 0)) {
				{
				setState(370);
				unaryExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forDeclaration);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				variableDeclaration();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
			case T__39:
				{
				setState(381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__39:
					{
					setState(379);
					continueStatement();
					}
					break;
				case T__38:
					{
					setState(380);
					breakStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__37:
				{
				setState(383);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusOperatorContext minusOperator() {
			return getRuleContext(MinusOperatorContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__37);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Number) | (1L << Identifier) | (1L << FloatNumber) | (1L << Apostrophe) | (1L << Quotes))) != 0)) {
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(389);
					minusOperator();
					}
				}

				setState(392);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0192\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\5"+
		"\5e\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\3\6\7\6u"+
		"\n\6\f\6\16\6x\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0086\n\7\3\b\3\b\3\b\5\b\u008b\n\b\3\b\5\b\u008e\n\b\3\b\3\b\5\b\u0092"+
		"\n\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13\u00a8\n\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\5\f\u00b0\n\f\3\f\6\f\u00b3\n\f\r\f\16\f\u00b4\3\f\3\f\5\f\u00b9\n"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00c4\n\16\f\16\16\16"+
		"\u00c7\13\16\3\16\3\16\5\16\u00cb\n\16\3\17\3\17\5\17\u00cf\n\17\3\17"+
		"\3\17\3\17\5\17\u00d4\n\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\5\20\u00e1\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00eb\n\20\3\20\3\20\3\20\5\20\u00f0\n\20\3\20\3\20\3"+
		"\20\5\20\u00f5\n\20\3\20\3\20\3\20\5\20\u00fa\n\20\3\20\3\20\3\20\5\20"+
		"\u00ff\n\20\3\20\3\20\7\20\u0103\n\20\f\20\16\20\u0106\13\20\7\20\u0108"+
		"\n\20\f\20\16\20\u010b\13\20\3\21\3\21\3\21\5\21\u0110\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u0116\n\22\3\23\3\23\3\23\3\23\5\23\u011c\n\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u012b"+
		"\n\30\3\31\3\31\7\31\u012f\n\31\f\31\16\31\u0132\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\5\32\u0139\n\32\3\33\3\33\7\33\u013d\n\33\f\33\16\33\u0140"+
		"\13\33\3\33\5\33\u0143\n\33\3\34\3\34\5\34\u0147\n\34\3\34\6\34\u014a"+
		"\n\34\r\34\16\34\u014b\3\34\3\34\3\34\3\35\3\35\5\35\u0153\n\35\3\35\6"+
		"\35\u0156\n\35\r\35\16\35\u0157\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016c\n\37\3 "+
		"\5 \u016f\n \3 \5 \u0172\n \3 \3 \5 \u0176\n \3!\3!\5!\u017a\n!\3\"\3"+
		"\"\3#\3#\5#\u0180\n#\3#\5#\u0183\n#\3#\3#\3$\3$\5$\u0189\n$\3$\5$\u018c"+
		"\n$\3%\3%\3&\3&\3&\2\3\36\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2+,\3\2+-\3\2\20\32\3\2\33\"\2\u01ab"+
		"\2Q\3\2\2\2\4V\3\2\2\2\6^\3\2\2\2\b`\3\2\2\2\nh\3\2\2\2\f\u0085\3\2\2"+
		"\2\16\u0087\3\2\2\2\20\u009b\3\2\2\2\22\u009f\3\2\2\2\24\u00a7\3\2\2\2"+
		"\26\u00ab\3\2\2\2\30\u00bc\3\2\2\2\32\u00ca\3\2\2\2\34\u00cc\3\2\2\2\36"+
		"\u00f4\3\2\2\2 \u010f\3\2\2\2\"\u0115\3\2\2\2$\u011b\3\2\2\2&\u011d\3"+
		"\2\2\2(\u0120\3\2\2\2*\u0122\3\2\2\2,\u0124\3\2\2\2.\u012a\3\2\2\2\60"+
		"\u012c\3\2\2\2\62\u0138\3\2\2\2\64\u013a\3\2\2\2\66\u0144\3\2\2\28\u0150"+
		"\3\2\2\2:\u015c\3\2\2\2<\u016b\3\2\2\2>\u016e\3\2\2\2@\u0179\3\2\2\2B"+
		"\u017b\3\2\2\2D\u0182\3\2\2\2F\u0186\3\2\2\2H\u018d\3\2\2\2J\u018f\3\2"+
		"\2\2LP\5\4\3\2MP\5\f\7\2NP\5.\30\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\2\2\3U\3\3\2\2\2VW\5"+
		"\6\4\2W\5\3\2\2\2X_\5\b\5\2Y_\5\26\f\2Z_\5\n\6\2[\\\5\16\b\2\\]\7\3\2"+
		"\2]_\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2_\7\3\2\2\2`a\5,\27"+
		"\2ad\7,\2\2bc\7\4\2\2ce\5\24\13\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\3"+
		"\2\2g\t\3\2\2\2hi\5,\27\2ij\7,\2\2jn\7\5\2\2kl\5,\27\2lm\7,\2\2mo\3\2"+
		"\2\2nk\3\2\2\2no\3\2\2\2ov\3\2\2\2pq\7\6\2\2qr\5,\27\2rs\7,\2\2su\3\2"+
		"\2\2tp\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\7"+
		"\2\2z{\5.\30\2{\13\3\2\2\2|}\5\20\t\2}~\7\3\2\2~\u0086\3\2\2\2\177\u0080"+
		"\5\22\n\2\u0080\u0081\7\3\2\2\u0081\u0086\3\2\2\2\u0082\u0083\5 \21\2"+
		"\u0083\u0084\7\3\2\2\u0084\u0086\3\2\2\2\u0085|\3\2\2\2\u0085\177\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0086\r\3\2\2\2\u0087\u0088\7,\2\2\u0088\u008d"+
		"\7\5\2\2\u0089\u008b\5(\25\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\5\36\20\2\u008d\u008a\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u0096\3\2\2\2\u008f\u0091\7\6\2\2\u0090\u0092\5(\25\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5\36"+
		"\20\2\u0094\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\7"+
		"\2\2\u009a\17\3\2\2\2\u009b\u009c\7,\2\2\u009c\u009d\7\4\2\2\u009d\u009e"+
		"\5\24\13\2\u009e\21\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\u00a1\7\b\2\2\u00a1"+
		"\u00a2\5\36\20\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5"+
		"\24\13\2\u00a5\23\3\2\2\2\u00a6\u00a8\5(\25\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\36\20\2\u00aa\25\3\2"+
		"\2\2\u00ab\u00ac\5,\27\2\u00ac\u00b2\7,\2\2\u00ad\u00af\7\b\2\2\u00ae"+
		"\u00b0\5\36\20\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b3\7\t\2\2\u00b2\u00ad\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\7\4"+
		"\2\2\u00b7\u00b9\5\32\16\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\t\2\2"+
		"\2\u00bd\31\3\2\2\2\u00be\u00cb\5\34\17\2\u00bf\u00c0\7\n\2\2\u00c0\u00c5"+
		"\5\34\17\2\u00c1\u00c2\7\6\2\2\u00c2\u00c4\5\34\17\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00cb\3\2\2\2"+
		"\u00ca\u00be\3\2\2\2\u00ca\u00bf\3\2\2\2\u00cb\33\3\2\2\2\u00cc\u00ce"+
		"\7\n\2\2\u00cd\u00cf\5(\25\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d8\5\36\20\2\u00d1\u00d3\7\6\2\2\u00d2\u00d4\5"+
		"(\25\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\5\36\20\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\7\13\2\2\u00dc\35\3\2\2\2\u00dd\u00de\b\20\1\2\u00de\u00e0\7\5"+
		"\2\2\u00df\u00e1\5(\25\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7\7\2\2\u00e4\u00f5\3"+
		"\2\2\2\u00e5\u00f5\7+\2\2\u00e6\u00f5\7,\2\2\u00e7\u00f5\7.\2\2\u00e8"+
		"\u00ea\7/\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f5\7/\2\2\u00ed\u00ef\7\60\2\2\u00ee"+
		"\u00f0\t\3\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f5\7\60\2\2\u00f2\u00f5\5 \21\2\u00f3\u00f5\5\16\b\2\u00f4"+
		"\u00dd\3\2\2\2\u00f4\u00e5\3\2\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00e7\3\2"+
		"\2\2\u00f4\u00e8\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u0109\3\2\2\2\u00f6\u00f9\f\4\2\2\u00f7\u00fa\5*"+
		"\26\2\u00f8\u00fa\5(\25\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u0104\5\36\20\2\u00fc\u00ff\5*\26\2\u00fd\u00ff\5"+
		"(\25\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\5\36\20\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u00f6\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\37\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110"+
		"\5\"\22\2\u010d\u0110\5$\23\2\u010e\u0110\5&\24\2\u010f\u010c\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110!\3\2\2\2\u0111\u0112\7"+
		"\f\2\2\u0112\u0116\7,\2\2\u0113\u0114\7,\2\2\u0114\u0116\7\f\2\2\u0115"+
		"\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116#\3\2\2\2\u0117\u0118\7\r\2\2"+
		"\u0118\u011c\7,\2\2\u0119\u011a\7,\2\2\u011a\u011c\7\r\2\2\u011b\u0117"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c%\3\2\2\2\u011d\u011e\7\16\2\2\u011e"+
		"\u011f\7,\2\2\u011f\'\3\2\2\2\u0120\u0121\7\17\2\2\u0121)\3\2\2\2\u0122"+
		"\u0123\t\4\2\2\u0123+\3\2\2\2\u0124\u0125\t\5\2\2\u0125-\3\2\2\2\u0126"+
		"\u012b\5\60\31\2\u0127\u012b\5\64\33\2\u0128\u012b\5<\37\2\u0129\u012b"+
		"\5D#\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b/\3\2\2\2\u012c\u0130\7\n\2\2\u012d\u012f\5\62\32"+
		"\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\13\2\2"+
		"\u0134\61\3\2\2\2\u0135\u0139\5.\30\2\u0136\u0139\5\6\4\2\u0137\u0139"+
		"\5\f\7\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\63\3\2\2\2\u013a\u013e\5\66\34\2\u013b\u013d\58\35\2\u013c\u013b\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5:\36\2\u0142\u0141\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\65\3\2\2\2\u0144\u0146\7#\2\2\u0145\u0147"+
		"\5(\25\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u014a\5\36\20\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\7\2\2\u014e"+
		"\u014f\5.\30\2\u014f\67\3\2\2\2\u0150\u0152\7$\2\2\u0151\u0153\5(\25\2"+
		"\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156"+
		"\5\36\20\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2"+
		"\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\7\2\2\u015a\u015b"+
		"\5.\30\2\u015b9\3\2\2\2\u015c\u015d\7%\2\2\u015d\u015e\5.\30\2\u015e;"+
		"\3\2\2\2\u015f\u0160\7&\2\2\u0160\u0161\7\5\2\2\u0161\u0162\5\36\20\2"+
		"\u0162\u0163\7\7\2\2\u0163\u0164\5.\30\2\u0164\u016c\3\2\2\2\u0165\u0166"+
		"\7\'\2\2\u0166\u0167\7\5\2\2\u0167\u0168\5> \2\u0168\u0169\7\7\2\2\u0169"+
		"\u016a\5.\30\2\u016a\u016c\3\2\2\2\u016b\u015f\3\2\2\2\u016b\u0165\3\2"+
		"\2\2\u016c=\3\2\2\2\u016d\u016f\5@!\2\u016e\u016d\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5B\"\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\7\3\2\2\u0174\u0176\5 "+
		"\21\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176?\3\2\2\2\u0177\u017a"+
		"\5\b\5\2\u0178\u017a\5\f\7\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a"+
		"A\3\2\2\2\u017b\u017c\5\36\20\2\u017cC\3\2\2\2\u017d\u0180\5J&\2\u017e"+
		"\u0180\5H%\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2"+
		"\2\u0181\u0183\5F$\2\u0182\u017f\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\7\3\2\2\u0185E\3\2\2\2\u0186\u018b\7(\2\2\u0187\u0189"+
		"\5(\25\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\5\36\20\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018cG\3\2\2"+
		"\2\u018d\u018e\7)\2\2\u018eI\3\2\2\2\u018f\u0190\7*\2\2\u0190K\3\2\2\2"+
		"\63OQ^dnv\u0085\u008a\u008d\u0091\u0096\u00a7\u00af\u00b4\u00b8\u00c5"+
		"\u00ca\u00ce\u00d3\u00d8\u00e0\u00ea\u00ef\u00f4\u00f9\u00fe\u0104\u0109"+
		"\u010f\u0115\u011b\u012a\u0130\u0138\u013e\u0142\u0146\u014b\u0152\u0157"+
		"\u016b\u016e\u0171\u0175\u0179\u017f\u0182\u0188\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}