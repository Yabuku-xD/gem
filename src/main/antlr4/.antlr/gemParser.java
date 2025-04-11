// Generated from c:\Users\Yabuku\Desktop\gem\src\main\antlr4\gem.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FINISH=2, IF=3, ELSE=4, THEN=5, FOR=6, FROM=7, TO=8, WHILE=9, 
		LOOP=10, PRINT=11, FUNCTION=12, RETURNS=13, STRUCT=14, EXTENDS=15, CLASS=16, 
		IS=17, END=18, RETURN=19, BREAK=20, MESSAGE=21, REF=22, READ_LINE=23, 
		READ_INTEGER=24, STRING_TYPE=25, INTEGER_TYPE=26, NUMBER_TYPE=27, BOOLEAN_TYPE=28, 
		CHAR_TYPE=29, BOOLEAN=30, ID=31, INT=32, FLOAT=33, STRING=34, CHAR=35, 
		PLUS=36, MINUS=37, MULT=38, DIV=39, LT=40, GT=41, LE=42, GE=43, EQ=44, 
		NE=45, ASSIGN=46, LPAREN=47, RPAREN=48, LBRACK=49, RBRACK=50, DOT=51, 
		COMMA=52, ARROW=53, COMMENT=54, WS=55;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_assignment = 3, 
		RULE_lvalue = 4, RULE_ifStatement = 5, RULE_block = 6, RULE_forLoop = 7, 
		RULE_whileLoop = 8, RULE_loopStatement = 9, RULE_printStatement = 10, 
		RULE_readStatement = 11, RULE_functionDefinition = 12, RULE_structDefinition = 13, 
		RULE_field = 14, RULE_classDefinition = 15, RULE_returnStatement = 16, 
		RULE_breakStatement = 17, RULE_messageDefinition = 18, RULE_parameterList = 19, 
		RULE_parameter = 20, RULE_expression = 21, RULE_logicalExpression = 22, 
		RULE_comparisonExpression = 23, RULE_additiveExpression = 24, RULE_multiplicativeExpression = 25, 
		RULE_primaryExpression = 26, RULE_literal = 27, RULE_messagePassingCall = 28, 
		RULE_functionCall = 29, RULE_expressionList = 30, RULE_arrayAccess = 31, 
		RULE_memberAccess = 32, RULE_arrayLiteral = 33, RULE_type = 34, RULE_basicType = 35, 
		RULE_arrayDimension = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "assignment", "lvalue", 
			"ifStatement", "block", "forLoop", "whileLoop", "loopStatement", "printStatement", 
			"readStatement", "functionDefinition", "structDefinition", "field", "classDefinition", 
			"returnStatement", "breakStatement", "messageDefinition", "parameterList", 
			"parameter", "expression", "logicalExpression", "comparisonExpression", 
			"additiveExpression", "multiplicativeExpression", "primaryExpression", 
			"literal", "messagePassingCall", "functionCall", "expressionList", "arrayAccess", 
			"memberAccess", "arrayLiteral", "type", "basicType", "arrayDimension"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'finish'", "'if'", "'else'", "'then'", "'for'", "'from'", 
			"'to'", "'while'", "'loop'", "'print'", "'function'", "'returns'", "'struct'", 
			"'extends'", "'class'", "'is'", "'end'", "'return'", "'break'", "'message'", 
			"'ref'", "'read_line'", "'read_integer'", "'string'", "'integer'", "'number'", 
			"'boolean'", "'char'", null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'='", "'('", 
			"')'", "'['", "']'", "'.'", "','", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FINISH", "IF", "ELSE", "THEN", "FOR", "FROM", "TO", "WHILE", 
			"LOOP", "PRINT", "FUNCTION", "RETURNS", "STRUCT", "EXTENDS", "CLASS", 
			"IS", "END", "RETURN", "BREAK", "MESSAGE", "REF", "READ_LINE", "READ_INTEGER", 
			"STRING_TYPE", "INTEGER_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "CHAR_TYPE", 
			"BOOLEAN", "ID", "INT", "FLOAT", "STRING", "CHAR", "PLUS", "MINUS", "MULT", 
			"DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "DOT", "COMMA", "ARROW", "COMMENT", "WS"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(gemParser.START, 0); }
		public TerminalNode FINISH() { return getToken(gemParser.FINISH, 0); }
		public TerminalNode EOF() { return getToken(gemParser.EOF, 0); }
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(START);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LOOP) | (1L << PRINT) | (1L << FUNCTION) | (1L << STRUCT) | (1L << CLASS) | (1L << RETURN) | (1L << BREAK) | (1L << MESSAGE) | (1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(FINISH);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public MessageDefinitionContext messageDefinition() {
			return getRuleContext(MessageDefinitionContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				readStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				functionDefinition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				structDefinition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
				classDefinition();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(97);
				breakStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(98);
				messageDefinition();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gemParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			type();
			setState(102);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(103);
				match(ASSIGN);
				setState(104);
				expression();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gemParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			lvalue();
			setState(108);
			match(ASSIGN);
			setState(109);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lvalue);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				memberAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				arrayAccess();
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
		public TerminalNode THEN() { return getToken(gemParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public List<TerminalNode> ELSE() { return getTokens(gemParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(gemParser.ELSE, i);
		}
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(IF);
				setState(117);
				expression();
				setState(118);
				match(THEN);
				setState(119);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(IF);
				setState(122);
				expression();
				setState(123);
				block();
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						match(ELSE);
						setState(125);
						match(IF);
						setState(126);
						expression();
						setState(127);
						block();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(134);
					match(ELSE);
					setState(135);
					block();
					}
				}

				setState(138);
				match(END);
				setState(139);
				match(IF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LOOP) | (1L << PRINT) | (1L << FUNCTION) | (1L << STRUCT) | (1L << CLASS) | (1L << RETURN) | (1L << BREAK) | (1L << MESSAGE) | (1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(143);
				statement();
				}
				}
				setState(148);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
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
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FOR);
			setState(150);
			match(ID);
			setState(151);
			match(FROM);
			setState(152);
			expression();
			setState(153);
			match(TO);
			setState(154);
			expression();
			setState(155);
			block();
			setState(156);
			match(END);
			setState(157);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public List<TerminalNode> WHILE() { return getTokens(gemParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(gemParser.WHILE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
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
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(WHILE);
			setState(160);
			expression();
			setState(161);
			block();
			setState(162);
			match(END);
			setState(163);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public List<TerminalNode> LOOP() { return getTokens(gemParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(gemParser.LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LOOP);
			setState(166);
			block();
			setState(167);
			match(END);
			setState(168);
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
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PRINT);
			setState(171);
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

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gemParser.ASSIGN, 0); }
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
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readStatement);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				setState(174);
				match(ASSIGN);
				setState(175);
				match(READ_LINE);
				setState(176);
				match(LPAREN);
				setState(177);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(ID);
				setState(179);
				match(ASSIGN);
				setState(180);
				match(READ_INTEGER);
				setState(181);
				match(LPAREN);
				setState(182);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(gemParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(gemParser.FUNCTION, i);
		}
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public TerminalNode RETURNS() { return getToken(gemParser.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(gemParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(FUNCTION);
			setState(186);
			match(ID);
			setState(187);
			match(LPAREN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REF) | (1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) {
				{
				setState(188);
				parameterList();
				}
			}

			setState(191);
			match(RPAREN);
			setState(192);
			match(RETURNS);
			setState(193);
			type();
			setState(194);
			block();
			setState(195);
			match(END);
			setState(196);
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

	public static class StructDefinitionContext extends ParserRuleContext {
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
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(STRUCT);
			setState(199);
			match(ID);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(200);
				match(EXTENDS);
				setState(201);
				match(ID);
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(204);
				field();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(END);
			setState(211);
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
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			type();
			setState(214);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
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
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitClassDefinition(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CLASS);
			setState(217);
			match(ID);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(218);
				match(IS);
				setState(219);
				match(ID);
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) {
				{
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_TYPE:
				case INTEGER_TYPE:
				case NUMBER_TYPE:
				case BOOLEAN_TYPE:
				case CHAR_TYPE:
				case ID:
					{
					setState(222);
					field();
					}
					break;
				case FUNCTION:
					{
					setState(223);
					functionDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(END);
			setState(230);
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
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(RETURN);
			setState(233);
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
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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

	public static class MessageDefinitionContext extends ParserRuleContext {
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
		public MessageDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMessageDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMessageDefinition(this);
		}
	}

	public final MessageDefinitionContext messageDefinition() throws RecognitionException {
		MessageDefinitionContext _localctx = new MessageDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_messageDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(MESSAGE);
			setState(238);
			match(ID);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(239);
				field();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(END);
			setState(246);
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
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			parameter();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				parameter();
				}
				}
				setState(255);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(256);
				match(REF);
				}
			}

			setState(259);
			type();
			setState(260);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
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
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			comparisonExpression();
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
		public TerminalNode NE() { return getToken(gemParser.NE, 0); }
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
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			additiveExpression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) {
				{
				setState(267);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			multiplicativeExpression();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				multiplicativeExpression();
				}
				}
				setState(278);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(gemParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gemParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(gemParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(gemParser.DIV, i);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			primaryExpression();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				primaryExpression();
				}
				}
				setState(286);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MessagePassingCallContext messagePassingCall() {
			return getRuleContext(MessagePassingCallContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public TerminalNode REF() { return getToken(gemParser.REF, 0); }
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExpression);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(LPAREN);
				setState(288);
				expression();
				setState(289);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				messagePassingCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				arrayAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				memberAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				match(REF);
				setState(296);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode INT() { return getToken(gemParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gemParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(gemParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(gemParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(gemParser.BOOLEAN, 0); }
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(BOOLEAN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
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

	public static class MessagePassingCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(gemParser.ARROW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MessagePassingCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messagePassingCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMessagePassingCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMessagePassingCall(this);
		}
	}

	public final MessagePassingCallContext messagePassingCall() throws RecognitionException {
		MessagePassingCallContext _localctx = new MessagePassingCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_messagePassingCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(ID);
			setState(310);
			match(ARROW);
			setState(311);
			functionCall();
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
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gemParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gemParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ID);
			setState(314);
			match(LPAREN);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REF) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LPAREN) | (1L << LBRACK))) != 0)) {
				{
				setState(315);
				expressionList();
				}
			}

			setState(318);
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

	public static class ExpressionListContext extends ParserRuleContext {
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			expression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(321);
				match(COMMA);
				setState(322);
				expression();
				}
				}
				setState(327);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ID);
			setState(329);
			match(LBRACK);
			setState(330);
			expression();
			setState(331);
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

	public static class MemberAccessContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gemParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(gemParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(gemParser.DOT, i);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitMemberAccess(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(334);
			match(DOT);
			setState(335);
			match(ID);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(336);
				match(DOT);
				setState(337);
				match(ID);
				}
				}
				setState(342);
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LBRACK);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REF) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LPAREN) | (1L << LBRACK))) != 0)) {
				{
				setState(344);
				expressionList();
				}
			}

			setState(347);
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

	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ArrayDimensionContext arrayDimension() {
			return getRuleContext(ArrayDimensionContext.class,0);
		}
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			basicType();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(350);
				arrayDimension();
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(gemParser.STRING_TYPE, 0); }
		public TerminalNode INTEGER_TYPE() { return getToken(gemParser.INTEGER_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(gemParser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(gemParser.BOOLEAN_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(gemParser.CHAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(gemParser.ID, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitBasicType(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TYPE) | (1L << INTEGER_TYPE) | (1L << NUMBER_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << ID))) != 0)) ) {
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

	public static class ArrayDimensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(gemParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(gemParser.RBRACK, 0); }
		public ArrayDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).enterArrayDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gemListener ) ((gemListener)listener).exitArrayDimension(this);
		}
	}

	public final ArrayDimensionContext arrayDimension() throws RecognitionException {
		ArrayDimensionContext _localctx = new ArrayDimensionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LBRACK);
			setState(356);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0169\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3f\n\3\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6u\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084\n\7\f"+
		"\7\16\7\u0087\13\7\3\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b"+
		"\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3\16\3\16\3\16"+
		"\5\16\u00c0\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u00cd\n\17\3\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00df\n\21\3\21\3\21\7\21"+
		"\u00e3\n\21\f\21\16\21\u00e6\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u00f3\n\24\f\24\16\24\u00f6\13\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\7\25\u00fe\n\25\f\25\16\25\u0101\13\25\3\26\5\26"+
		"\u0104\n\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\5\31\u0110"+
		"\n\31\3\32\3\32\3\32\7\32\u0115\n\32\f\32\16\32\u0118\13\32\3\33\3\33"+
		"\3\33\7\33\u011d\n\33\f\33\16\33\u0120\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012d\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0136\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u013f"+
		"\n\37\3\37\3\37\3 \3 \3 \7 \u0146\n \f \16 \u0149\13 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\7\"\u0155\n\"\f\"\16\"\u0158\13\"\3#\3#\5#\u015c\n"+
		"#\3#\3#\3$\3$\5$\u0162\n$\3%\3%\3&\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2*/\3\2&\'\3\2"+
		"()\4\2\33\37!!\2\u0177\2L\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\bm\3\2\2\2\nt"+
		"\3\2\2\2\f\u008f\3\2\2\2\16\u0094\3\2\2\2\20\u0097\3\2\2\2\22\u00a1\3"+
		"\2\2\2\24\u00a7\3\2\2\2\26\u00ac\3\2\2\2\30\u00b9\3\2\2\2\32\u00bb\3\2"+
		"\2\2\34\u00c8\3\2\2\2\36\u00d7\3\2\2\2 \u00da\3\2\2\2\"\u00ea\3\2\2\2"+
		"$\u00ed\3\2\2\2&\u00ef\3\2\2\2(\u00fa\3\2\2\2*\u0103\3\2\2\2,\u0108\3"+
		"\2\2\2.\u010a\3\2\2\2\60\u010c\3\2\2\2\62\u0111\3\2\2\2\64\u0119\3\2\2"+
		"\2\66\u012c\3\2\2\28\u0135\3\2\2\2:\u0137\3\2\2\2<\u013b\3\2\2\2>\u0142"+
		"\3\2\2\2@\u014a\3\2\2\2B\u014f\3\2\2\2D\u0159\3\2\2\2F\u015f\3\2\2\2H"+
		"\u0163\3\2\2\2J\u0165\3\2\2\2LP\7\3\2\2MO\5\4\3\2NM\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\4\2\2TU\7\2\2\3U\3\3\2\2"+
		"\2Vf\5\6\4\2Wf\5\b\5\2Xf\5<\37\2Yf\5\f\7\2Zf\5\20\t\2[f\5\22\n\2\\f\5"+
		"\24\13\2]f\5\26\f\2^f\5\30\r\2_f\5\32\16\2`f\5\34\17\2af\5 \21\2bf\5\""+
		"\22\2cf\5$\23\2df\5&\24\2eV\3\2\2\2eW\3\2\2\2eX\3\2\2\2eY\3\2\2\2eZ\3"+
		"\2\2\2e[\3\2\2\2e\\\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea"+
		"\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\5\3\2\2\2gh\5F$\2hk\7!\2\2ij\7"+
		"\60\2\2jl\5,\27\2ki\3\2\2\2kl\3\2\2\2l\7\3\2\2\2mn\5\n\6\2no\7\60\2\2"+
		"op\5,\27\2p\t\3\2\2\2qu\7!\2\2ru\5B\"\2su\5@!\2tq\3\2\2\2tr\3\2\2\2ts"+
		"\3\2\2\2u\13\3\2\2\2vw\7\5\2\2wx\5,\27\2xy\7\7\2\2yz\5\4\3\2z\u0090\3"+
		"\2\2\2{|\7\5\2\2|}\5,\27\2}\u0085\5\16\b\2~\177\7\6\2\2\177\u0080\7\5"+
		"\2\2\u0080\u0081\5,\27\2\u0081\u0082\5\16\b\2\u0082\u0084\3\2\2\2\u0083"+
		"~\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u008a\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\6\2\2\u0089\u008b"+
		"\5\16\b\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008c\u008d\7\24\2\2\u008d\u008e\7\5\2\2\u008e\u0090\3\2\2\2\u008fv\3"+
		"\2\2\2\u008f{\3\2\2\2\u0090\r\3\2\2\2\u0091\u0093\5\4\3\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\17\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\b\2\2\u0098\u0099\7!\2\2"+
		"\u0099\u009a\7\t\2\2\u009a\u009b\5,\27\2\u009b\u009c\7\n\2\2\u009c\u009d"+
		"\5,\27\2\u009d\u009e\5\16\b\2\u009e\u009f\7\24\2\2\u009f\u00a0\7\b\2\2"+
		"\u00a0\21\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5,\27\2\u00a3\u00a4"+
		"\5\16\b\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\7\13\2\2\u00a6\23\3\2\2\2\u00a7"+
		"\u00a8\7\f\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\7"+
		"\f\2\2\u00ab\25\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\5,\27\2\u00ae"+
		"\27\3\2\2\2\u00af\u00b0\7!\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\7\31\2"+
		"\2\u00b2\u00b3\7\61\2\2\u00b3\u00ba\7\62\2\2\u00b4\u00b5\7!\2\2\u00b5"+
		"\u00b6\7\60\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00ba"+
		"\7\62\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\31\3\2\2\2\u00bb"+
		"\u00bc\7\16\2\2\u00bc\u00bd\7!\2\2\u00bd\u00bf\7\61\2\2\u00be\u00c0\5"+
		"(\25\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\62\2\2\u00c2\u00c3\7\17\2\2\u00c3\u00c4\5F$\2\u00c4\u00c5\5\16"+
		"\b\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\7\16\2\2\u00c7\33\3\2\2\2\u00c8"+
		"\u00c9\7\20\2\2\u00c9\u00cc\7!\2\2\u00ca\u00cb\7\21\2\2\u00cb\u00cd\7"+
		"!\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce"+
		"\u00d0\5\36\20\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7\24\2\2\u00d5\u00d6\7\20\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\5F$"+
		"\2\u00d8\u00d9\7!\2\2\u00d9\37\3\2\2\2\u00da\u00db\7\22\2\2\u00db\u00de"+
		"\7!\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00df\7!\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e4\3\2\2\2\u00e0\u00e3\5\36\20\2\u00e1\u00e3\5"+
		"\32\16\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9\7\22\2\2\u00e9!\3\2\2\2\u00ea\u00eb"+
		"\7\25\2\2\u00eb\u00ec\5,\27\2\u00ec#\3\2\2\2\u00ed\u00ee\7\26\2\2\u00ee"+
		"%\3\2\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f4\7!\2\2\u00f1\u00f3\5\36\20"+
		"\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\24\2\2"+
		"\u00f8\u00f9\7\27\2\2\u00f9\'\3\2\2\2\u00fa\u00ff\5*\26\2\u00fb\u00fc"+
		"\7\66\2\2\u00fc\u00fe\5*\26\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100)\3\2\2\2\u0101\u00ff\3"+
		"\2\2\2\u0102\u0104\7\30\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\5F$\2\u0106\u0107\7!\2\2\u0107+\3\2\2\2\u0108"+
		"\u0109\5.\30\2\u0109-\3\2\2\2\u010a\u010b\5\60\31\2\u010b/\3\2\2\2\u010c"+
		"\u010f\5\62\32\2\u010d\u010e\t\2\2\2\u010e\u0110\5\62\32\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\61\3\2\2\2\u0111\u0116\5\64\33\2\u0112"+
		"\u0113\t\3\2\2\u0113\u0115\5\64\33\2\u0114\u0112\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\63\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011e\5\66\34\2\u011a\u011b\t\4\2\2\u011b\u011d\5"+
		"\66\34\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\65\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\61\2"+
		"\2\u0122\u0123\5,\27\2\u0123\u0124\7\62\2\2\u0124\u012d\3\2\2\2\u0125"+
		"\u012d\5<\37\2\u0126\u012d\5:\36\2\u0127\u012d\5@!\2\u0128\u012d\5B\""+
		"\2\u0129\u012a\7\30\2\2\u012a\u012d\7!\2\2\u012b\u012d\58\35\2\u012c\u0121"+
		"\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012b\3\2\2\2\u012d\67\3\2\2"+
		"\2\u012e\u0136\7!\2\2\u012f\u0136\7\"\2\2\u0130\u0136\7#\2\2\u0131\u0136"+
		"\7$\2\2\u0132\u0136\7%\2\2\u0133\u0136\7 \2\2\u0134\u0136\5D#\2\u0135"+
		"\u012e\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2"+
		"\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"9\3\2\2\2\u0137\u0138\7!\2\2\u0138\u0139\7\67\2\2\u0139\u013a\5<\37\2"+
		"\u013a;\3\2\2\2\u013b\u013c\7!\2\2\u013c\u013e\7\61\2\2\u013d\u013f\5"+
		"> \2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\7\62\2\2\u0141=\3\2\2\2\u0142\u0147\5,\27\2\u0143\u0144\7\66\2"+
		"\2\u0144\u0146\5,\27\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148?\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7!\2\2\u014b\u014c\7\63\2\2\u014c\u014d\5,\27\2\u014d\u014e\7\64"+
		"\2\2\u014eA\3\2\2\2\u014f\u0150\7!\2\2\u0150\u0151\7\65\2\2\u0151\u0156"+
		"\7!\2\2\u0152\u0153\7\65\2\2\u0153\u0155\7!\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157C\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0159\u015b\7\63\2\2\u015a\u015c\5> \2\u015b\u015a"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\64\2\2"+
		"\u015eE\3\2\2\2\u015f\u0161\5H%\2\u0160\u0162\5J&\2\u0161\u0160\3\2\2"+
		"\2\u0161\u0162\3\2\2\2\u0162G\3\2\2\2\u0163\u0164\t\5\2\2\u0164I\3\2\2"+
		"\2\u0165\u0166\7\63\2\2\u0166\u0167\7\64\2\2\u0167K\3\2\2\2\36Pekt\u0085"+
		"\u008a\u008f\u0094\u00b9\u00bf\u00cc\u00d1\u00de\u00e2\u00e4\u00f4\u00ff"+
		"\u0103\u010f\u0116\u011e\u012c\u0135\u013e\u0147\u0156\u015b\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}