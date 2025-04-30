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
		IS=18, MESSAGE=19, REF=20, PRINT=21, READ_LINE=22, READ_INTEGER=23, RETURN=24, 
		INTEGER_TYPE=25, NUMBER_TYPE=26, STRING_TYPE=27, BOOLEAN_TYPE=28, CHAR_TYPE=29, 
		AND=30, OR=31, PLUS=32, MINUS=33, MULT=34, DIV=35, MOD=36, LT=37, GT=38, 
		LE=39, GE=40, EQ=41, NEQ=42, ARROW=43, DOT=44, ASSIGN=45, LPAREN=46, RPAREN=47, 
		LBRACK=48, RBRACK=49, COMMA=50, ID=51, INTEGER_LITERAL=52, FLOAT_LITERAL=53, 
		STRING_LITERAL=54, CHAR_LITERAL=55, BOOLEAN_LITERAL=56, COMMENT=57, MULTILINE_COMMENT=58, 
		NEWLINE=59, WS=60;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_innerFunctionDeclaration = 3, 
		RULE_variableDeclaration = 4, RULE_type = 5, RULE_struct_type = 6, RULE_class_type = 7, 
		RULE_message_type = 8, RULE_assignment = 9, RULE_ifStatement = 10, RULE_forLoop = 11, 
		RULE_whileLoop = 12, RULE_loop = 13, RULE_functionDeclaration = 14, RULE_structDeclaration = 15, 
		RULE_field = 16, RULE_classDeclaration = 17, RULE_method = 18, RULE_messageDeclaration = 19, 
		RULE_parameterList = 20, RULE_parameter = 21, RULE_functionCall = 22, 
		RULE_argumentList = 23, RULE_argument = 24, RULE_printStatement = 25, 
		RULE_readStatement = 26, RULE_returnStatement = 27, RULE_breakStatement = 28, 
		RULE_expression = 29, RULE_logicalExpression = 30, RULE_comparisonExpression = 31, 
		RULE_additiveExpression = 32, RULE_multiplicativeExpression = 33, RULE_messageExpression = 34, 
		RULE_primaryExpression = 35, RULE_literal = 36, RULE_arrayLiteral = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "statement", "innerFunctionDeclaration", "variableDeclaration", 
			"type", "struct_type", "class_type", "message_type", "assignment", "ifStatement", 
			"forLoop", "whileLoop", "loop", "functionDeclaration", "structDeclaration", 
			"field", "classDeclaration", "method", "messageDeclaration", "parameterList", 
			"parameter", "functionCall", "argumentList", "argument", "printStatement", 
			"readStatement", "returnStatement", "breakStatement", "expression", "logicalExpression", 
			"comparisonExpression", "additiveExpression", "multiplicativeExpression", 
			"messageExpression", "primaryExpression", "literal", "arrayLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'finish'", "'if'", "'else'", "'then'", "'end'", "'for'", 
			"'from'", "'to'", "'while'", "'loop'", "'break'", "'function'", "'returns'", 
			"'struct'", "'extends'", "'class'", "'is'", "'message'", "'ref'", "'print'", 
			"'read_line'", "'read_integer'", "'return'", "'integer'", "'number'", 
			"'string'", "'boolean'", "'char'", "'and'", "'or'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'->'", "'.'", 
			"'='", "'('", "')'", "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FINISH", "IF", "ELSE", "THEN", "END", "FOR", "FROM", 
			"TO", "WHILE", "LOOP", "BREAK", "FUNCTION", "RETURNS", "STRUCT", "EXTENDS", 
			"CLASS", "IS", "MESSAGE", "REF", "PRINT", "READ_LINE", "READ_INTEGER", 
			"RETURN", "INTEGER_TYPE", "NUMBER_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", 
			"CHAR_TYPE", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LT", 
			"GT", "LE", "GE", "EQ", "NEQ", "ARROW", "DOT", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "COMMA", "ID", "INTEGER_LITERAL", "FLOAT_LITERAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "BOOLEAN_LITERAL", "COMMENT", "MULTILINE_COMMENT", 
			"NEWLINE", "WS"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 696320L) != 0)) {
				{
				{
				setState(76);
				declaration();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(START);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(83);
				statement();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		public MessageDeclarationContext messageDeclaration() {
			return getRuleContext(MessageDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MESSAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				messageDeclaration();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				structDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				classDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				functionDeclaration();
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				innerFunctionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				printStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				readStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				returnStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
				breakStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
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
			setState(112);
			match(FUNCTION);
			setState(113);
			match(ID);
			setState(114);
			match(LPAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800854921216L) != 0)) {
				{
				setState(115);
				parameterList();
				}
			}

			setState(118);
			match(RPAREN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(119);
				match(RETURNS);
				setState(120);
				type(0);
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(123);
				statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(END);
			setState(130);
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
		public Message_typeContext message_type() {
			return getRuleContext(Message_typeContext.class,0);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				type(0);
				setState(133);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(134);
					match(ASSIGN);
					setState(135);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				struct_type();
				setState(139);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				class_type();
				setState(142);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				message_type();
				setState(145);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_TYPE:
				{
				setState(150);
				match(INTEGER_TYPE);
				}
				break;
			case NUMBER_TYPE:
				{
				setState(151);
				match(NUMBER_TYPE);
				}
				break;
			case STRING_TYPE:
				{
				setState(152);
				match(STRING_TYPE);
				}
				break;
			case BOOLEAN_TYPE:
				{
				setState(153);
				match(BOOLEAN_TYPE);
				}
				break;
			case CHAR_TYPE:
				{
				setState(154);
				match(CHAR_TYPE);
				}
				break;
			case ID:
				{
				setState(155);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
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
					setState(158);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(159);
					match(LBRACK);
					setState(160);
					match(RBRACK);
					}
					} 
				}
				setState(165);
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
			setState(166);
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
			setState(168);
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
		enterRule(_localctx, 16, RULE_message_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				setState(173);
				match(ASSIGN);
				setState(174);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ID);
				setState(176);
				match(DOT);
				setState(177);
				match(ID);
				setState(178);
				match(ASSIGN);
				setState(179);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				setState(181);
				match(LBRACK);
				setState(182);
				expression();
				setState(183);
				match(RBRACK);
				setState(184);
				match(ASSIGN);
				setState(185);
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
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(IF);
				setState(190);
				expression();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
					{
					{
					setState(191);
					statement();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(197);
						match(ELSE);
						setState(198);
						match(IF);
						setState(199);
						expression();
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
							{
							{
							setState(200);
							statement();
							}
							}
							setState(205);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(211);
					match(ELSE);
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
						{
						{
						setState(212);
						statement();
						}
						}
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(220);
				match(END);
				setState(221);
				match(IF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(IF);
				setState(224);
				expression();
				setState(225);
				match(THEN);
				setState(226);
				statement();
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(227);
					match(ELSE);
					setState(228);
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
		enterRule(_localctx, 22, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(FOR);
			setState(234);
			match(ID);
			setState(235);
			match(FROM);
			setState(236);
			expression();
			setState(237);
			match(TO);
			setState(238);
			expression();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(239);
				statement();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(END);
			setState(246);
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
		enterRule(_localctx, 24, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(WHILE);
			setState(249);
			expression();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(250);
				statement();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(END);
			setState(257);
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
		enterRule(_localctx, 26, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LOOP);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(260);
				statement();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(END);
			setState(267);
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
		enterRule(_localctx, 28, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(FUNCTION);
			setState(270);
			match(ID);
			setState(271);
			match(LPAREN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800854921216L) != 0)) {
				{
				setState(272);
				parameterList();
				}
			}

			setState(275);
			match(RPAREN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(276);
				match(RETURNS);
				setState(277);
				type(0);
				}
			}

			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(280);
				statement();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(END);
			setState(287);
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
		enterRule(_localctx, 30, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(STRUCT);
			setState(290);
			match(ID);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(291);
				match(EXTENDS);
				setState(292);
				match(ID);
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800853872640L) != 0)) {
				{
				{
				setState(295);
				field();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(END);
			setState(302);
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
			setState(304);
			type(0);
			setState(305);
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
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
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
			setState(307);
			match(CLASS);
			setState(308);
			match(ID);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(309);
				match(IS);
				setState(310);
				match(ID);
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800853880832L) != 0)) {
				{
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_TYPE:
				case NUMBER_TYPE:
				case STRING_TYPE:
				case BOOLEAN_TYPE:
				case CHAR_TYPE:
				case ID:
					{
					setState(313);
					field();
					}
					break;
				case FUNCTION:
					{
					setState(314);
					method();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(END);
			setState(321);
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
	public static class MethodContext extends ParserRuleContext {
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
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gemVisitor ) return ((gemVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(FUNCTION);
			setState(324);
			match(ID);
			setState(325);
			match(LPAREN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800854921216L) != 0)) {
				{
				setState(326);
				parameterList();
				}
			}

			setState(329);
			match(RPAREN);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(330);
				match(RETURNS);
				setState(331);
				type(0);
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215233054719112L) != 0)) {
				{
				{
				setState(334);
				statement();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(END);
			setState(341);
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
	public static class MessageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> MESSAGE() { return getTokens(gemParser.MESSAGE); }
		public TerminalNode MESSAGE(int i) {
			return getToken(gemParser.MESSAGE, i);
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
		enterRule(_localctx, 38, RULE_messageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(MESSAGE);
			setState(344);
			match(ID);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800853872640L) != 0)) {
				{
				{
				setState(345);
				field();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(END);
			setState(352);
			match(MESSAGE);
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
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			parameter();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(355);
				match(COMMA);
				setState(356);
				parameter();
				}
				}
				setState(361);
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
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(362);
				match(REF);
				}
			}

			setState(365);
			type(0);
			setState(366);
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
		enterRule(_localctx, 44, RULE_functionCall);
		int _la;
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(ID);
				setState(369);
				match(LPAREN);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231996690432L) != 0)) {
					{
					setState(370);
					argumentList();
					}
				}

				setState(373);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(ID);
				setState(375);
				match(DOT);
				setState(376);
				match(ID);
				setState(377);
				match(LPAREN);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231996690432L) != 0)) {
					{
					setState(378);
					argumentList();
					}
				}

				setState(381);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(ID);
				setState(383);
				match(ARROW);
				setState(384);
				match(ID);
				setState(385);
				match(LPAREN);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231996690432L) != 0)) {
					{
					setState(386);
					argumentList();
					}
				}

				setState(389);
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
		enterRule(_localctx, 46, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			argument();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393);
				match(COMMA);
				setState(394);
				argument();
				}
				}
				setState(399);
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
		enterRule(_localctx, 48, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(400);
				match(REF);
				}
			}

			setState(403);
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
		enterRule(_localctx, 50, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(PRINT);
			setState(406);
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
		public TerminalNode READ_LINE() { return getToken(gemParser.READ_LINE, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public TerminalNode READ_INTEGER() { return getToken(gemParser.READ_INTEGER, 0); }
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
		enterRule(_localctx, 52, RULE_readStatement);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(READ_LINE);
				setState(409);
				match(LPAREN);
				setState(410);
				match(RPAREN);
				}
				break;
			case READ_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(READ_INTEGER);
				setState(412);
				match(LPAREN);
				setState(413);
				match(RPAREN);
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
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(RETURN);
			setState(417);
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
		enterRule(_localctx, 56, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 58, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		enterRule(_localctx, 60, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			comparisonExpression();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(425);
				comparisonExpression();
				}
				}
				setState(430);
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
		enterRule(_localctx, 62, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			additiveExpression();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) {
				{
				setState(432);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(433);
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
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			multiplicativeExpression();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(437);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(438);
				multiplicativeExpression();
				}
				}
				setState(443);
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
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			messageExpression();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				{
				setState(445);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(446);
				messageExpression();
				}
				}
				setState(451);
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
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_messageExpression);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				primaryExpression();
				setState(454);
				match(ARROW);
				setState(455);
				match(ID);
				setState(456);
				match(LPAREN);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231996690432L) != 0)) {
					{
					setState(457);
					argumentList();
					}
				}

				setState(460);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				primaryExpression();
				setState(463);
				match(DOT);
				setState(464);
				match(ID);
				setState(465);
				match(LPAREN);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231996690432L) != 0)) {
					{
					setState(466);
					argumentList();
					}
				}

				setState(469);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				primaryExpression();
				setState(472);
				match(DOT);
				setState(473);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				primaryExpression();
				setState(476);
				match(LBRACK);
				setState(477);
				expression();
				setState(478);
				match(RBRACK);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode READ_LINE() { return getToken(gemParser.READ_LINE, 0); }
		public TerminalNode READ_INTEGER() { return getToken(gemParser.READ_INTEGER, 0); }
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
		enterRule(_localctx, 70, RULE_primaryExpression);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(LPAREN);
				setState(485);
				expression();
				setState(486);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(ID);
				setState(489);
				match(LPAREN);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231996690432L) != 0)) {
					{
					setState(490);
					argumentList();
					}
				}

				setState(493);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(READ_LINE);
				setState(495);
				match(LPAREN);
				setState(496);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(497);
				match(READ_INTEGER);
				setState(498);
				match(LPAREN);
				setState(499);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(gemParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(gemParser.FLOAT_LITERAL, 0); }
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
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(FLOAT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(CHAR_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				match(BOOLEAN_LITERAL);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
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
		enterRule(_localctx, 74, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(LBRACK);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142215231995641856L) != 0)) {
				{
				setState(511);
				expression();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(512);
					match(COMMA);
					setState(513);
					expression();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(521);
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

	public static final String _serializedATN =
		"\u0004\u0001<\u020c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000"+
		"\n\u0000\f\u0000X\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001`\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"o\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"u\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003z\b\u0003\u0001"+
		"\u0003\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0089\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0094\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u009d\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00a2\b\u0005\n\u0005\f\u0005\u00a5\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bc\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00c1\b\n\n\n\f\n\u00c4\t\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u00ca\b\n\n\n\f\n\u00cd\t\n\u0005\n\u00cf\b\n\n\n\f\n\u00d2\t"+
		"\n\u0001\n\u0001\n\u0005\n\u00d6\b\n\n\n\f\n\u00d9\t\n\u0003\n\u00db\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00e6\b\n\u0003\n\u00e8\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f1\b\u000b"+
		"\n\u000b\f\u000b\u00f4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00fc\b\f\n\f\f\f\u00ff\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0005\r\u0106\b\r\n\r\f\r\u0109\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0112\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0117\b"+
		"\u000e\u0001\u000e\u0005\u000e\u011a\b\u000e\n\u000e\f\u000e\u011d\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0126\b\u000f\u0001\u000f\u0005\u000f\u0129\b"+
		"\u000f\n\u000f\f\u000f\u012c\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0138\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u013c\b\u0011\n\u0011\f\u0011\u013f\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0148"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014d\b\u0012"+
		"\u0001\u0012\u0005\u0012\u0150\b\u0012\n\u0012\f\u0012\u0153\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u015b\b\u0013\n\u0013\f\u0013\u015e\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0166\b\u0014"+
		"\n\u0014\f\u0014\u0169\t\u0014\u0001\u0015\u0003\u0015\u016c\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0174\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u017c\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0184\b\u0016\u0001"+
		"\u0016\u0003\u0016\u0187\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u018c\b\u0017\n\u0017\f\u0017\u018f\t\u0017\u0001\u0018\u0003\u0018"+
		"\u0192\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u019f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01ab\b\u001e\n\u001e\f\u001e\u01ae\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01b3\b\u001f\u0001 \u0001 \u0001 \u0005"+
		" \u01b8\b \n \f \u01bb\t \u0001!\u0001!\u0001!\u0005!\u01c0\b!\n!\f!\u01c3"+
		"\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01cb\b\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d4"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01e1\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u01ec\b#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01f5\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u01fd\b$\u0001%\u0001%\u0001%\u0001%\u0005%\u0203\b%\n"+
		"%\f%\u0206\t%\u0003%\u0208\b%\u0001%\u0001%\u0001%\u0000\u0001\n&\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0004\u0001\u0000\u001e\u001f\u0001"+
		"\u0000%*\u0001\u0000 !\u0001\u0000\"$\u023c\u0000O\u0001\u0000\u0000\u0000"+
		"\u0002_\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006p"+
		"\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u009c\u0001"+
		"\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e\u00a8\u0001\u0000"+
		"\u0000\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000"+
		"\u0000\u0000\u0014\u00e7\u0001\u0000\u0000\u0000\u0016\u00e9\u0001\u0000"+
		"\u0000\u0000\u0018\u00f8\u0001\u0000\u0000\u0000\u001a\u0103\u0001\u0000"+
		"\u0000\u0000\u001c\u010d\u0001\u0000\u0000\u0000\u001e\u0121\u0001\u0000"+
		"\u0000\u0000 \u0130\u0001\u0000\u0000\u0000\"\u0133\u0001\u0000\u0000"+
		"\u0000$\u0143\u0001\u0000\u0000\u0000&\u0157\u0001\u0000\u0000\u0000("+
		"\u0162\u0001\u0000\u0000\u0000*\u016b\u0001\u0000\u0000\u0000,\u0186\u0001"+
		"\u0000\u0000\u0000.\u0188\u0001\u0000\u0000\u00000\u0191\u0001\u0000\u0000"+
		"\u00002\u0195\u0001\u0000\u0000\u00004\u019e\u0001\u0000\u0000\u00006"+
		"\u01a0\u0001\u0000\u0000\u00008\u01a3\u0001\u0000\u0000\u0000:\u01a5\u0001"+
		"\u0000\u0000\u0000<\u01a7\u0001\u0000\u0000\u0000>\u01af\u0001\u0000\u0000"+
		"\u0000@\u01b4\u0001\u0000\u0000\u0000B\u01bc\u0001\u0000\u0000\u0000D"+
		"\u01e0\u0001\u0000\u0000\u0000F\u01f4\u0001\u0000\u0000\u0000H\u01fc\u0001"+
		"\u0000\u0000\u0000J\u01fe\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RV\u0005\u0001\u0000\u0000SU\u0003\u0004\u0002\u0000"+
		"TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0002\u0000\u0000Z\u0001\u0001\u0000\u0000\u0000"+
		"[`\u0003&\u0013\u0000\\`\u0003\u001e\u000f\u0000]`\u0003\"\u0011\u0000"+
		"^`\u0003\u001c\u000e\u0000_[\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`\u0003\u0001"+
		"\u0000\u0000\u0000ao\u0003\b\u0004\u0000bo\u0003\u0012\t\u0000co\u0003"+
		"\u0014\n\u0000do\u0003\u0016\u000b\u0000eo\u0003\u0018\f\u0000fo\u0003"+
		"\u001a\r\u0000go\u0003,\u0016\u0000ho\u0003\u0006\u0003\u0000io\u0003"+
		"2\u0019\u0000jo\u00034\u001a\u0000ko\u00036\u001b\u0000lo\u00038\u001c"+
		"\u0000mo\u0003:\u001d\u0000na\u0001\u0000\u0000\u0000nb\u0001\u0000\u0000"+
		"\u0000nc\u0001\u0000\u0000\u0000nd\u0001\u0000\u0000\u0000ne\u0001\u0000"+
		"\u0000\u0000nf\u0001\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000nh\u0001"+
		"\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000"+
		"nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000o\u0005\u0001\u0000\u0000\u0000pq\u0005\r\u0000\u0000qr\u00053\u0000"+
		"\u0000rt\u0005.\u0000\u0000su\u0003(\u0014\u0000ts\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0005/\u0000\u0000"+
		"wx\u0005\u000e\u0000\u0000xz\u0003\n\u0005\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z~\u0001\u0000\u0000\u0000{}\u0003\u0004\u0002"+
		"\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0006\u0000"+
		"\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0007\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0003\n\u0005\u0000\u0085\u0088\u00053\u0000\u0000\u0086"+
		"\u0087\u0005-\u0000\u0000\u0087\u0089\u0003:\u001d\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0094\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0003\f\u0006\u0000\u008b\u008c\u00053"+
		"\u0000\u0000\u008c\u0094\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u000e"+
		"\u0007\u0000\u008e\u008f\u00053\u0000\u0000\u008f\u0094\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u00053\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0084\u0001\u0000\u0000\u0000"+
		"\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0094\t\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0006\u0005\uffff\uffff\u0000\u0096\u009d\u0005\u0019\u0000\u0000"+
		"\u0097\u009d\u0005\u001a\u0000\u0000\u0098\u009d\u0005\u001b\u0000\u0000"+
		"\u0099\u009d\u0005\u001c\u0000\u0000\u009a\u009d\u0005\u001d\u0000\u0000"+
		"\u009b\u009d\u00053\u0000\u0000\u009c\u0095\u0001\u0000\u0000\u0000\u009c"+
		"\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u00a3\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\n\u0002\u0000\u0000\u009f\u00a0\u00050\u0000\u0000\u00a0\u00a2"+
		"\u00051\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u00053\u0000\u0000\u00a7\r\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u00053\u0000\u0000\u00a9\u000f\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u00053\u0000\u0000\u00ab\u0011\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u00053\u0000\u0000\u00ad\u00ae\u0005-\u0000\u0000\u00ae\u00bc"+
		"\u0003:\u001d\u0000\u00af\u00b0\u00053\u0000\u0000\u00b0\u00b1\u0005,"+
		"\u0000\u0000\u00b1\u00b2\u00053\u0000\u0000\u00b2\u00b3\u0005-\u0000\u0000"+
		"\u00b3\u00bc\u0003:\u001d\u0000\u00b4\u00b5\u00053\u0000\u0000\u00b5\u00b6"+
		"\u00050\u0000\u0000\u00b6\u00b7\u0003:\u001d\u0000\u00b7\u00b8\u00051"+
		"\u0000\u0000\u00b8\u00b9\u0005-\u0000\u0000\u00b9\u00ba\u0003:\u001d\u0000"+
		"\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00ac\u0001\u0000\u0000\u0000"+
		"\u00bb\u00af\u0001\u0000\u0000\u0000\u00bb\u00b4\u0001\u0000\u0000\u0000"+
		"\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0003\u0000\u0000"+
		"\u00be\u00c2\u0003:\u001d\u0000\u00bf\u00c1\u0003\u0004\u0002\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00d0\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005\u0004\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7"+
		"\u00cb\u0003:\u001d\u0000\u00c8\u00ca\u0003\u0004\u0002\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00c5"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00da"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d7"+
		"\u0005\u0004\u0000\u0000\u00d4\u00d6\u0003\u0004\u0002\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00d3"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0006\u0000\u0000\u00dd\u00de"+
		"\u0005\u0003\u0000\u0000\u00de\u00e8\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\u0003\u0000\u0000\u00e0\u00e1\u0003:\u001d\u0000\u00e1\u00e2\u0005"+
		"\u0005\u0000\u0000\u00e2\u00e5\u0003\u0004\u0002\u0000\u00e3\u00e4\u0005"+
		"\u0004\u0000\u0000\u00e4\u00e6\u0003\u0004\u0002\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00bd\u0001\u0000\u0000\u0000\u00e7\u00df\u0001"+
		"\u0000\u0000\u0000\u00e8\u0015\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005"+
		"\u0007\u0000\u0000\u00ea\u00eb\u00053\u0000\u0000\u00eb\u00ec\u0005\b"+
		"\u0000\u0000\u00ec\u00ed\u0003:\u001d\u0000\u00ed\u00ee\u0005\t\u0000"+
		"\u0000\u00ee\u00f2\u0003:\u001d\u0000\u00ef\u00f1\u0003\u0004\u0002\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005\u0006\u0000\u0000\u00f6\u00f7\u0005\u0007\u0000\u0000"+
		"\u00f7\u0017\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\n\u0000\u0000\u00f9"+
		"\u00fd\u0003:\u001d\u0000\u00fa\u00fc\u0003\u0004\u0002\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005\u0006\u0000\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0019\u0001"+
		"\u0000\u0000\u0000\u0103\u0107\u0005\u000b\u0000\u0000\u0104\u0106\u0003"+
		"\u0004\u0002\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0006\u0000\u0000\u010b\u010c\u0005"+
		"\u000b\u0000\u0000\u010c\u001b\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"\r\u0000\u0000\u010e\u010f\u00053\u0000\u0000\u010f\u0111\u0005.\u0000"+
		"\u0000\u0110\u0112\u0003(\u0014\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0116\u0005/\u0000\u0000\u0114\u0115\u0005\u000e\u0000\u0000\u0115"+
		"\u0117\u0003\n\u0005\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u011b\u0001\u0000\u0000\u0000\u0118\u011a"+
		"\u0003\u0004\u0002\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0006\u0000\u0000\u011f\u0120"+
		"\u0005\r\u0000\u0000\u0120\u001d\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"\u000f\u0000\u0000\u0122\u0125\u00053\u0000\u0000\u0123\u0124\u0005\u0010"+
		"\u0000\u0000\u0124\u0126\u00053\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u012a\u0001\u0000\u0000"+
		"\u0000\u0127\u0129\u0003 \u0010\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0006\u0000\u0000"+
		"\u012e\u012f\u0005\u000f\u0000\u0000\u012f\u001f\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0003\n\u0005\u0000\u0131\u0132\u00053\u0000\u0000\u0132"+
		"!\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0011\u0000\u0000\u0134\u0137"+
		"\u00053\u0000\u0000\u0135\u0136\u0005\u0012\u0000\u0000\u0136\u0138\u0005"+
		"3\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013d\u0001\u0000\u0000\u0000\u0139\u013c\u0003 \u0010"+
		"\u0000\u013a\u013c\u0003$\u0012\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0005\u0006\u0000\u0000\u0141\u0142\u0005\u0011\u0000\u0000"+
		"\u0142#\u0001\u0000\u0000\u0000\u0143\u0144\u0005\r\u0000\u0000\u0144"+
		"\u0145\u00053\u0000\u0000\u0145\u0147\u0005.\u0000\u0000\u0146\u0148\u0003"+
		"(\u0014\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014c\u0005/\u0000"+
		"\u0000\u014a\u014b\u0005\u000e\u0000\u0000\u014b\u014d\u0003\n\u0005\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u0151\u0001\u0000\u0000\u0000\u014e\u0150\u0003\u0004\u0002\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0005\u0006\u0000\u0000\u0155\u0156\u0005\r\u0000\u0000\u0156"+
		"%\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0013\u0000\u0000\u0158\u015c"+
		"\u00053\u0000\u0000\u0159\u015b\u0003 \u0010\u0000\u015a\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0006"+
		"\u0000\u0000\u0160\u0161\u0005\u0013\u0000\u0000\u0161\'\u0001\u0000\u0000"+
		"\u0000\u0162\u0167\u0003*\u0015\u0000\u0163\u0164\u00052\u0000\u0000\u0164"+
		"\u0166\u0003*\u0015\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0169"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168)\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0005\u0014\u0000\u0000\u016b\u016a\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0003\n\u0005\u0000\u016e\u016f\u00053"+
		"\u0000\u0000\u016f+\u0001\u0000\u0000\u0000\u0170\u0171\u00053\u0000\u0000"+
		"\u0171\u0173\u0005.\u0000\u0000\u0172\u0174\u0003.\u0017\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0187\u0005/\u0000\u0000\u0176\u0177\u0005"+
		"3\u0000\u0000\u0177\u0178\u0005,\u0000\u0000\u0178\u0179\u00053\u0000"+
		"\u0000\u0179\u017b\u0005.\u0000\u0000\u017a\u017c\u0003.\u0017\u0000\u017b"+
		"\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u0187\u0005/\u0000\u0000\u017e\u017f"+
		"\u00053\u0000\u0000\u017f\u0180\u0005+\u0000\u0000\u0180\u0181\u00053"+
		"\u0000\u0000\u0181\u0183\u0005.\u0000\u0000\u0182\u0184\u0003.\u0017\u0000"+
		"\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0005/\u0000\u0000\u0186"+
		"\u0170\u0001\u0000\u0000\u0000\u0186\u0176\u0001\u0000\u0000\u0000\u0186"+
		"\u017e\u0001\u0000\u0000\u0000\u0187-\u0001\u0000\u0000\u0000\u0188\u018d"+
		"\u00030\u0018\u0000\u0189\u018a\u00052\u0000\u0000\u018a\u018c\u00030"+
		"\u0018\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e/\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u0190\u0192\u0005\u0014\u0000\u0000\u0191\u0190\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0003:\u001d\u0000\u01941\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0005\u0015\u0000\u0000\u0196\u0197\u0003:\u001d\u0000\u01973\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u0016\u0000\u0000\u0199\u019a\u0005"+
		".\u0000\u0000\u019a\u019f\u0005/\u0000\u0000\u019b\u019c\u0005\u0017\u0000"+
		"\u0000\u019c\u019d\u0005.\u0000\u0000\u019d\u019f\u0005/\u0000\u0000\u019e"+
		"\u0198\u0001\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019f"+
		"5\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0018\u0000\u0000\u01a1\u01a2"+
		"\u0003:\u001d\u0000\u01a27\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\f"+
		"\u0000\u0000\u01a49\u0001\u0000\u0000\u0000\u01a5\u01a6\u0003<\u001e\u0000"+
		"\u01a6;\u0001\u0000\u0000\u0000\u01a7\u01ac\u0003>\u001f\u0000\u01a8\u01a9"+
		"\u0007\u0000\u0000\u0000\u01a9\u01ab\u0003>\u001f\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad=\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b2\u0003@ \u0000"+
		"\u01b0\u01b1\u0007\u0001\u0000\u0000\u01b1\u01b3\u0003@ \u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3?\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b9\u0003B!\u0000\u01b5\u01b6\u0007\u0002\u0000"+
		"\u0000\u01b6\u01b8\u0003B!\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8"+
		"\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01baA\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bc\u01c1\u0003D\"\u0000\u01bd\u01be\u0007"+
		"\u0003\u0000\u0000\u01be\u01c0\u0003D\"\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2C\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01e1\u0003F#\u0000\u01c5"+
		"\u01c6\u0003F#\u0000\u01c6\u01c7\u0005+\u0000\u0000\u01c7\u01c8\u0005"+
		"3\u0000\u0000\u01c8\u01ca\u0005.\u0000\u0000\u01c9\u01cb\u0003.\u0017"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005/\u0000\u0000"+
		"\u01cd\u01e1\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003F#\u0000\u01cf\u01d0"+
		"\u0005,\u0000\u0000\u01d0\u01d1\u00053\u0000\u0000\u01d1\u01d3\u0005."+
		"\u0000\u0000\u01d2\u01d4\u0003.\u0017\u0000\u01d3\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0005/\u0000\u0000\u01d6\u01e1\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0003F#\u0000\u01d8\u01d9\u0005,\u0000\u0000\u01d9\u01da"+
		"\u00053\u0000\u0000\u01da\u01e1\u0001\u0000\u0000\u0000\u01db\u01dc\u0003"+
		"F#\u0000\u01dc\u01dd\u00050\u0000\u0000\u01dd\u01de\u0003:\u001d\u0000"+
		"\u01de\u01df\u00051\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0"+
		"\u01c4\u0001\u0000\u0000\u0000\u01e0\u01c5\u0001\u0000\u0000\u0000\u01e0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01e0\u01d7\u0001\u0000\u0000\u0000\u01e0"+
		"\u01db\u0001\u0000\u0000\u0000\u01e1E\u0001\u0000\u0000\u0000\u01e2\u01f5"+
		"\u00053\u0000\u0000\u01e3\u01f5\u0003H$\u0000\u01e4\u01e5\u0005.\u0000"+
		"\u0000\u01e5\u01e6\u0003:\u001d\u0000\u01e6\u01e7\u0005/\u0000\u0000\u01e7"+
		"\u01f5\u0001\u0000\u0000\u0000\u01e8\u01e9\u00053\u0000\u0000\u01e9\u01eb"+
		"\u0005.\u0000\u0000\u01ea\u01ec\u0003.\u0017\u0000\u01eb\u01ea\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01f5\u0005/\u0000\u0000\u01ee\u01ef\u0005\u0016\u0000"+
		"\u0000\u01ef\u01f0\u0005.\u0000\u0000\u01f0\u01f5\u0005/\u0000\u0000\u01f1"+
		"\u01f2\u0005\u0017\u0000\u0000\u01f2\u01f3\u0005.\u0000\u0000\u01f3\u01f5"+
		"\u0005/\u0000\u0000\u01f4\u01e2\u0001\u0000\u0000\u0000\u01f4\u01e3\u0001"+
		"\u0000\u0000\u0000\u01f4\u01e4\u0001\u0000\u0000\u0000\u01f4\u01e8\u0001"+
		"\u0000\u0000\u0000\u01f4\u01ee\u0001\u0000\u0000\u0000\u01f4\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f5G\u0001\u0000\u0000\u0000\u01f6\u01fd\u00054\u0000"+
		"\u0000\u01f7\u01fd\u00055\u0000\u0000\u01f8\u01fd\u00056\u0000\u0000\u01f9"+
		"\u01fd\u00057\u0000\u0000\u01fa\u01fd\u00058\u0000\u0000\u01fb\u01fd\u0003"+
		"J%\u0000\u01fc\u01f6\u0001\u0000\u0000\u0000\u01fc\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fc\u01f8\u0001\u0000\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fdI\u0001\u0000\u0000\u0000\u01fe\u0207\u00050\u0000\u0000\u01ff"+
		"\u0204\u0003:\u001d\u0000\u0200\u0201\u00052\u0000\u0000\u0201\u0203\u0003"+
		":\u001d\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000"+
		"\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000"+
		"\u0000\u0000\u0207\u01ff\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u00051\u0000"+
		"\u0000\u020aK\u0001\u0000\u0000\u00007OV_nty~\u0088\u0093\u009c\u00a3"+
		"\u00bb\u00c2\u00cb\u00d0\u00d7\u00da\u00e5\u00e7\u00f2\u00fd\u0107\u0111"+
		"\u0116\u011b\u0125\u012a\u0137\u013b\u013d\u0147\u014c\u0151\u015c\u0167"+
		"\u016b\u0173\u017b\u0183\u0186\u018d\u0191\u019e\u01ac\u01b2\u01b9\u01c1"+
		"\u01ca\u01d3\u01e0\u01eb\u01f4\u01fc\u0204\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}