// Generated from gem.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FINISH=2, IF=3, ELSE=4, THEN=5, END=6, FOR=7, FROM=8, TO=9, WHILE=10, 
		LOOP=11, BREAK=12, FUNCTION=13, RETURNS=14, STRUCT=15, EXTENDS=16, CLASS=17, 
		IS=18, IS_MESSAGE=19, REF=20, PRINT=21, RETURN=22, INTEGER_TYPE=23, NUMBER_TYPE=24, 
		STRING_TYPE=25, BOOLEAN_TYPE=26, CHAR_TYPE=27, AND=28, OR=29, PLUS=30, 
		MINUS=31, MULT=32, DIV=33, MOD=34, LT=35, GT=36, LE=37, GE=38, EQ=39, 
		NEQ=40, ARROW=41, DOT=42, ASSIGN=43, LPAREN=44, RPAREN=45, LBRACK=46, 
		RBRACK=47, COMMA=48, BOOLEAN_LITERAL=49, ID=50, INTEGER_LITERAL=51, FLOAT_LITERAL=52, 
		STRING_LITERAL=53, CHAR_LITERAL=54, COMMENT=55, MULTILINE_COMMENT=56, 
		NEWLINE=57, WS=58;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_innerFunctionDeclaration = 3, 
		RULE_variableDeclaration = 4, RULE_type = 5, RULE_struct_type = 6, RULE_class_type = 7, 
		RULE_assignment = 8, RULE_ifStatement = 9, RULE_forLoop = 10, RULE_whileLoop = 11, 
		RULE_loop = 12, RULE_functionDeclaration = 13, RULE_structDeclaration = 14, 
		RULE_messageDeclaration = 15, RULE_field = 16, RULE_classDeclaration = 17, 
		RULE_parameterList = 18, RULE_parameter = 19, RULE_functionCall = 20, 
		RULE_argumentList = 21, RULE_argument = 22, RULE_printStatement = 23, 
		RULE_readStatement = 24, RULE_returnStatement = 25, RULE_breakStatement = 26, 
		RULE_expression = 27, RULE_logicalExpression = 28, RULE_comparisonExpression = 29, 
		RULE_additiveExpression = 30, RULE_multiplicativeExpression = 31, RULE_messageExpression = 32, 
		RULE_message_type = 33, RULE_primaryExpression = 34, RULE_literal = 35, 
		RULE_arrayLiteral = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "statement", "innerFunctionDeclaration", "variableDeclaration", 
			"type", "struct_type", "class_type", "assignment", "ifStatement", "forLoop", 
			"whileLoop", "loop", "functionDeclaration", "structDeclaration", "messageDeclaration", 
			"field", "classDeclaration", "parameterList", "parameter", "functionCall", 
			"argumentList", "argument", "printStatement", "readStatement", "returnStatement", 
			"breakStatement", "expression", "logicalExpression", "comparisonExpression", 
			"additiveExpression", "multiplicativeExpression", "messageExpression", 
			"message_type", "primaryExpression", "literal", "arrayLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'finish'", "'if'", "'else'", "'then'", "'end'", "'for'", 
			"'from'", "'to'", "'while'", "'loop'", "'break'", "'function'", "'returns'", 
			"'struct'", "'extends'", "'class'", "'is'", "'message'", "'ref'", "'print'", 
			"'return'", "'integer'", "'number'", "'string'", "'boolean'", "'char'", 
			"'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'->'", "'.'", "'='", "'('", "')'", "'['", "']'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FINISH", "IF", "ELSE", "THEN", "END", "FOR", "FROM", 
			"TO", "WHILE", "LOOP", "BREAK", "FUNCTION", "RETURNS", "STRUCT", "EXTENDS", 
			"CLASS", "IS", "IS_MESSAGE", "REF", "PRINT", "RETURN", "INTEGER_TYPE", 
			"NUMBER_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "CHAR_TYPE", "AND", "OR", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "LT", "GT", "LE", "GE", "EQ", 
			"NEQ", "ARROW", "DOT", "ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"COMMA", "BOOLEAN_LITERAL", "ID", "INTEGER_LITERAL", "FLOAT_LITERAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "COMMENT", "MULTILINE_COMMENT", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "gem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(gemParser.START, 0); }
		public TerminalNode FINISH() { return getToken(gemParser.FINISH, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 696320L) != 0)) {
				{
				{
				setState(74);
				declaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(START);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
				{
				{
				setState(81);
				statement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(FINISH);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MessageDeclarationContext messageDeclaration() {
			return getRuleContext(MessageDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				structDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				classDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				functionDeclaration();
				}
				break;
			case IS_MESSAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				messageDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InnerFunctionDeclarationContext innerFunctionDeclaration() {
			return getRuleContext(InnerFunctionDeclarationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				innerFunctionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				printStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				readStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				returnStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(106);
				breakStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerFunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(gemParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(gemParser.FUNCTION, i);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(gemParser.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InnerFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterInnerFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitInnerFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitInnerFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerFunctionDeclarationContext innerFunctionDeclaration() throws RecognitionException {
		InnerFunctionDeclarationContext _localctx = new InnerFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_innerFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FUNCTION);
			setState(111);
			match(ID);
			setState(112);
			match(LPAREN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900167938048L) != 0)) {
				{
				setState(113);
				parameterList();
				}
			}

			setState(116);
			match(RPAREN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(117);
				match(RETURNS);
				setState(118);
				type(0);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
				{
				{
				setState(121);
				statement();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(END);
			setState(128);
			match(FUNCTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gemParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				type(0);
				setState(131);
				match(ID);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(132);
					match(ASSIGN);
					setState(133);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				struct_type();
				setState(137);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				class_type();
				setState(140);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER_TYPE() { return getToken(gemParser.INTEGER_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(gemParser.NUMBER_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(gemParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(gemParser.BOOLEAN_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(gemParser.CHAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_TYPE:
				{
				setState(145);
				match(INTEGER_TYPE);
				}
				break;
			case NUMBER_TYPE:
				{
				setState(146);
				match(NUMBER_TYPE);
				}
				break;
			case STRING_TYPE:
				{
				setState(147);
				match(STRING_TYPE);
				}
				break;
			case BOOLEAN_TYPE:
				{
				setState(148);
				match(BOOLEAN_TYPE);
				}
				break;
			case CHAR_TYPE:
				{
				setState(149);
				match(CHAR_TYPE);
				}
				break;
			case ID:
				{
				setState(150);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					match(LBRACK);
					setState(155);
					match(RBRACK);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterStruct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitStruct_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gemParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(gemParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(gemParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ID);
				setState(166);
				match(ASSIGN);
				setState(167);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(ID);
				setState(169);
				match(DOT);
				setState(170);
				match(ID);
				setState(171);
				match(ASSIGN);
				setState(172);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(ID);
				setState(174);
				match(LBRACK);
				setState(175);
				expression();
				setState(176);
				match(RBRACK);
				setState(177);
				match(ASSIGN);
				setState(178);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(gemParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(gemParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(gemParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(gemParser.ELSE, i);
		}
		public TerminalNode THEN() { return getToken(gemParser.THEN, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(IF);
				setState(183);
				expression();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
					{
					{
					setState(184);
					statement();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(190);
						match(ELSE);
						setState(191);
						match(IF);
						setState(192);
						expression();
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
							{
							{
							setState(193);
							statement();
							}
							}
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(204);
					match(ELSE);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
						{
						{
						setState(205);
						statement();
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(213);
				match(END);
				setState(214);
				match(IF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(IF);
				setState(217);
				expression();
				setState(218);
				match(THEN);
				setState(219);
				statement();
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(220);
					match(ELSE);
					setState(221);
					statement();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(gemParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(gemParser.FOR, i);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode FROM() { return getToken(gemParser.FROM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(gemParser.TO, 0); }
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(FOR);
			setState(227);
			match(ID);
			setState(228);
			match(FROM);
			setState(229);
			expression();
			setState(230);
			match(TO);
			setState(231);
			expression();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
				{
				{
				setState(232);
				statement();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(END);
			setState(239);
			match(FOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public List<TerminalNode> WHILE() { return getTokens(gemParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(gemParser.WHILE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(WHILE);
			setState(242);
			expression();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
				{
				{
				setState(243);
				statement();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(END);
			setState(250);
			match(WHILE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> LOOP() { return getTokens(gemParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(gemParser.LOOP, i);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LOOP);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
				{
				{
				setState(253);
				statement();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(END);
			setState(260);
			match(LOOP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(gemParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(gemParser.FUNCTION, i);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(gemParser.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(FUNCTION);
			setState(263);
			match(ID);
			setState(264);
			match(LPAREN);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900167938048L) != 0)) {
				{
				setState(265);
				parameterList();
				}
			}

			setState(268);
			match(RPAREN);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(269);
				match(RETURNS);
				setState(270);
				type(0);
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553808262118536L) != 0)) {
				{
				{
				setState(273);
				statement();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(END);
			setState(280);
			match(FUNCTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> STRUCT() { return getTokens(gemParser.STRUCT); }
		public TerminalNode STRUCT(int i) {
			return getToken(gemParser.STRUCT, i);
		}
		public List<TerminalNode> ID() { return getTokens(gemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gemParser.ID, i);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public TerminalNode EXTENDS() { return getToken(gemParser.EXTENDS, 0); }
		public TerminalNode IS() { return getToken(gemParser.IS, 0); }
		public TerminalNode IS_MESSAGE() { return getToken(gemParser.IS_MESSAGE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STRUCT);
			setState(283);
			match(ID);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(284);
				match(EXTENDS);
				setState(285);
				match(ID);
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(288);
				match(IS);
				setState(289);
				match(IS_MESSAGE);
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900166889472L) != 0)) {
				{
				{
				setState(292);
				field();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(END);
			setState(299);
			match(STRUCT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MessageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IS_MESSAGE() { return getTokens(gemParser.IS_MESSAGE); }
		public TerminalNode IS_MESSAGE(int i) {
			return getToken(gemParser.IS_MESSAGE, i);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public MessageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMessageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMessageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitMessageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageDeclarationContext messageDeclaration() throws RecognitionException {
		MessageDeclarationContext _localctx = new MessageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_messageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IS_MESSAGE);
			setState(302);
			match(ID);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900166889472L) != 0)) {
				{
				{
				setState(303);
				field();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(END);
			setState(310);
			match(IS_MESSAGE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			type(0);
			setState(313);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> CLASS() { return getTokens(gemParser.CLASS); }
		public TerminalNode CLASS(int i) {
			return getToken(gemParser.CLASS, i);
		}
		public List<TerminalNode> ID() { return getTokens(gemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gemParser.ID, i);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public TerminalNode IS() { return getToken(gemParser.IS, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CLASS);
			setState(316);
			match(ID);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(317);
				match(IS);
				setState(318);
				match(ID);
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900166897664L) != 0)) {
				{
				setState(323);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_TYPE:
				case NUMBER_TYPE:
				case STRING_TYPE:
				case BOOLEAN_TYPE:
				case CHAR_TYPE:
				case ID:
					{
					setState(321);
					field();
					}
					break;
				case FUNCTION:
					{
					setState(322);
					functionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(END);
			setState(329);
			match(CLASS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gemParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gemParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			parameter();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(332);
				match(COMMA);
				setState(333);
				parameter();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode REF() { return getToken(gemParser.REF, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(339);
				match(REF);
				}
			}

			setState(342);
			type(0);
			setState(343);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gemParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(gemParser.DOT, 0); }
		public TerminalNode ARROW() { return getToken(gemParser.ARROW, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(ID);
				setState(346);
				match(LPAREN);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807996813312L) != 0)) {
					{
					setState(347);
					argumentList();
					}
				}

				setState(350);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(ID);
				setState(352);
				match(DOT);
				setState(353);
				match(ID);
				setState(354);
				match(LPAREN);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807996813312L) != 0)) {
					{
					setState(355);
					argumentList();
					}
				}

				setState(358);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(ID);
				setState(360);
				match(ARROW);
				setState(361);
				match(ID);
				setState(362);
				match(LPAREN);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807996813312L) != 0)) {
					{
					setState(363);
					argumentList();
					}
				}

				setState(366);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gemParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gemParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			argument();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				argument();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode REF() { return getToken(gemParser.REF, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(377);
				match(REF);
				}
			}

			setState(380);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(gemParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(PRINT);
			setState(383);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ID);
			setState(386);
			match(LPAREN);
			setState(387);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gemParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(RETURN);
			setState(390);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(gemParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(BREAK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			logicalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(gemParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(gemParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(gemParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(gemParser.OR, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			comparisonExpression();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(397);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(398);
				comparisonExpression();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(gemParser.LT, 0); }
		public TerminalNode GT() { return getToken(gemParser.GT, 0); }
		public TerminalNode LE() { return getToken(gemParser.LE, 0); }
		public TerminalNode GE() { return getToken(gemParser.GE, 0); }
		public TerminalNode EQ() { return getToken(gemParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(gemParser.NEQ, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			additiveExpression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) {
				{
				setState(405);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				additiveExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(gemParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gemParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(gemParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(gemParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			multiplicativeExpression();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				multiplicativeExpression();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<MessageExpressionContext> messageExpression() {
			return getRuleContexts(MessageExpressionContext.class);
		}
		public MessageExpressionContext messageExpression(int i) {
			return getRuleContext(MessageExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(gemParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gemParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(gemParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(gemParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(gemParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(gemParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			messageExpression(0);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
				{
				{
				setState(418);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(419);
				messageExpression(0);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MessageExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public MessageExpressionContext messageExpression() {
			return getRuleContext(MessageExpressionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(gemParser.ARROW, 0); }
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(gemParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public MessageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMessageExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMessageExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitMessageExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExpressionContext messageExpression() throws RecognitionException {
		return messageExpression(0);
	}

	private MessageExpressionContext messageExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, _parentState);
		MessageExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_messageExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(426);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new MessageExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_messageExpression);
						setState(428);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(429);
						match(ARROW);
						setState(430);
						match(ID);
						setState(431);
						match(LPAREN);
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807996813312L) != 0)) {
							{
							setState(432);
							argumentList();
							}
						}

						setState(435);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new MessageExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_messageExpression);
						setState(436);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(437);
						match(DOT);
						setState(438);
						match(ID);
						setState(439);
						match(LPAREN);
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807996813312L) != 0)) {
							{
							setState(440);
							argumentList();
							}
						}

						setState(443);
						match(RPAREN);
						}
						break;
					case 3:
						{
						_localctx = new MessageExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_messageExpression);
						setState(444);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(445);
						match(DOT);
						setState(446);
						match(ID);
						}
						break;
					case 4:
						{
						_localctx = new MessageExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_messageExpression);
						setState(447);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(448);
						match(LBRACK);
						setState(449);
						expression();
						setState(450);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Message_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public Message_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMessage_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMessage_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitMessage_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_typeContext message_type() throws RecognitionException {
		Message_typeContext _localctx = new Message_typeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_message_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primaryExpression);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(ID);
				setState(460);
				match(LPAREN);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807996813312L) != 0)) {
					{
					setState(461);
					argumentList();
					}
				}

				setState(464);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				match(LPAREN);
				setState(468);
				expression();
				setState(469);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(gemParser.FLOAT_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(gemParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gemParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(gemParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(gemParser.BOOLEAN_LITERAL, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(FLOAT_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(INTEGER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(CHAR_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				match(BOOLEAN_LITERAL);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(478);
				arrayLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gemParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gemParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(LBRACK);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35553807995764736L) != 0)) {
				{
				setState(482);
				expression();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483);
					match(COMMA);
					setState(484);
					expression();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(492);
			match(RBRACK);
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
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 32:
			return messageExpression_sempred((MessageExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean messageExpression_sempred(MessageExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u01ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000"+
		"V\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001^\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003s\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003x\b\u0003\u0001\u0003"+
		"\u0005\u0003{\b\u0003\n\u0003\f\u0003~\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0087\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u008f\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0098\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009d\b\u0005\n\u0005"+
		"\f\u0005\u00a0\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b5\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00ba\b\t\n\t\f\t\u00bd\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00c3\b\t\n\t\f\t\u00c6\t\t\u0005\t\u00c8\b\t"+
		"\n\t\f\t\u00cb\t\t\u0001\t\u0001\t\u0005\t\u00cf\b\t\n\t\f\t\u00d2\t\t"+
		"\u0003\t\u00d4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00df\b\t\u0003\t\u00e1\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ea\b\n\n\n\f\n\u00ed"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00f5\b\u000b\n\u000b\f\u000b\u00f8\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0005\f\u00ff\b\f\n\f\f\f\u0102\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010b\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0110\b\r\u0001\r\u0005\r\u0113\b\r\n\r\f\r"+
		"\u0116\t\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u011f\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0123\b\u000e\u0001\u000e\u0005\u000e\u0126\b\u000e\n\u000e\f\u000e\u0129"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0131\b\u000f\n\u000f\f\u000f\u0134\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0140\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0144\b\u0011\n\u0011\f\u0011\u0147\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u014f\b\u0012\n\u0012\f\u0012\u0152\t\u0012\u0001\u0013\u0003\u0013"+
		"\u0155\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u015d\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0165\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u016d\b\u0014\u0001\u0014\u0003\u0014\u0170\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0175\b\u0015\n\u0015\f\u0015\u0178\t\u0015"+
		"\u0001\u0016\u0003\u0016\u017b\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0190\b\u001c"+
		"\n\u001c\f\u001c\u0193\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0198\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u019d"+
		"\b\u001e\n\u001e\f\u001e\u01a0\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01a5\b\u001f\n\u001f\f\u001f\u01a8\t\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01b2\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01ba\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01c5\b \n \f \u01c8\t \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u01cf\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d8\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01e0\b#\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u01e6\b$\n$\f$\u01e9\t$\u0003$\u01eb\b$\u0001$\u0001$\u0001$\u0000\u0002"+
		"\n@%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0004\u0001\u0000\u001c"+
		"\u001d\u0001\u0000#(\u0001\u0000\u001e\u001f\u0001\u0000 \"\u021a\u0000"+
		"M\u0001\u0000\u0000\u0000\u0002]\u0001\u0000\u0000\u0000\u0004l\u0001"+
		"\u0000\u0000\u0000\u0006n\u0001\u0000\u0000\u0000\b\u008e\u0001\u0000"+
		"\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000"+
		"\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00b4\u0001\u0000\u0000"+
		"\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00e2\u0001\u0000\u0000"+
		"\u0000\u0016\u00f1\u0001\u0000\u0000\u0000\u0018\u00fc\u0001\u0000\u0000"+
		"\u0000\u001a\u0106\u0001\u0000\u0000\u0000\u001c\u011a\u0001\u0000\u0000"+
		"\u0000\u001e\u012d\u0001\u0000\u0000\u0000 \u0138\u0001\u0000\u0000\u0000"+
		"\"\u013b\u0001\u0000\u0000\u0000$\u014b\u0001\u0000\u0000\u0000&\u0154"+
		"\u0001\u0000\u0000\u0000(\u016f\u0001\u0000\u0000\u0000*\u0171\u0001\u0000"+
		"\u0000\u0000,\u017a\u0001\u0000\u0000\u0000.\u017e\u0001\u0000\u0000\u0000"+
		"0\u0181\u0001\u0000\u0000\u00002\u0185\u0001\u0000\u0000\u00004\u0188"+
		"\u0001\u0000\u0000\u00006\u018a\u0001\u0000\u0000\u00008\u018c\u0001\u0000"+
		"\u0000\u0000:\u0194\u0001\u0000\u0000\u0000<\u0199\u0001\u0000\u0000\u0000"+
		">\u01a1\u0001\u0000\u0000\u0000@\u01a9\u0001\u0000\u0000\u0000B\u01c9"+
		"\u0001\u0000\u0000\u0000D\u01d7\u0001\u0000\u0000\u0000F\u01df\u0001\u0000"+
		"\u0000\u0000H\u01e1\u0001\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PT\u0005\u0001\u0000\u0000QS\u0003\u0004\u0002\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0002\u0000\u0000X\u0001\u0001\u0000\u0000\u0000Y^\u0003"+
		"\u001c\u000e\u0000Z^\u0003\"\u0011\u0000[^\u0003\u001a\r\u0000\\^\u0003"+
		"\u001e\u000f\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0003\u0001\u0000"+
		"\u0000\u0000_m\u0003\b\u0004\u0000`m\u0003\u0010\b\u0000am\u0003\u0012"+
		"\t\u0000bm\u0003\u0014\n\u0000cm\u0003\u0016\u000b\u0000dm\u0003\u0018"+
		"\f\u0000em\u0003(\u0014\u0000fm\u0003\u0006\u0003\u0000gm\u0003.\u0017"+
		"\u0000hm\u00030\u0018\u0000im\u00032\u0019\u0000jm\u00034\u001a\u0000"+
		"km\u00036\u001b\u0000l_\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000"+
		"la\u0001\u0000\u0000\u0000lb\u0001\u0000\u0000\u0000lc\u0001\u0000\u0000"+
		"\u0000ld\u0001\u0000\u0000\u0000le\u0001\u0000\u0000\u0000lf\u0001\u0000"+
		"\u0000\u0000lg\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000li\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"m\u0005\u0001\u0000\u0000\u0000no\u0005\r\u0000\u0000op\u00052\u0000\u0000"+
		"pr\u0005,\u0000\u0000qs\u0003$\u0012\u0000rq\u0001\u0000\u0000\u0000r"+
		"s\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0005-\u0000\u0000"+
		"uv\u0005\u000e\u0000\u0000vx\u0003\n\u0005\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x|\u0001\u0000\u0000\u0000y{\u0003\u0004\u0002"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080\u0081"+
		"\u0005\r\u0000\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"\n\u0005\u0000\u0083\u0086\u00052\u0000\u0000\u0084\u0085\u0005+\u0000"+
		"\u0000\u0085\u0087\u00036\u001b\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008f\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0003\f\u0006\u0000\u0089\u008a\u00052\u0000\u0000\u008a"+
		"\u008f\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u000e\u0007\u0000\u008c"+
		"\u008d\u00052\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0082"+
		"\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u008b"+
		"\u0001\u0000\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u0091\u0006"+
		"\u0005\uffff\uffff\u0000\u0091\u0098\u0005\u0017\u0000\u0000\u0092\u0098"+
		"\u0005\u0018\u0000\u0000\u0093\u0098\u0005\u0019\u0000\u0000\u0094\u0098"+
		"\u0005\u001a\u0000\u0000\u0095\u0098\u0005\u001b\u0000\u0000\u0096\u0098"+
		"\u00052\u0000\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0092\u0001"+
		"\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u009e\u0001\u0000\u0000\u0000\u0099\u009a\n\u0002"+
		"\u0000\u0000\u009a\u009b\u0005.\u0000\u0000\u009b\u009d\u0005/\u0000\u0000"+
		"\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u000b\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u00052\u0000\u0000\u00a2\r\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u00052\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u00052\u0000\u0000\u00a6\u00a7\u0005+\u0000\u0000\u00a7\u00b5\u00036"+
		"\u001b\u0000\u00a8\u00a9\u00052\u0000\u0000\u00a9\u00aa\u0005*\u0000\u0000"+
		"\u00aa\u00ab\u00052\u0000\u0000\u00ab\u00ac\u0005+\u0000\u0000\u00ac\u00b5"+
		"\u00036\u001b\u0000\u00ad\u00ae\u00052\u0000\u0000\u00ae\u00af\u0005."+
		"\u0000\u0000\u00af\u00b0\u00036\u001b\u0000\u00b0\u00b1\u0005/\u0000\u0000"+
		"\u00b1\u00b2\u0005+\u0000\u0000\u00b2\u00b3\u00036\u001b\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a5\u0001\u0000\u0000\u0000\u00b4\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b5\u0011"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u00bb"+
		"\u00036\u001b\u0000\u00b8\u00ba\u0003\u0004\u0002\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0004\u0000\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c4\u0003"+
		"6\u001b\u0000\u00c1\u00c3\u0003\u0004\u0002\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00be\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00d3\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00d0\u0005\u0004"+
		"\u0000\u0000\u00cd\u00cf\u0003\u0004\u0002\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0006\u0000\u0000\u00d6\u00d7\u0005\u0003"+
		"\u0000\u0000\u00d7\u00e1\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0003"+
		"\u0000\u0000\u00d9\u00da\u00036\u001b\u0000\u00da\u00db\u0005\u0005\u0000"+
		"\u0000\u00db\u00de\u0003\u0004\u0002\u0000\u00dc\u00dd\u0005\u0004\u0000"+
		"\u0000\u00dd\u00df\u0003\u0004\u0002\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00b6\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e1\u0013\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0007\u0000"+
		"\u0000\u00e3\u00e4\u00052\u0000\u0000\u00e4\u00e5\u0005\b\u0000\u0000"+
		"\u00e5\u00e6\u00036\u001b\u0000\u00e6\u00e7\u0005\t\u0000\u0000\u00e7"+
		"\u00eb\u00036\u001b\u0000\u00e8\u00ea\u0003\u0004\u0002\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0006\u0000\u0000\u00ef\u00f0\u0005\u0007\u0000\u0000\u00f0\u0015"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\n\u0000\u0000\u00f2\u00f6\u0003"+
		"6\u001b\u0000\u00f3\u00f5\u0003\u0004\u0002\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0006"+
		"\u0000\u0000\u00fa\u00fb\u0005\n\u0000\u0000\u00fb\u0017\u0001\u0000\u0000"+
		"\u0000\u00fc\u0100\u0005\u000b\u0000\u0000\u00fd\u00ff\u0003\u0004\u0002"+
		"\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005\u0006\u0000\u0000\u0104\u0105\u0005\u000b\u0000"+
		"\u0000\u0105\u0019\u0001\u0000\u0000\u0000\u0106\u0107\u0005\r\u0000\u0000"+
		"\u0107\u0108\u00052\u0000\u0000\u0108\u010a\u0005,\u0000\u0000\u0109\u010b"+
		"\u0003$\u0012\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010f\u0005"+
		"-\u0000\u0000\u010d\u010e\u0005\u000e\u0000\u0000\u010e\u0110\u0003\n"+
		"\u0005\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0114\u0001\u0000\u0000\u0000\u0111\u0113\u0003\u0004"+
		"\u0002\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\u0006\u0000\u0000\u0118\u0119\u0005\r\u0000"+
		"\u0000\u0119\u001b\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u000f\u0000"+
		"\u0000\u011b\u011e\u00052\u0000\u0000\u011c\u011d\u0005\u0010\u0000\u0000"+
		"\u011d\u011f\u00052\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005\u0012\u0000\u0000\u0121\u0123\u0005\u0013\u0000\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123"+
		"\u0127\u0001\u0000\u0000\u0000\u0124\u0126\u0003 \u0010\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u0006\u0000\u0000\u012b\u012c\u0005\u000f\u0000\u0000\u012c\u001d"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0013\u0000\u0000\u012e\u0132"+
		"\u00052\u0000\u0000\u012f\u0131\u0003 \u0010\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0006"+
		"\u0000\u0000\u0136\u0137\u0005\u0013\u0000\u0000\u0137\u001f\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0003\n\u0005\u0000\u0139\u013a\u00052\u0000"+
		"\u0000\u013a!\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0011\u0000\u0000"+
		"\u013c\u013f\u00052\u0000\u0000\u013d\u013e\u0005\u0012\u0000\u0000\u013e"+
		"\u0140\u00052\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0145\u0001\u0000\u0000\u0000\u0141\u0144"+
		"\u0003 \u0010\u0000\u0142\u0144\u0003\u001a\r\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005\u0006\u0000\u0000\u0149\u014a\u0005"+
		"\u0011\u0000\u0000\u014a#\u0001\u0000\u0000\u0000\u014b\u0150\u0003&\u0013"+
		"\u0000\u014c\u014d\u00050\u0000\u0000\u014d\u014f\u0003&\u0013\u0000\u014e"+
		"\u014c\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"%\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0155"+
		"\u0005\u0014\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0003\n\u0005\u0000\u0157\u0158\u00052\u0000\u0000\u0158\'\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u00052\u0000\u0000\u015a\u015c\u0005,\u0000\u0000"+
		"\u015b\u015d\u0003*\u0015\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0170\u0005-\u0000\u0000\u015f\u0160\u00052\u0000\u0000\u0160\u0161\u0005"+
		"*\u0000\u0000\u0161\u0162\u00052\u0000\u0000\u0162\u0164\u0005,\u0000"+
		"\u0000\u0163\u0165\u0003*\u0015\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000"+
		"\u0166\u0170\u0005-\u0000\u0000\u0167\u0168\u00052\u0000\u0000\u0168\u0169"+
		"\u0005)\u0000\u0000\u0169\u016a\u00052\u0000\u0000\u016a\u016c\u0005,"+
		"\u0000\u0000\u016b\u016d\u0003*\u0015\u0000\u016c\u016b\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0170\u0005-\u0000\u0000\u016f\u0159\u0001\u0000\u0000\u0000"+
		"\u016f\u015f\u0001\u0000\u0000\u0000\u016f\u0167\u0001\u0000\u0000\u0000"+
		"\u0170)\u0001\u0000\u0000\u0000\u0171\u0176\u0003,\u0016\u0000\u0172\u0173"+
		"\u00050\u0000\u0000\u0173\u0175\u0003,\u0016\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177+\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017b\u0005\u0014\u0000"+
		"\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u00036\u001b\u0000"+
		"\u017d-\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0015\u0000\u0000\u017f"+
		"\u0180\u00036\u001b\u0000\u0180/\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"2\u0000\u0000\u0182\u0183\u0005,\u0000\u0000\u0183\u0184\u0005-\u0000"+
		"\u0000\u01841\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0016\u0000\u0000"+
		"\u0186\u0187\u00036\u001b\u0000\u01873\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005\f\u0000\u0000\u01895\u0001\u0000\u0000\u0000\u018a\u018b\u0003"+
		"8\u001c\u0000\u018b7\u0001\u0000\u0000\u0000\u018c\u0191\u0003:\u001d"+
		"\u0000\u018d\u018e\u0007\u0000\u0000\u0000\u018e\u0190\u0003:\u001d\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u01929\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0003<\u001e\u0000\u0195\u0196\u0007\u0001\u0000\u0000\u0196\u0198"+
		"\u0003<\u001e\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198;\u0001\u0000\u0000\u0000\u0199\u019e\u0003>\u001f"+
		"\u0000\u019a\u019b\u0007\u0002\u0000\u0000\u019b\u019d\u0003>\u001f\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019f=\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a6\u0003@ \u0000\u01a2\u01a3\u0007\u0003\u0000\u0000\u01a3\u01a5\u0003"+
		"@ \u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7?\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0006 \uffff\uffff\u0000\u01aa\u01ab\u0003D\"\u0000\u01ab"+
		"\u01c6\u0001\u0000\u0000\u0000\u01ac\u01ad\n\u0004\u0000\u0000\u01ad\u01ae"+
		"\u0005)\u0000\u0000\u01ae\u01af\u00052\u0000\u0000\u01af\u01b1\u0005,"+
		"\u0000\u0000\u01b0\u01b2\u0003*\u0015\u0000\u01b1\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01c5\u0005-\u0000\u0000\u01b4\u01b5\n\u0003\u0000\u0000"+
		"\u01b5\u01b6\u0005*\u0000\u0000\u01b6\u01b7\u00052\u0000\u0000\u01b7\u01b9"+
		"\u0005,\u0000\u0000\u01b8\u01ba\u0003*\u0015\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01c5\u0005-\u0000\u0000\u01bc\u01bd\n\u0002\u0000"+
		"\u0000\u01bd\u01be\u0005*\u0000\u0000\u01be\u01c5\u00052\u0000\u0000\u01bf"+
		"\u01c0\n\u0001\u0000\u0000\u01c0\u01c1\u0005.\u0000\u0000\u01c1\u01c2"+
		"\u00036\u001b\u0000\u01c2\u01c3\u0005/\u0000\u0000\u01c3\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c4\u01ac\u0001\u0000\u0000\u0000\u01c4\u01b4\u0001\u0000"+
		"\u0000\u0000\u01c4\u01bc\u0001\u0000\u0000\u0000\u01c4\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7A\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u00052\u0000\u0000"+
		"\u01caC\u0001\u0000\u0000\u0000\u01cb\u01cc\u00052\u0000\u0000\u01cc\u01ce"+
		"\u0005,\u0000\u0000\u01cd\u01cf\u0003*\u0015\u0000\u01ce\u01cd\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d8\u0005-\u0000\u0000\u01d1\u01d8\u00052\u0000\u0000"+
		"\u01d2\u01d8\u0003F#\u0000\u01d3\u01d4\u0005,\u0000\u0000\u01d4\u01d5"+
		"\u00036\u001b\u0000\u01d5\u01d6\u0005-\u0000\u0000\u01d6\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d7\u01cb\u0001\u0000\u0000\u0000\u01d7\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d2\u0001\u0000\u0000\u0000\u01d7\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d8E\u0001\u0000\u0000\u0000\u01d9\u01e0\u00054\u0000\u0000"+
		"\u01da\u01e0\u00053\u0000\u0000\u01db\u01e0\u00055\u0000\u0000\u01dc\u01e0"+
		"\u00056\u0000\u0000\u01dd\u01e0\u00051\u0000\u0000\u01de\u01e0\u0003H"+
		"$\u0000\u01df\u01d9\u0001\u0000\u0000\u0000\u01df\u01da\u0001\u0000\u0000"+
		"\u0000\u01df\u01db\u0001\u0000\u0000\u0000\u01df\u01dc\u0001\u0000\u0000"+
		"\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000"+
		"\u0000\u01e0G\u0001\u0000\u0000\u0000\u01e1\u01ea\u0005.\u0000\u0000\u01e2"+
		"\u01e7\u00036\u001b\u0000\u01e3\u01e4\u00050\u0000\u0000\u01e4\u01e6\u0003"+
		"6\u001b\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e2\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005/\u0000"+
		"\u0000\u01edI\u0001\u0000\u0000\u00005MT]lrw|\u0086\u008e\u0097\u009e"+
		"\u00b4\u00bb\u00c4\u00c9\u00d0\u00d3\u00de\u00e0\u00eb\u00f6\u0100\u010a"+
		"\u010f\u0114\u011e\u0122\u0127\u0132\u013f\u0143\u0145\u0150\u0154\u015c"+
		"\u0164\u016c\u016f\u0176\u017a\u0191\u0197\u019e\u01a6\u01b1\u01b9\u01c4"+
		"\u01c6\u01ce\u01d7\u01df\u01e7\u01ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}