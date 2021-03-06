/* The following code was generated by JFlex 1.4.3 on 13/10/15 00:25 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13/10/15 00:25 from the specification file
 * <tt>/autofs/netapp/account/cremi/amansouri001/Bureau/calculatrice/lexer/calculette.jflex</tt>
 */
class CalculetteLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 6;
  public static final int YYINITIAL = 0;
  public static final int COMMENTAIRE = 4;
  public static final int comment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\2\1\0\1\10\1\1\22\0\1\66\1\23\1\11"+
    "\2\0\1\26\1\35\1\31\1\14\1\15\1\13\1\24\1\30\1\25"+
    "\1\7\1\12\1\5\11\6\1\32\1\27\1\20\1\22\1\21\2\0"+
    "\32\3\1\16\1\0\1\17\1\40\1\4\1\0\1\54\1\62\1\55"+
    "\1\61\1\45\1\42\1\64\1\44\1\41\1\3\1\63\1\47\1\57"+
    "\1\46\1\52\1\56\1\3\1\53\1\50\1\43\1\60\1\3\1\51"+
    "\1\3\1\67\1\3\1\33\1\36\1\34\1\37\u1f99\0\1\65\udfe7\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\2\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\1\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\15\3\1\35"+
    "\1\2\1\36\3\0\1\37\1\0\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\0\1\51"+
    "\1\52\1\53\1\54\23\3\1\55\1\56\1\57\1\60"+
    "\12\3\1\61\20\3\1\62\1\63\1\64\1\65\1\66"+
    "\1\3\1\67\6\3\1\70\2\3\1\71\4\3\1\72"+
    "\1\3\1\0\3\3\1\73\2\3\1\74\2\3\1\75"+
    "\3\3\1\0\1\76\1\3\1\77\1\100\1\101\2\3"+
    "\1\102\1\103\1\3\1\0\2\3\1\104\1\105\1\106"+
    "\2\3\1\107\1\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\250\0\u0118\0\u0150"+
    "\0\u0188\0\250\0\250\0\u01c0\0\250\0\u01f8\0\250\0\250"+
    "\0\250\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348\0\250"+
    "\0\250\0\250\0\u0380\0\250\0\250\0\250\0\u03b8\0\u03f0"+
    "\0\250\0\250\0\u0428\0\u0460\0\u0498\0\u04d0\0\u0508\0\u0540"+
    "\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0658\0\u0690\0\u06c8\0\250"+
    "\0\u0700\0\250\0\u0150\0\u0738\0\u0770\0\250\0\u07a8\0\250"+
    "\0\250\0\250\0\250\0\250\0\250\0\250\0\250\0\250"+
    "\0\u07e0\0\250\0\250\0\u0118\0\u0818\0\u0850\0\u0888\0\u08c0"+
    "\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0a80"+
    "\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40"+
    "\0\250\0\u0738\0\250\0\250\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20"+
    "\0\u0d58\0\u0d90\0\u0dc8\0\u0e00\0\u0e38\0\u0e70\0\u0118\0\u0ea8"+
    "\0\u0ee0\0\u0f18\0\u0f50\0\u0f88\0\u0fc0\0\u0ff8\0\u1030\0\u1068"+
    "\0\u10a0\0\u10d8\0\u1110\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u0118"+
    "\0\u0118\0\u0118\0\u0118\0\u0118\0\u1228\0\u0118\0\u1260\0\u1298"+
    "\0\u12d0\0\u1308\0\u1340\0\u1378\0\u0118\0\u13b0\0\u13e8\0\u0118"+
    "\0\u1420\0\u1458\0\u1490\0\u14c8\0\u0118\0\u1500\0\u1538\0\u1570"+
    "\0\u15a8\0\u15e0\0\u0118\0\u1618\0\u1650\0\u0118\0\u1688\0\u16c0"+
    "\0\u0118\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u0118\0\u17d8\0\u0118"+
    "\0\u0118\0\u0118\0\u1810\0\u1848\0\u0118\0\u0118\0\u1880\0\u18b8"+
    "\0\u18f0\0\u1928\0\u0118\0\u0118\0\250\0\u1960\0\u1998\0\u0118"+
    "\0\u0118";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\4\1\10\1\11\1\12"+
    "\1\6\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\7\1\46\1\47\1\50"+
    "\1\51\1\52\1\7\1\53\1\7\1\54\1\55\1\56"+
    "\2\7\1\57\2\7\1\60\1\6\1\7\13\6\1\61"+
    "\56\6\1\0\6\6\1\62\56\6\72\0\1\6\70\0"+
    "\4\7\32\0\24\7\2\0\1\7\5\0\2\63\1\64"+
    "\65\0\2\11\1\64\72\0\1\65\1\66\71\0\1\67"+
    "\72\0\1\70\1\0\1\71\66\0\1\72\1\73\67\0"+
    "\1\74\67\0\1\75\71\0\1\76\64\0\1\77\3\0"+
    "\1\100\42\0\2\101\1\0\65\101\35\0\1\102\70\0"+
    "\1\103\34\0\4\7\32\0\1\7\1\104\3\7\1\105"+
    "\16\7\2\0\1\7\3\0\4\7\32\0\11\7\1\106"+
    "\1\7\1\107\3\7\1\110\4\7\2\0\1\7\3\0"+
    "\4\7\32\0\3\7\1\111\6\7\1\112\11\7\2\0"+
    "\1\113\3\0\4\7\32\0\6\7\1\114\15\7\2\0"+
    "\1\7\3\0\4\7\32\0\17\7\1\115\4\7\2\0"+
    "\1\7\3\0\4\7\32\0\1\116\3\7\1\117\17\7"+
    "\2\0\1\7\3\0\4\7\32\0\2\7\1\120\21\7"+
    "\2\0\1\7\3\0\4\7\32\0\3\7\1\121\20\7"+
    "\2\0\1\7\3\0\4\7\32\0\4\7\1\122\17\7"+
    "\2\0\1\7\3\0\4\7\32\0\3\7\1\123\2\7"+
    "\1\124\15\7\2\0\1\7\3\0\4\7\32\0\12\7"+
    "\1\125\11\7\2\0\1\7\3\0\4\7\32\0\13\7"+
    "\1\126\10\7\2\0\1\7\3\0\4\7\32\0\11\7"+
    "\1\127\1\130\11\7\2\0\1\7\12\0\1\131\62\0"+
    "\2\132\61\0\2\65\1\6\65\65\22\0\1\133\76\0"+
    "\1\134\41\0\4\7\32\0\2\7\1\135\21\7\2\0"+
    "\1\7\3\0\4\7\32\0\12\7\1\136\11\7\2\0"+
    "\1\7\3\0\4\7\32\0\6\7\1\137\15\7\2\0"+
    "\1\7\3\0\4\7\32\0\5\7\1\140\16\7\2\0"+
    "\1\7\3\0\4\7\32\0\4\7\1\141\17\7\2\0"+
    "\1\7\3\0\4\7\32\0\17\7\1\142\4\7\2\0"+
    "\1\7\3\0\4\7\32\0\15\7\1\143\6\7\2\0"+
    "\1\7\3\0\4\7\32\0\7\7\1\144\14\7\2\0"+
    "\1\7\3\0\4\7\32\0\6\7\1\145\15\7\2\0"+
    "\1\7\3\0\4\7\32\0\7\7\1\146\14\7\2\0"+
    "\1\7\3\0\4\7\32\0\2\7\1\147\21\7\2\0"+
    "\1\7\3\0\4\7\32\0\11\7\1\150\1\151\1\152"+
    "\10\7\2\0\1\7\3\0\4\7\32\0\1\153\23\7"+
    "\2\0\1\7\3\0\4\7\32\0\2\7\1\154\12\7"+
    "\1\155\6\7\2\0\1\7\3\0\4\7\32\0\13\7"+
    "\1\156\10\7\2\0\1\7\3\0\4\7\32\0\13\7"+
    "\1\157\10\7\2\0\1\7\3\0\4\7\32\0\11\7"+
    "\1\160\12\7\2\0\1\7\3\0\4\7\32\0\1\161"+
    "\23\7\2\0\1\7\3\0\4\7\32\0\11\7\1\162"+
    "\12\7\2\0\1\7\3\0\4\7\32\0\4\7\1\163"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\4\7\1\164"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\4\7\1\165"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\7\7\1\166"+
    "\14\7\2\0\1\7\3\0\4\7\32\0\14\7\1\167"+
    "\7\7\2\0\1\7\3\0\4\7\32\0\5\7\1\170"+
    "\16\7\2\0\1\7\3\0\4\7\32\0\4\7\1\171"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\4\7\1\172"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\4\7\1\173"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\6\7\1\174"+
    "\15\7\2\0\1\7\3\0\4\7\32\0\2\7\1\175"+
    "\21\7\2\0\1\7\3\0\4\7\32\0\15\7\1\176"+
    "\6\7\2\0\1\7\3\0\4\7\32\0\1\177\16\7"+
    "\1\200\4\7\2\0\1\7\3\0\4\7\32\0\2\7"+
    "\1\201\21\7\2\0\1\7\3\0\4\7\32\0\6\7"+
    "\1\202\15\7\2\0\1\7\3\0\4\7\32\0\17\7"+
    "\1\203\4\7\2\0\1\7\3\0\4\7\32\0\4\7"+
    "\1\204\17\7\2\0\1\7\3\0\4\7\32\0\12\7"+
    "\1\205\11\7\2\0\1\7\3\0\4\7\32\0\7\7"+
    "\1\206\14\7\2\0\1\7\3\0\4\7\32\0\14\7"+
    "\1\207\7\7\2\0\1\7\3\0\4\7\32\0\5\7"+
    "\1\210\16\7\2\0\1\7\3\0\4\7\32\0\6\7"+
    "\1\211\15\7\2\0\1\7\3\0\4\7\32\0\13\7"+
    "\1\212\10\7\2\0\1\7\3\0\4\7\32\0\23\7"+
    "\1\213\2\0\1\7\3\0\4\7\32\0\13\7\1\214"+
    "\10\7\2\0\1\7\3\0\4\7\32\0\4\7\1\215"+
    "\17\7\2\0\1\7\3\0\4\7\32\0\2\7\1\216"+
    "\21\7\2\0\1\7\3\0\4\7\32\0\24\7\1\0"+
    "\1\217\1\7\3\0\4\7\32\0\5\7\1\220\16\7"+
    "\2\0\1\7\3\0\4\7\32\0\14\7\1\221\7\7"+
    "\2\0\1\7\3\0\4\7\32\0\1\222\23\7\2\0"+
    "\1\7\3\0\4\7\32\0\4\7\1\223\17\7\2\0"+
    "\1\7\3\0\4\7\32\0\12\7\1\224\11\7\2\0"+
    "\1\7\3\0\4\7\32\0\13\7\1\225\10\7\2\0"+
    "\1\7\3\0\4\7\32\0\7\7\1\226\14\7\2\0"+
    "\1\7\3\0\4\7\32\0\4\7\1\227\17\7\2\0"+
    "\1\7\3\0\4\7\32\0\4\7\1\230\17\7\2\0"+
    "\1\7\3\0\4\7\32\0\22\7\1\231\1\7\2\0"+
    "\1\7\3\0\4\7\32\0\4\7\1\232\17\7\2\0"+
    "\1\7\3\0\4\7\32\0\14\7\1\233\7\7\2\0"+
    "\1\7\3\0\4\7\32\0\1\234\23\7\2\0\1\7"+
    "\52\0\1\235\20\0\4\7\32\0\23\7\1\236\2\0"+
    "\1\7\3\0\4\7\32\0\2\7\1\237\21\7\2\0"+
    "\1\7\3\0\4\7\32\0\14\7\1\240\7\7\2\0"+
    "\1\7\3\0\4\7\32\0\5\7\1\241\16\7\2\0"+
    "\1\7\3\0\4\7\32\0\2\7\1\242\21\7\2\0"+
    "\1\7\3\0\4\7\32\0\20\7\1\243\3\7\2\0"+
    "\1\7\3\0\4\7\32\0\13\7\1\244\10\7\2\0"+
    "\1\7\3\0\4\7\32\0\12\7\1\245\11\7\2\0"+
    "\1\7\3\0\4\7\32\0\3\7\1\246\20\7\2\0"+
    "\1\7\3\0\4\7\32\0\11\7\1\247\12\7\2\0"+
    "\1\7\42\0\1\250\30\0\4\7\32\0\17\7\1\251"+
    "\4\7\2\0\1\7\3\0\4\7\32\0\17\7\1\252"+
    "\4\7\2\0\1\7\3\0\4\7\32\0\5\7\1\253"+
    "\16\7\2\0\1\7\3\0\4\7\32\0\5\7\1\254"+
    "\16\7\2\0\1\7\66\0\1\255\4\0\4\7\32\0"+
    "\12\7\1\256\11\7\2\0\1\7\3\0\4\7\32\0"+
    "\12\7\1\257\11\7\2\0\1\7\3\0\4\7\32\0"+
    "\4\7\1\260\17\7\2\0\1\7\3\0\4\7\32\0"+
    "\4\7\1\261\17\7\2\0\1\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6608];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\3\1\2\11\1\1\1\11"+
    "\1\1\3\11\6\1\3\11\1\1\3\11\2\1\2\11"+
    "\15\1\1\11\1\1\1\11\3\0\1\11\1\0\11\11"+
    "\1\0\2\11\25\1\1\11\1\1\2\11\62\1\1\0"+
    "\15\1\1\0\12\1\1\0\4\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
private Symbol symbol (int type) {
        return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline, yycolumn, value);
}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CalculetteLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CalculetteLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 44: 
          { return symbol(CalculetteSymbol.IN);
          }
        case 73: break;
        case 65: 
          { return symbol(CalculetteSymbol.REPEAT);
          }
        case 74: break;
        case 42: 
          { return symbol(CalculetteSymbol.OR);
          }
        case 75: break;
        case 34: 
          { return symbol(CalculetteSymbol.RIGHT_DECAL);
          }
        case 76: break;
        case 56: 
          { return symbol(CalculetteSymbol.CHAR);
          }
        case 77: break;
        case 22: 
          { return symbol(CalculetteSymbol.COLONS);
          }
        case 78: break;
        case 38: 
          { return symbol(CalculetteSymbol.INCREM);
          }
        case 79: break;
        case 69: 
          { return symbol(CalculetteSymbol.FUNCTION);
          }
        case 80: break;
        case 39: 
          { return symbol(CalculetteSymbol.ARROW);
          }
        case 81: break;
        case 62: 
          { return symbol(CalculetteSymbol.STRING);
          }
        case 82: break;
        case 24: 
          { return symbol(CalculetteSymbol.RBRACE);
          }
        case 83: break;
        case 28: 
          { return symbol(CalculetteSymbol.CHAP);
          }
        case 84: break;
        case 72: 
          { return symbol(CalculetteSymbol.PROCEDURE);
          }
        case 85: break;
        case 68: 
          { return symbol(CalculetteSymbol.BOOL);
          }
        case 86: break;
        case 20: 
          { return symbol(CalculetteSymbol.POINTVIRG);
          }
        case 87: break;
        case 71: 
          { return symbol(CalculetteSymbol.STRUCT);
          }
        case 88: break;
        case 11: 
          { return symbol(CalculetteSymbol.LBRACKET);
          }
        case 89: break;
        case 60: 
          { return symbol(CalculetteSymbol.CLASS);
          }
        case 90: break;
        case 35: 
          { return symbol(CalculetteSymbol.GE);
          }
        case 91: break;
        case 64: 
          { return symbol(CalculetteSymbol.RETURN);
          }
        case 92: break;
        case 43: 
          { return symbol(CalculetteSymbol.IF);
          }
        case 93: break;
        case 67: 
          { return symbol(CalculetteSymbol.FOR_EACH);
          }
        case 94: break;
        case 27: 
          { return symbol(CalculetteSymbol.TILD);
          }
        case 95: break;
        case 48: 
          { return symbol(CalculetteSymbol.CHARAA);
          }
        case 96: break;
        case 57: 
          { return symbol(CalculetteSymbol.MAIN);
          }
        case 97: break;
        case 12: 
          { return symbol(CalculetteSymbol.RBRACKET);
          }
        case 98: break;
        case 61: 
          { return symbol(CalculetteSymbol.BREAK);
          }
        case 99: break;
        case 3: 
          { return symbol(CalculetteSymbol.ID);
          }
        case 100: break;
        case 52: 
          { return symbol(CalculetteSymbol.TYPE);
          }
        case 101: break;
        case 23: 
          { return symbol(CalculetteSymbol.LBRACE);
          }
        case 102: break;
        case 58: 
          { return symbol(CalculetteSymbol.FALSE);
          }
        case 103: break;
        case 29: 
          { return symbol(CalculetteSymbol.VAR_TYPE);
          }
        case 104: break;
        case 63: 
          { return symbol(CalculetteSymbol.STATIC);
          }
        case 105: break;
        case 33: 
          { return symbol(CalculetteSymbol.LE);
          }
        case 106: break;
        case 40: 
          { return symbol(CalculetteSymbol.DECREM);
          }
        case 107: break;
        case 8: 
          { return symbol(CalculetteSymbol.MULT);
          }
        case 108: break;
        case 30: 
          { yybegin(YYINITIAL);return symbol(CalculetteSymbol.STRINGSS);
          }
        case 109: break;
        case 53: 
          { return symbol(CalculetteSymbol.ELSE);
          }
        case 110: break;
        case 7: 
          { return symbol(CalculetteSymbol.DIV);
          }
        case 111: break;
        case 37: 
          { return symbol(CalculetteSymbol.DIFF);
          }
        case 112: break;
        case 46: 
          { return symbol(CalculetteSymbol.FLOAT);
          }
        case 113: break;
        case 18: 
          { return symbol(CalculetteSymbol.MINUS);
          }
        case 114: break;
        case 19: 
          { return symbol(CalculetteSymbol.MOD);
          }
        case 115: break;
        case 21: 
          { return symbol(CalculetteSymbol.COMA);
          }
        case 116: break;
        case 4: 
          { return symbol(CalculetteSymbol.NBR);
          }
        case 117: break;
        case 16: 
          { return symbol(CalculetteSymbol.NO_LOGIC);
          }
        case 118: break;
        case 47: 
          { return symbol(CalculetteSymbol.ENTREPARENT);
          }
        case 119: break;
        case 32: 
          { return symbol(CalculetteSymbol.LEFT_DECAL);
          }
        case 120: break;
        case 6: 
          { yybegin(STRING);
          }
        case 121: break;
        case 45: 
          { yybegin(YYINITIAL);
          }
        case 122: break;
        case 26: 
          { return symbol(CalculetteSymbol.PIPE);
          }
        case 123: break;
        case 5: 
          { return symbol(CalculetteSymbol.POINT);
          }
        case 124: break;
        case 55: 
          { return symbol(CalculetteSymbol.STOP);
          }
        case 125: break;
        case 14: 
          { return symbol(CalculetteSymbol.GT);
          }
        case 126: break;
        case 51: 
          { return symbol(CalculetteSymbol.TRUE);
          }
        case 127: break;
        case 59: 
          { return symbol(CalculetteSymbol.WHILE);
          }
        case 128: break;
        case 66: 
          { return symbol(CalculetteSymbol.INT);
          }
        case 129: break;
        case 31: 
          { yybegin(COMMENTAIRE);
          }
        case 130: break;
        case 41: 
          { return symbol(CalculetteSymbol.AND);
          }
        case 131: break;
        case 15: 
          { return symbol(CalculetteSymbol.EQ);
          }
        case 132: break;
        case 36: 
          { return symbol(CalculetteSymbol.EQEQ);
          }
        case 133: break;
        case 54: 
          { return symbol(CalculetteSymbol.NULL);
          }
        case 134: break;
        case 25: 
          { return symbol(CalculetteSymbol.AND_COM);
          }
        case 135: break;
        case 17: 
          { return symbol(CalculetteSymbol.PLUS);
          }
        case 136: break;
        case 1: 
          { /* ignore */
          }
        case 137: break;
        case 13: 
          { return symbol(CalculetteSymbol.LT);
          }
        case 138: break;
        case 70: 
          { return symbol(CalculetteSymbol.LIST_OF_TYPE);
          }
        case 139: break;
        case 10: 
          { return symbol(CalculetteSymbol.RPAR);
          }
        case 140: break;
        case 50: 
          { return symbol(CalculetteSymbol.THEN);
          }
        case 141: break;
        case 9: 
          { return symbol(CalculetteSymbol.LPAR);
          }
        case 142: break;
        case 49: 
          { return symbol(CalculetteSymbol.LET);
          }
        case 143: break;
        case 2: 
          { 
          }
        case 144: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(CalculetteSymbol.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
