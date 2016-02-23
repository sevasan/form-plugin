/* The following code was generated by JFlex 1.4.3 on 2/23/16 6:28 AM */

package com.form.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/23/16 6:28 AM from the specification file
 * <tt>C:/development/form-plugin/lang/src/com/form/lang/lexer/Form.flex</tt>
 */
class _FormLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\3\1\0\1\4\23\0\1\4\2\0\1\40\4\0"+
    "\1\46\1\47\1\2\1\50\1\55\1\51\1\44\1\52\1\11\11\1"+
    "\1\0\1\56\1\0\1\54\1\0\1\57\1\0\2\5\1\34\2\5"+
    "\1\32\2\5\1\26\2\5\1\42\1\5\1\36\1\5\1\41\2\5"+
    "\1\12\1\35\1\5\1\21\4\5\1\7\1\0\1\10\1\53\1\5"+
    "\1\0\1\43\1\15\1\23\1\30\1\22\1\37\1\45\1\5\1\31"+
    "\2\5\1\17\1\14\1\27\1\16\2\5\1\25\1\20\1\24\1\33"+
    "\3\5\1\13\1\5\57\0\1\5\12\0\1\5\4\0\1\5\5\0"+
    "\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0"+
    "\1\5\1\0\1\5\201\0\5\5\1\0\2\5\2\0\4\5\10\0"+
    "\1\5\1\0\3\5\1\0\1\5\1\0\24\5\1\0\123\5\1\0"+
    "\213\5\10\0\236\5\11\0\46\5\2\0\1\5\7\0\47\5\110\0"+
    "\33\5\5\0\3\5\55\0\53\5\25\0\12\6\4\0\2\5\1\0"+
    "\143\5\1\0\1\5\17\0\2\5\7\0\2\5\12\6\3\5\2\0"+
    "\1\5\20\0\1\5\1\0\36\5\35\0\131\5\13\0\1\5\16\0"+
    "\12\6\41\5\11\0\2\5\4\0\1\5\5\0\26\5\4\0\1\5"+
    "\11\0\1\5\3\0\1\5\27\0\31\5\107\0\1\5\1\0\13\5"+
    "\127\0\66\5\3\0\1\5\22\0\1\5\7\0\12\5\4\0\12\6"+
    "\1\0\7\5\1\0\7\5\5\0\10\5\2\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\1\5\3\0\4\5\3\0\1\5\20\0\1\5"+
    "\15\0\2\5\1\0\3\5\4\0\12\6\2\5\23\0\6\5\4\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\2\5\1\0"+
    "\2\5\37\0\4\5\1\0\1\5\7\0\12\6\2\0\3\5\20\0"+
    "\11\5\1\0\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\3\0\1\5\22\0\1\5\17\0\2\5\4\0\12\6\25\0"+
    "\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\3\0\1\5\36\0\2\5\1\0\3\5\4\0\12\6\1\0"+
    "\1\5\21\0\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0"+
    "\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0"+
    "\14\5\26\0\1\5\25\0\12\6\25\0\10\5\1\0\3\5\1\0"+
    "\27\5\1\0\12\5\1\0\5\5\3\0\1\5\32\0\2\5\6\0"+
    "\2\5\4\0\12\6\25\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0\2\5\4\0"+
    "\12\6\1\0\2\5\22\0\10\5\1\0\3\5\1\0\51\5\2\0"+
    "\1\5\20\0\1\5\21\0\2\5\4\0\12\6\12\0\6\5\5\0"+
    "\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5\72\0"+
    "\60\5\1\0\2\5\14\0\7\5\11\0\12\6\47\0\2\5\1\0"+
    "\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0\4\5\1\0"+
    "\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0"+
    "\4\5\1\0\2\5\11\0\1\5\2\0\5\5\1\0\1\5\11\0"+
    "\12\6\2\0\4\5\40\0\1\5\37\0\12\6\26\0\10\5\1\0"+
    "\44\5\33\0\5\5\163\0\53\5\24\0\1\5\12\6\6\0\6\5"+
    "\4\0\4\5\3\0\1\5\3\0\2\5\7\0\3\5\4\0\15\5"+
    "\14\0\1\5\1\0\12\6\6\0\46\5\1\0\1\5\5\0\1\5"+
    "\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5"+
    "\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5\1\0\71\5"+
    "\1\0\4\5\2\0\103\5\45\0\20\5\20\0\125\5\14\0\u026c\5"+
    "\2\0\21\5\1\0\32\5\5\0\113\5\25\0\15\5\1\0\4\5"+
    "\16\0\22\5\16\0\22\5\16\0\15\5\1\0\3\5\17\0\64\5"+
    "\43\0\1\5\4\0\1\5\3\0\12\6\46\0\12\6\6\0\130\5"+
    "\10\0\51\5\1\0\1\5\5\0\106\5\12\0\35\5\51\0\12\6"+
    "\36\5\2\0\5\5\13\0\54\5\25\0\7\5\10\0\12\6\46\0"+
    "\27\5\11\0\65\5\53\0\12\6\6\0\12\6\15\0\1\5\135\0"+
    "\57\5\21\0\7\5\4\0\12\6\51\0\36\5\15\0\2\5\12\6"+
    "\54\5\32\0\44\5\34\0\12\6\3\0\3\5\12\6\44\5\153\0"+
    "\4\5\1\0\4\5\3\0\2\5\11\0\300\5\100\0\u0116\5\2\0"+
    "\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0\7\5\1\0"+
    "\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0\6\5\4\0"+
    "\15\5\5\0\3\5\1\0\7\5\164\0\1\5\15\0\1\5\20\0"+
    "\15\5\145\0\1\5\4\0\1\5\2\0\12\5\1\0\1\5\3\0"+
    "\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5\1\0"+
    "\13\5\2\0\4\5\5\0\5\5\4\0\1\5\64\0\2\5\u0a7b\0"+
    "\57\5\1\0\57\5\1\0\205\5\6\0\4\5\3\0\2\5\14\0"+
    "\46\5\1\0\1\5\5\0\1\5\2\0\70\5\7\0\1\5\20\0"+
    "\27\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\120\0\1\5\u01d5\0"+
    "\2\5\52\0\5\5\5\0\2\5\4\0\126\5\6\0\3\5\1\0"+
    "\132\5\1\0\4\5\5\0\51\5\3\0\136\5\21\0\33\5\65\0"+
    "\20\5\u0200\0\u19b6\5\112\0\u51cd\5\63\0\u048d\5\103\0\56\5\2\0"+
    "\u010d\5\3\0\20\5\12\6\2\5\24\0\57\5\20\0\31\5\10\0"+
    "\106\5\61\0\11\5\2\0\147\5\2\0\4\5\1\0\4\5\14\0"+
    "\13\5\115\0\12\5\1\0\3\5\1\0\4\5\1\0\27\5\35\0"+
    "\64\5\16\0\62\5\34\0\12\6\30\0\6\5\3\0\1\5\4\0"+
    "\12\6\34\5\12\0\27\5\31\0\35\5\7\0\57\5\34\0\1\5"+
    "\12\6\46\0\51\5\27\0\3\5\1\0\10\5\4\0\12\6\6\0"+
    "\27\5\3\0\1\5\5\0\60\5\1\0\1\5\3\0\2\5\2\0"+
    "\5\5\2\0\1\5\1\0\1\5\30\0\3\5\2\0\13\5\7\0"+
    "\3\5\14\0\6\5\2\0\6\5\2\0\6\5\11\0\7\5\1\0"+
    "\7\5\221\0\43\5\15\0\12\6\6\0\u2ba4\5\14\0\27\5\4\0"+
    "\61\5\u2104\0\u016e\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0"+
    "\1\5\1\0\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0"+
    "\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0"+
    "\66\5\50\0\14\5\164\0\5\5\1\0\207\5\23\0\12\6\7\0"+
    "\32\5\6\0\32\5\13\0\131\5\3\0\6\5\2\0\6\5\2\0"+
    "\6\5\2\0\3\5\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\2\11\5\1\1\2\5\1\1\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\0\6\5\1\23\1\24\5\5\2\0\2\5\4\0"+
    "\1\25\2\5\1\26\11\5\2\0\1\27\2\5\5\0"+
    "\2\5\1\30\7\5\2\0\2\5\2\0\1\31\2\0"+
    "\3\5\1\32\6\5\1\33\1\0\1\34\1\35\1\36"+
    "\3\0\2\5\1\37\6\5\1\0\1\40\1\41\1\42"+
    "\1\0\1\43\1\44\1\45\3\5\1\46\1\5\1\47"+
    "\1\50\2\5\1\51\1\52\1\53\1\5\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[147];
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
    "\0\0\0\60\0\140\0\220\0\140\0\300\0\360\0\u0120"+
    "\0\140\0\140\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240"+
    "\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\u03c0\0\140\0\140"+
    "\0\140\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510"+
    "\0\u0540\0\360\0\360\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630"+
    "\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0"+
    "\0\140\0\u0420\0\u07e0\0\360\0\u0810\0\u0840\0\u0870\0\u08a0"+
    "\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\140"+
    "\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0"+
    "\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\140"+
    "\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\360\0\u0f60\0\u0f90"+
    "\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0\0\360\0\360"+
    "\0\140\0\u10e0\0\u1110\0\u1140\0\u1170\0\u11a0\0\360\0\u11d0"+
    "\0\u1200\0\u1230\0\u1260\0\u1290\0\u12c0\0\u12f0\0\140\0\140"+
    "\0\140\0\u1320\0\360\0\360\0\360\0\u1350\0\u1380\0\u13b0"+
    "\0\360\0\u13e0\0\140\0\140\0\u1410\0\u1440\0\360\0\360"+
    "\0\360\0\u1470\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[147];
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
    "\1\3\1\4\1\5\2\6\1\7\1\3\1\10\1\11"+
    "\1\12\1\13\6\7\1\14\1\15\3\7\1\16\2\7"+
    "\1\17\1\20\1\7\1\21\1\22\1\23\1\7\1\24"+
    "\1\25\1\26\1\7\1\27\1\7\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\3"+
    "\1\4\1\42\2\6\1\7\1\3\1\10\1\11\1\12"+
    "\1\13\6\7\1\14\1\15\3\7\1\16\2\7\1\17"+
    "\1\20\1\7\1\21\1\22\1\23\1\7\1\24\1\25"+
    "\1\26\1\7\1\27\1\7\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\61\0\1\4"+
    "\7\0\1\4\51\0\2\6\54\0\1\7\3\0\2\7"+
    "\2\0\27\7\1\0\3\7\1\0\1\7\12\0\3\43"+
    "\1\0\3\43\1\0\50\43\1\0\1\7\3\0\2\7"+
    "\2\0\2\7\1\44\6\7\1\45\15\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\11\7"+
    "\1\46\15\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\6\7\1\47\7\7\1\50\10\7"+
    "\1\0\3\7\1\0\1\7\13\0\1\7\3\0\2\7"+
    "\2\0\16\7\1\51\10\7\1\0\3\7\1\0\1\7"+
    "\13\0\1\7\3\0\2\7\2\0\17\7\1\52\6\7"+
    "\1\53\1\0\3\7\1\0\1\7\13\0\1\7\3\0"+
    "\2\7\2\0\22\7\1\54\4\7\1\0\3\7\1\0"+
    "\1\7\13\0\1\7\3\0\2\7\2\0\21\7\1\55"+
    "\2\7\1\56\2\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\11\7\1\57\15\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\24\7\1\60\2\7\1\0\3\7\1\0\1\7\34\0"+
    "\1\61\6\0\1\62\27\0\1\7\3\0\2\7\2\0"+
    "\14\7\1\63\12\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\5\7\1\64\21\7\1\0"+
    "\3\7\1\0\1\7\32\0\1\65\1\0\1\66\1\67"+
    "\21\0\1\70\66\0\1\71\3\0\3\42\1\0\54\42"+
    "\3\43\1\0\3\43\1\0\1\72\47\43\1\0\1\7"+
    "\3\0\2\7\2\0\3\7\1\73\23\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\13\7"+
    "\1\74\13\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\12\7\1\75\14\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\7\7"+
    "\1\76\17\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\17\7\1\77\7\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\17\7"+
    "\1\100\7\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\16\7\1\101\10\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\22\7"+
    "\1\102\4\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\11\7\1\103\15\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\16\7"+
    "\1\104\10\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\11\7\1\105\15\7\1\0\3\7"+
    "\1\0\1\7\31\0\1\106\7\0\1\107\67\0\1\110"+
    "\21\0\1\7\3\0\2\7\2\0\20\7\1\111\6\7"+
    "\1\0\3\7\1\0\1\7\13\0\1\7\3\0\2\7"+
    "\2\0\12\7\1\112\14\7\1\0\3\7\1\0\1\7"+
    "\30\0\1\113\5\0\1\114\62\0\1\115\47\0\1\116"+
    "\57\0\1\117\41\0\1\7\3\0\2\7\2\0\4\7"+
    "\1\120\22\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\13\7\1\121\13\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\11\7"+
    "\1\122\15\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\20\7\1\123\6\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\20\7"+
    "\1\124\6\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\12\7\1\125\14\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\16\7"+
    "\1\126\10\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\16\7\1\127\10\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\7\7"+
    "\1\130\17\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\16\7\1\131\10\7\1\0\3\7"+
    "\1\0\1\7\32\0\1\132\67\0\1\133\30\0\1\7"+
    "\3\0\2\7\2\0\16\7\1\134\10\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\27\7"+
    "\1\0\2\7\1\135\1\0\1\7\37\0\1\136\50\0"+
    "\1\137\71\0\1\140\51\0\1\141\53\0\1\142\42\0"+
    "\1\7\3\0\2\7\2\0\5\7\1\143\21\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\5\7\1\144\21\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\20\7\1\145\6\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\26\7\1\146\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\12\7\1\147\14\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\13\7"+
    "\1\150\13\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\12\7\1\151\14\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\7\7"+
    "\1\152\17\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\5\7\1\153\21\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\7\7"+
    "\1\154\17\7\1\0\3\7\1\0\1\7\34\0\1\155"+
    "\66\0\1\156\27\0\1\7\3\0\2\7\2\0\13\7"+
    "\1\157\13\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\6\7\1\160\20\7\1\0\3\7"+
    "\1\0\1\7\36\0\1\161\60\0\1\162\75\0\1\163"+
    "\31\0\1\164\43\0\1\7\3\0\2\7\2\0\6\7"+
    "\1\165\20\7\1\0\3\7\1\0\1\7\13\0\1\7"+
    "\3\0\2\7\2\0\14\7\1\166\12\7\1\0\3\7"+
    "\1\0\1\7\13\0\1\7\3\0\2\7\2\0\26\7"+
    "\1\167\1\0\3\7\1\0\1\7\13\0\1\7\3\0"+
    "\2\7\2\0\11\7\1\170\15\7\1\0\3\7\1\0"+
    "\1\7\13\0\1\7\3\0\2\7\2\0\20\7\1\171"+
    "\6\7\1\0\3\7\1\0\1\7\13\0\1\7\3\0"+
    "\2\7\2\0\13\7\1\172\13\7\1\0\3\7\1\0"+
    "\1\7\13\0\1\7\3\0\2\7\2\0\5\7\1\173"+
    "\21\7\1\0\3\7\1\0\1\7\13\0\1\7\3\0"+
    "\2\7\2\0\14\7\1\174\12\7\1\0\3\7\1\0"+
    "\1\7\13\0\1\7\3\0\2\7\2\0\5\7\1\175"+
    "\21\7\1\0\3\7\1\0\1\7\43\0\1\176\65\0"+
    "\1\177\42\0\1\200\62\0\1\201\75\0\1\202\15\0"+
    "\1\7\3\0\2\7\2\0\7\7\1\203\17\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\7\7\1\204\17\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\7\7\1\205\17\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\5\7\1\206\21\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\20\7\1\207\6\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\14\7\1\210\12\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\7\7\1\211\17\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\14\7\1\212\12\7\1\0\3\7\1\0\1\7\51\0"+
    "\1\213\37\0\1\214\41\0\1\7\3\0\2\7\2\0"+
    "\16\7\1\215\10\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\5\7\1\216\21\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\7\7\1\217\17\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\7\7\1\220\17\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\7\7\1\221\17\7\1\0\3\7\1\0\1\7\13\0"+
    "\1\7\3\0\2\7\2\0\16\7\1\222\10\7\1\0"+
    "\3\7\1\0\1\7\13\0\1\7\3\0\2\7\2\0"+
    "\7\7\1\223\17\7\1\0\3\7\1\0\1\7\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5280];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\2\0\1\11\1\1\1\11\3\1\2\11\15\1\6\11"+
    "\1\1\3\11\1\1\1\0\15\1\2\0\2\1\4\0"+
    "\1\11\14\1\2\0\1\11\2\1\5\0\12\1\2\0"+
    "\2\1\2\0\1\11\2\0\13\1\1\0\2\1\1\11"+
    "\3\0\11\1\1\0\3\11\1\0\10\1\2\11\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[147];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _FormLexer(java.io.Reader in) {
    this.zzReader = in;
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
    while (i < 1728) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch ((zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL-1] : zzBufferL.charAt(zzMarkedPosL-1))) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
        case 31: 
          { return FormTokens.ELSEIF_KEYWORD;
          }
        case 45: break;
        case 8: 
          { return FormTokens.LPAR      ;
          }
        case 46: break;
        case 13: 
          { return FormTokens.POWER     ;
          }
        case 47: break;
        case 20: 
          { return FormTokens.IF_KEYWORD;
          }
        case 48: break;
        case 4: 
          { return FormTokens.WHITE_SPACE;
          }
        case 49: break;
        case 2: 
          { return FormTokens.INTEGER_LITERAL;
          }
        case 50: break;
        case 12: 
          { return FormTokens.DIV       ;
          }
        case 51: break;
        case 44: 
          { return FormTokens.CFUNCTIONS_KEYWORD;
          }
        case 52: break;
        case 17: 
          { return FormTokens.QUEST     ;
          }
        case 53: break;
        case 7: 
          { return FormTokens.RBRACKET  ;
          }
        case 54: break;
        case 14: 
          { return FormTokens.EQ        ;
          }
        case 55: break;
        case 37: 
          { return FormTokens.INDICES_KEYWORD;
          }
        case 56: break;
        case 3: 
          { return FormTokens.MUL       ;
          }
        case 57: break;
        case 36: 
          { return FormTokens.VECTORS_KEYWORD;
          }
        case 58: break;
        case 42: 
          { return FormTokens.NTENSORS_KEYWORD;
          }
        case 59: break;
        case 28: 
          { return FormTokens.PRINT_KEYWORD;
          }
        case 60: break;
        case 16: 
          { return FormTokens.SEMICOLON ;
          }
        case 61: break;
        case 22: 
          { return FormTokens.SET_KEYWORD;
          }
        case 62: break;
        case 6: 
          { return FormTokens.LBRACKET  ;
          }
        case 63: break;
        case 34: 
          { return FormTokens.CLEAR_KEYWORD;
          }
        case 64: break;
        case 10: 
          { return FormTokens.PLUS      ;
          }
        case 65: break;
        case 25: 
          { return FormTokens.END_KEYWORD;
          }
        case 66: break;
        case 40: 
          { return FormTokens.GLOBAL_KEYWORD;
          }
        case 67: break;
        case 27: 
          { return FormTokens.ELSE_DIRECTIVE;
          }
        case 68: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 69: break;
        case 9: 
          { return FormTokens.RPAR      ;
          }
        case 70: break;
        case 32: 
          { return FormTokens.ENDIF_DIRECTIVE;
          }
        case 71: break;
        case 39: 
          { return FormTokens.ELSEIF_DIRECTIVE;
          }
        case 72: break;
        case 43: 
          { return FormTokens.FUNCTIONS_KEYWORD;
          }
        case 73: break;
        case 19: 
          { return FormTokens.ID_KEYWORD;
          }
        case 74: break;
        case 15: 
          { return FormTokens.COMMA     ;
          }
        case 75: break;
        case 41: 
          { return FormTokens.CTENSORS_KEYWORD;
          }
        case 76: break;
        case 5: 
          { return FormTokens.IDENTIFIER;
          }
        case 77: break;
        case 38: 
          { return FormTokens.TENSORS_KEYWORD;
          }
        case 78: break;
        case 35: 
          { return FormTokens.SYMBOLS_KEYWORD;
          }
        case 79: break;
        case 23: 
          { return FormTokens.IF_DIRECTIVE;
          }
        case 80: break;
        case 21: 
          { return FormTokens.EQEQ      ;
          }
        case 81: break;
        case 24: 
          { return FormTokens.ELSE_KEYWORD;
          }
        case 82: break;
        case 26: 
          { return FormTokens.ENDIF_KEYWORD;
          }
        case 83: break;
        case 29: 
          { return FormTokens.LOCAL_KEYWORD;
          }
        case 84: break;
        case 30: 
          { return FormTokens.SORT_KEYWORD;
          }
        case 85: break;
        case 33: 
          { return FormTokens.STORE_KEYWORD;
          }
        case 86: break;
        case 11: 
          { return FormTokens.MINUS     ;
          }
        case 87: break;
        case 18: 
          { return FormTokens.LINE_COMMENT;
          }
        case 88: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
