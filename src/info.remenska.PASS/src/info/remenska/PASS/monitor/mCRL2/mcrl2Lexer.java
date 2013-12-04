// Generated from info/remenska/PASS/monitor/mCRL2/mcrl2.g4 by ANTLR 4.1
package info.remenska.PASS.monitor.mCRL2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mcrl2Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__81=1, T__80=2, T__79=3, T__78=4, T__77=5, T__76=6, T__75=7, T__74=8, 
		T__73=9, T__72=10, T__71=11, T__70=12, T__69=13, T__68=14, T__67=15, T__66=16, 
		T__65=17, T__64=18, T__63=19, T__62=20, T__61=21, T__60=22, T__59=23, 
		T__58=24, T__57=25, T__56=26, T__55=27, T__54=28, T__53=29, T__52=30, 
		T__51=31, T__50=32, T__49=33, T__48=34, T__47=35, T__46=36, T__45=37, 
		T__44=38, T__43=39, T__42=40, T__41=41, T__40=42, T__39=43, T__38=44, 
		T__37=45, T__36=46, T__35=47, T__34=48, T__33=49, T__32=50, T__31=51, 
		T__30=52, T__29=53, T__28=54, T__27=55, T__26=56, T__25=57, T__24=58, 
		T__23=59, T__22=60, T__21=61, T__20=62, T__19=63, T__18=64, T__17=65, 
		T__16=66, T__15=67, T__14=68, T__13=69, T__12=70, T__11=71, T__10=72, 
		T__9=73, T__8=74, T__7=75, T__6=76, T__5=77, T__4=78, T__3=79, T__2=80, 
		T__1=81, T__0=82, ID=83, INT=84, WS=85, LINE_COMMENT=86;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'eqn'", "'pbes'", "'*'", "'['", "'List'", "'<'", "'false'", "'!='", "'<='", 
		"'<<'", "'Bool'", "'nil'", "'rename'", "'block'", "'cons'", "'}'", "'||_'", 
		"'->'", "')'", "'Nat'", "'Bag'", "'whr'", "'Pos'", "'@'", "'map'", "'='", 
		"'div'", "'FSet'", "'Int'", "'bes'", "'act'", "'proc'", "'yaled'", "'val'", 
		"'mod'", "'|'", "'!'", "']'", "'hide'", "'lambda'", "'in'", "','", "'-'", 
		"'('", "':'", "'var'", "'?'", "'comm'", "'{'", "'sum'", "'init'", "'sort'", 
		"'|>'", "'true'", "'delta'", "'++'", "'struct'", "'<|'", "'Set'", "'.'", 
		"'=>'", "'tau'", "'+'", "'glob'", "'<>'", "'forall'", "';'", "'&&'", "'delay'", 
		"'nu'", "'||'", "'exists'", "'>'", "'Real'", "'FBag'", "'/'", "'=='", 
		"'#'", "'>='", "'end'", "'allow'", "'mu'", "ID", "INT", "WS", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__81", "T__80", "T__79", "T__78", "T__77", "T__76", "T__75", "T__74", 
		"T__73", "T__72", "T__71", "T__70", "T__69", "T__68", "T__67", "T__66", 
		"T__65", "T__64", "T__63", "T__62", "T__61", "T__60", "T__59", "T__58", 
		"T__57", "T__56", "T__55", "T__54", "T__53", "T__52", "T__51", "T__50", 
		"T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", 
		"T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", 
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "ID", "LETTER", "INT", "WS", "LINE_COMMENT"
	};


	public mcrl2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mcrl2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 85: WS_action((RuleContext)_localctx, actionIndex); break;

		case 86: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2X\u020a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?"+
		"\3?\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3E"+
		"\3F\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3K\3K"+
		"\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3N\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3R"+
		"\3R\3R\3R\3R\3R\3S\3S\3S\3T\3T\3T\7T\u01ea\nT\fT\16T\u01ed\13T\3U\3U\3"+
		"V\6V\u01f2\nV\rV\16V\u01f3\3W\6W\u01f7\nW\rW\16W\u01f8\3W\3W\3X\3X\7X"+
		"\u01ff\nX\fX\16X\u0202\13X\3X\5X\u0205\nX\3X\3X\3X\3X\3\u0200Y\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1"+
		"\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089F\1\u008bG\1\u008dH\1\u008f"+
		"I\1\u0091J\1\u0093K\1\u0095L\1\u0097M\1\u0099N\1\u009bO\1\u009dP\1\u009f"+
		"Q\1\u00a1R\1\u00a3S\1\u00a5T\1\u00a7U\1\u00a9\2\1\u00abV\1\u00adW\2\u00af"+
		"X\3\3\2\5\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\u020e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\3\u00b1\3\2\2\2\5\u00b5\3\2\2\2\7\u00ba\3\2\2"+
		"\2\t\u00bc\3\2\2\2\13\u00be\3\2\2\2\r\u00c3\3\2\2\2\17\u00c5\3\2\2\2\21"+
		"\u00cb\3\2\2\2\23\u00ce\3\2\2\2\25\u00d1\3\2\2\2\27\u00d4\3\2\2\2\31\u00d9"+
		"\3\2\2\2\33\u00dd\3\2\2\2\35\u00e4\3\2\2\2\37\u00ea\3\2\2\2!\u00ef\3\2"+
		"\2\2#\u00f1\3\2\2\2%\u00f5\3\2\2\2\'\u00f8\3\2\2\2)\u00fa\3\2\2\2+\u00fe"+
		"\3\2\2\2-\u0102\3\2\2\2/\u0106\3\2\2\2\61\u010a\3\2\2\2\63\u010c\3\2\2"+
		"\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0116\3\2\2\2;\u011b\3\2\2\2=\u011f"+
		"\3\2\2\2?\u0123\3\2\2\2A\u0127\3\2\2\2C\u012c\3\2\2\2E\u0132\3\2\2\2G"+
		"\u0136\3\2\2\2I\u013a\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2\2\2O\u0140\3\2"+
		"\2\2Q\u0145\3\2\2\2S\u014c\3\2\2\2U\u014f\3\2\2\2W\u0151\3\2\2\2Y\u0153"+
		"\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_\u015b\3\2\2\2a\u015d\3\2\2\2c"+
		"\u0162\3\2\2\2e\u0164\3\2\2\2g\u0168\3\2\2\2i\u016d\3\2\2\2k\u0172\3\2"+
		"\2\2m\u0175\3\2\2\2o\u017a\3\2\2\2q\u0180\3\2\2\2s\u0183\3\2\2\2u\u018a"+
		"\3\2\2\2w\u018d\3\2\2\2y\u0191\3\2\2\2{\u0193\3\2\2\2}\u0196\3\2\2\2\177"+
		"\u019a\3\2\2\2\u0081\u019c\3\2\2\2\u0083\u01a1\3\2\2\2\u0085\u01a4\3\2"+
		"\2\2\u0087\u01ab\3\2\2\2\u0089\u01ad\3\2\2\2\u008b\u01b0\3\2\2\2\u008d"+
		"\u01b6\3\2\2\2\u008f\u01b9\3\2\2\2\u0091\u01bc\3\2\2\2\u0093\u01c3\3\2"+
		"\2\2\u0095\u01c5\3\2\2\2\u0097\u01ca\3\2\2\2\u0099\u01cf\3\2\2\2\u009b"+
		"\u01d1\3\2\2\2\u009d\u01d4\3\2\2\2\u009f\u01d6\3\2\2\2\u00a1\u01d9\3\2"+
		"\2\2\u00a3\u01dd\3\2\2\2\u00a5\u01e3\3\2\2\2\u00a7\u01e6\3\2\2\2\u00a9"+
		"\u01ee\3\2\2\2\u00ab\u01f1\3\2\2\2\u00ad\u01f6\3\2\2\2\u00af\u01fc\3\2"+
		"\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7s\2\2\u00b3\u00b4\7p\2\2\u00b4\4"+
		"\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\6\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\b\3\2\2\2\u00bc"+
		"\u00bd\7]\2\2\u00bd\n\3\2\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4"+
		"\16\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca\20\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\22\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7?\2\2\u00d0"+
		"\24\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\7>\2\2\u00d3\26\3\2\2\2\u00d4"+
		"\u00d5\7D\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7n\2\2"+
		"\u00d8\30\3\2\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7"+
		"n\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0"+
		"\7p\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\34\3\2\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7m\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7u\2\2\u00ee \3\2\2\2\u00ef"+
		"\u00f0\7\177\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7~\2\2\u00f2\u00f3\7~\2\2"+
		"\u00f3\u00f4\7a\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6\u00f7\7@\2"+
		"\2\u00f7&\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7P\2\2"+
		"\u00fb\u00fc\7c\2\2\u00fc\u00fd\7v\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7D\2"+
		"\2\u00ff\u0100\7c\2\2\u0100\u0101\7i\2\2\u0101,\3\2\2\2\u0102\u0103\7"+
		"y\2\2\u0103\u0104\7j\2\2\u0104\u0105\7t\2\2\u0105.\3\2\2\2\u0106\u0107"+
		"\7R\2\2\u0107\u0108\7q\2\2\u0108\u0109\7u\2\2\u0109\60\3\2\2\2\u010a\u010b"+
		"\7B\2\2\u010b\62\3\2\2\2\u010c\u010d\7o\2\2\u010d\u010e\7c\2\2\u010e\u010f"+
		"\7r\2\2\u010f\64\3\2\2\2\u0110\u0111\7?\2\2\u0111\66\3\2\2\2\u0112\u0113"+
		"\7f\2\2\u0113\u0114\7k\2\2\u0114\u0115\7x\2\2\u01158\3\2\2\2\u0116\u0117"+
		"\7H\2\2\u0117\u0118\7U\2\2\u0118\u0119\7g\2\2\u0119\u011a\7v\2\2\u011a"+
		":\3\2\2\2\u011b\u011c\7K\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011e"+
		"<\3\2\2\2\u011f\u0120\7d\2\2\u0120\u0121\7g\2\2\u0121\u0122\7u\2\2\u0122"+
		">\3\2\2\2\u0123\u0124\7c\2\2\u0124\u0125\7e\2\2\u0125\u0126\7v\2\2\u0126"+
		"@\3\2\2\2\u0127\u0128\7r\2\2\u0128\u0129\7t\2\2\u0129\u012a\7q\2\2\u012a"+
		"\u012b\7e\2\2\u012bB\3\2\2\2\u012c\u012d\7{\2\2\u012d\u012e\7c\2\2\u012e"+
		"\u012f\7n\2\2\u012f\u0130\7g\2\2\u0130\u0131\7f\2\2\u0131D\3\2\2\2\u0132"+
		"\u0133\7x\2\2\u0133\u0134\7c\2\2\u0134\u0135\7n\2\2\u0135F\3\2\2\2\u0136"+
		"\u0137\7o\2\2\u0137\u0138\7q\2\2\u0138\u0139\7f\2\2\u0139H\3\2\2\2\u013a"+
		"\u013b\7~\2\2\u013bJ\3\2\2\2\u013c\u013d\7#\2\2\u013dL\3\2\2\2\u013e\u013f"+
		"\7_\2\2\u013fN\3\2\2\2\u0140\u0141\7j\2\2\u0141\u0142\7k\2\2\u0142\u0143"+
		"\7f\2\2\u0143\u0144\7g\2\2\u0144P\3\2\2\2\u0145\u0146\7n\2\2\u0146\u0147"+
		"\7c\2\2\u0147\u0148\7o\2\2\u0148\u0149\7d\2\2\u0149\u014a\7f\2\2\u014a"+
		"\u014b\7c\2\2\u014bR\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e"+
		"T\3\2\2\2\u014f\u0150\7.\2\2\u0150V\3\2\2\2\u0151\u0152\7/\2\2\u0152X"+
		"\3\2\2\2\u0153\u0154\7*\2\2\u0154Z\3\2\2\2\u0155\u0156\7<\2\2\u0156\\"+
		"\3\2\2\2\u0157\u0158\7x\2\2\u0158\u0159\7c\2\2\u0159\u015a\7t\2\2\u015a"+
		"^\3\2\2\2\u015b\u015c\7A\2\2\u015c`\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f"+
		"\7q\2\2\u015f\u0160\7o\2\2\u0160\u0161\7o\2\2\u0161b\3\2\2\2\u0162\u0163"+
		"\7}\2\2\u0163d\3\2\2\2\u0164\u0165\7u\2\2\u0165\u0166\7w\2\2\u0166\u0167"+
		"\7o\2\2\u0167f\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a\7p\2\2\u016a\u016b"+
		"\7k\2\2\u016b\u016c\7v\2\2\u016ch\3\2\2\2\u016d\u016e\7u\2\2\u016e\u016f"+
		"\7q\2\2\u016f\u0170\7t\2\2\u0170\u0171\7v\2\2\u0171j\3\2\2\2\u0172\u0173"+
		"\7~\2\2\u0173\u0174\7@\2\2\u0174l\3\2\2\2\u0175\u0176\7v\2\2\u0176\u0177"+
		"\7t\2\2\u0177\u0178\7w\2\2\u0178\u0179\7g\2\2\u0179n\3\2\2\2\u017a\u017b"+
		"\7f\2\2\u017b\u017c\7g\2\2\u017c\u017d\7n\2\2\u017d\u017e\7v\2\2\u017e"+
		"\u017f\7c\2\2\u017fp\3\2\2\2\u0180\u0181\7-\2\2\u0181\u0182\7-\2\2\u0182"+
		"r\3\2\2\2\u0183\u0184\7u\2\2\u0184\u0185\7v\2\2\u0185\u0186\7t\2\2\u0186"+
		"\u0187\7w\2\2\u0187\u0188\7e\2\2\u0188\u0189\7v\2\2\u0189t\3\2\2\2\u018a"+
		"\u018b\7>\2\2\u018b\u018c\7~\2\2\u018cv\3\2\2\2\u018d\u018e\7U\2\2\u018e"+
		"\u018f\7g\2\2\u018f\u0190\7v\2\2\u0190x\3\2\2\2\u0191\u0192\7\60\2\2\u0192"+
		"z\3\2\2\2\u0193\u0194\7?\2\2\u0194\u0195\7@\2\2\u0195|\3\2\2\2\u0196\u0197"+
		"\7v\2\2\u0197\u0198\7c\2\2\u0198\u0199\7w\2\2\u0199~\3\2\2\2\u019a\u019b"+
		"\7-\2\2\u019b\u0080\3\2\2\2\u019c\u019d\7i\2\2\u019d\u019e\7n\2\2\u019e"+
		"\u019f\7q\2\2\u019f\u01a0\7d\2\2\u01a0\u0082\3\2\2\2\u01a1\u01a2\7>\2"+
		"\2\u01a2\u01a3\7@\2\2\u01a3\u0084\3\2\2\2\u01a4\u01a5\7h\2\2\u01a5\u01a6"+
		"\7q\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7n\2\2\u01a9"+
		"\u01aa\7n\2\2\u01aa\u0086\3\2\2\2\u01ab\u01ac\7=\2\2\u01ac\u0088\3\2\2"+
		"\2\u01ad\u01ae\7(\2\2\u01ae\u01af\7(\2\2\u01af\u008a\3\2\2\2\u01b0\u01b1"+
		"\7f\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7c\2\2\u01b4"+
		"\u01b5\7{\2\2\u01b5\u008c\3\2\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7w\2"+
		"\2\u01b8\u008e\3\2\2\2\u01b9\u01ba\7~\2\2\u01ba\u01bb\7~\2\2\u01bb\u0090"+
		"\3\2\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7z\2\2\u01be\u01bf\7k\2\2\u01bf"+
		"\u01c0\7u\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7u\2\2\u01c2\u0092\3\2\2"+
		"\2\u01c3\u01c4\7@\2\2\u01c4\u0094\3\2\2\2\u01c5\u01c6\7T\2\2\u01c6\u01c7"+
		"\7g\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7n\2\2\u01c9\u0096\3\2\2\2\u01ca"+
		"\u01cb\7H\2\2\u01cb\u01cc\7D\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7i\2\2"+
		"\u01ce\u0098\3\2\2\2\u01cf\u01d0\7\61\2\2\u01d0\u009a\3\2\2\2\u01d1\u01d2"+
		"\7?\2\2\u01d2\u01d3\7?\2\2\u01d3\u009c\3\2\2\2\u01d4\u01d5\7%\2\2\u01d5"+
		"\u009e\3\2\2\2\u01d6\u01d7\7@\2\2\u01d7\u01d8\7?\2\2\u01d8\u00a0\3\2\2"+
		"\2\u01d9\u01da\7g\2\2\u01da\u01db\7p\2\2\u01db\u01dc\7f\2\2\u01dc\u00a2"+
		"\3\2\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7n\2\2\u01df\u01e0\7n\2\2\u01e0"+
		"\u01e1\7q\2\2\u01e1\u01e2\7y\2\2\u01e2\u00a4\3\2\2\2\u01e3\u01e4\7o\2"+
		"\2\u01e4\u01e5\7w\2\2\u01e5\u00a6\3\2\2\2\u01e6\u01eb\5\u00a9U\2\u01e7"+
		"\u01ea\5\u00a9U\2\u01e8\u01ea\t\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u00a8\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\t\3\2\2\u01ef\u00aa\3\2"+
		"\2\2\u01f0\u01f2\t\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u00ac\3\2\2\2\u01f5\u01f7\t\4"+
		"\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\bW\2\2\u01fb\u00ae\3\2"+
		"\2\2\u01fc\u0200\7\'\2\2\u01fd\u01ff\13\2\2\2\u01fe\u01fd\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0203\u0205\7\17\2\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7\f\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0209\bX\3\2\u0209\u00b0\3\2\2\2\t\2\u01e9\u01eb\u01f3\u01f8"+
		"\u0200\u0204";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}