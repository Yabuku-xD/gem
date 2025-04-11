// Generated from c:\Users\Yabuku\Desktop\gem\src\main\antlr4\gem.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gemLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"START", "FINISH", "IF", "ELSE", "THEN", "FOR", "FROM", "TO", "WHILE", 
			"LOOP", "PRINT", "FUNCTION", "RETURNS", "STRUCT", "EXTENDS", "CLASS", 
			"IS", "END", "RETURN", "BREAK", "MESSAGE", "REF", "READ_LINE", "READ_INTEGER", 
			"STRING_TYPE", "INTEGER_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "CHAR_TYPE", 
			"BOOLEAN", "ID", "INT", "FLOAT", "STRING", "CHAR", "PLUS", "MINUS", "MULT", 
			"DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "DOT", "COMMA", "ARROW", "COMMENT", "WS"
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


	public gemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u012e\n\37\3 \3 \7 \u0132\n \f \16 \u0135\13 \3!\5"+
		"!\u0138\n!\3!\6!\u013b\n!\r!\16!\u013c\3\"\5\"\u0140\n\"\3\"\6\"\u0143"+
		"\n\"\r\"\16\"\u0144\3\"\3\"\6\"\u0149\n\"\r\"\16\"\u014a\3#\3#\7#\u014f"+
		"\n#\f#\16#\u0152\13#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\7\67\u0187\n\67\f\67\16\67\u018a\13\67\3\67\3\67\38\68\u018f\n8"+
		"\r8\168\u0190\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\f\f"+
		"\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u019d\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2"+
		"\2\5w\3\2\2\2\7~\3\2\2\2\t\u0081\3\2\2\2\13\u0086\3\2\2\2\r\u008b\3\2"+
		"\2\2\17\u008f\3\2\2\2\21\u0094\3\2\2\2\23\u0097\3\2\2\2\25\u009d\3\2\2"+
		"\2\27\u00a2\3\2\2\2\31\u00a8\3\2\2\2\33\u00b1\3\2\2\2\35\u00b9\3\2\2\2"+
		"\37\u00c0\3\2\2\2!\u00c8\3\2\2\2#\u00ce\3\2\2\2%\u00d1\3\2\2\2\'\u00d5"+
		"\3\2\2\2)\u00dc\3\2\2\2+\u00e2\3\2\2\2-\u00ea\3\2\2\2/\u00ee\3\2\2\2\61"+
		"\u00f8\3\2\2\2\63\u0105\3\2\2\2\65\u010c\3\2\2\2\67\u0114\3\2\2\29\u011b"+
		"\3\2\2\2;\u0123\3\2\2\2=\u012d\3\2\2\2?\u012f\3\2\2\2A\u0137\3\2\2\2C"+
		"\u013f\3\2\2\2E\u014c\3\2\2\2G\u0155\3\2\2\2I\u0159\3\2\2\2K\u015b\3\2"+
		"\2\2M\u015d\3\2\2\2O\u015f\3\2\2\2Q\u0161\3\2\2\2S\u0163\3\2\2\2U\u0165"+
		"\3\2\2\2W\u0168\3\2\2\2Y\u016b\3\2\2\2[\u016e\3\2\2\2]\u0171\3\2\2\2_"+
		"\u0173\3\2\2\2a\u0175\3\2\2\2c\u0177\3\2\2\2e\u0179\3\2\2\2g\u017b\3\2"+
		"\2\2i\u017d\3\2\2\2k\u017f\3\2\2\2m\u0182\3\2\2\2o\u018e\3\2\2\2qr\7u"+
		"\2\2rs\7v\2\2st\7c\2\2tu\7t\2\2uv\7v\2\2v\4\3\2\2\2wx\7h\2\2xy\7k\2\2"+
		"yz\7p\2\2z{\7k\2\2{|\7u\2\2|}\7j\2\2}\6\3\2\2\2~\177\7k\2\2\177\u0080"+
		"\7h\2\2\u0080\b\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7u\2\2\u0084\u0085\7g\2\2\u0085\n\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7j\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\f\3\2\2\2\u008b\u008c"+
		"\7h\2\2\u008c\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e\16\3\2\2\2\u008f\u0090"+
		"\7h\2\2\u0090\u0091\7t\2\2\u0091\u0092\7q\2\2\u0092\u0093\7o\2\2\u0093"+
		"\20\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7q\2\2\u0096\22\3\2\2\2\u0097"+
		"\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7g\2\2\u009c\24\3\2\2\2\u009d\u009e\7n\2\2\u009e\u009f\7"+
		"q\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7r\2\2\u00a1\26\3\2\2\2\u00a2\u00a3"+
		"\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7w\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2"+
		"\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7"+
		"t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7u\2\2\u00b8\34\3\2\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7e\2\2\u00be\u00bf\7v\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7z\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00c6\7f\2\2\u00c6\u00c7\7u\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7e\2"+
		"\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7u\2\2\u00d0$\3"+
		"\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7f\2\2\u00d4"+
		"&\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db(\3\2\2\2\u00dc"+
		"\u00dd\7d\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7c\2\2"+
		"\u00e0\u00e1\7m\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7g\2"+
		"\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8"+
		"\7i\2\2\u00e8\u00e9\7g\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7h\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7g\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7a\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7\60\3\2\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7"+
		"c\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7a\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7p\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102\7i\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104\62\3\2\2\2\u0105\u0106\7u\2\2\u0106"+
		"\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2"+
		"\u010a\u010b\7i\2\2\u010b\64\3\2\2\2\u010c\u010d\7k\2\2\u010d\u010e\7"+
		"p\2\2\u010e\u010f\7v\2\2\u010f\u0110\7g\2\2\u0110\u0111\7i\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7t\2\2\u0113\66\3\2\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7w\2\2\u0116\u0117\7o\2\2\u0117\u0118\7d\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7t\2\2\u011a8\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7q\2\2\u011d"+
		"\u011e\7q\2\2\u011e\u011f\7n\2\2\u011f\u0120\7g\2\2\u0120\u0121\7c\2\2"+
		"\u0121\u0122\7p\2\2\u0122:\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7j\2"+
		"\2\u0125\u0126\7c\2\2\u0126\u0127\7t\2\2\u0127<\3\2\2\2\u0128\u0129\7"+
		"{\2\2\u0129\u012a\7g\2\2\u012a\u012e\7u\2\2\u012b\u012c\7p\2\2\u012c\u012e"+
		"\7q\2\2\u012d\u0128\3\2\2\2\u012d\u012b\3\2\2\2\u012e>\3\2\2\2\u012f\u0133"+
		"\t\2\2\2\u0130\u0132\t\3\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134@\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0136\u0138\7/\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dB\3\2\2\2\u013e\u0140\7/\2\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\t\4"+
		"\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\7\60\2\2\u0147\u0149\t"+
		"\4\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014bD\3\2\2\2\u014c\u0150\7$\2\2\u014d\u014f\n\5\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154"+
		"F\3\2\2\2\u0155\u0156\7)\2\2\u0156\u0157\13\2\2\2\u0157\u0158\7)\2\2\u0158"+
		"H\3\2\2\2\u0159\u015a\7-\2\2\u015aJ\3\2\2\2\u015b\u015c\7/\2\2\u015cL"+
		"\3\2\2\2\u015d\u015e\7,\2\2\u015eN\3\2\2\2\u015f\u0160\7\61\2\2\u0160"+
		"P\3\2\2\2\u0161\u0162\7>\2\2\u0162R\3\2\2\2\u0163\u0164\7@\2\2\u0164T"+
		"\3\2\2\2\u0165\u0166\7>\2\2\u0166\u0167\7?\2\2\u0167V\3\2\2\2\u0168\u0169"+
		"\7@\2\2\u0169\u016a\7?\2\2\u016aX\3\2\2\2\u016b\u016c\7?\2\2\u016c\u016d"+
		"\7?\2\2\u016dZ\3\2\2\2\u016e\u016f\7#\2\2\u016f\u0170\7?\2\2\u0170\\\3"+
		"\2\2\2\u0171\u0172\7?\2\2\u0172^\3\2\2\2\u0173\u0174\7*\2\2\u0174`\3\2"+
		"\2\2\u0175\u0176\7+\2\2\u0176b\3\2\2\2\u0177\u0178\7]\2\2\u0178d\3\2\2"+
		"\2\u0179\u017a\7_\2\2\u017af\3\2\2\2\u017b\u017c\7\60\2\2\u017ch\3\2\2"+
		"\2\u017d\u017e\7.\2\2\u017ej\3\2\2\2\u017f\u0180\7/\2\2\u0180\u0181\7"+
		"@\2\2\u0181l\3\2\2\2\u0182\u0183\7/\2\2\u0183\u0184\7/\2\2\u0184\u0188"+
		"\3\2\2\2\u0185\u0187\n\6\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018b\u018c\b\67\2\2\u018cn\3\2\2\2\u018d\u018f\t\7\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\b8\2\2\u0193p\3\2\2\2\r\2\u012d\u0133\u0137"+
		"\u013c\u013f\u0144\u014a\u0150\u0188\u0190\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}