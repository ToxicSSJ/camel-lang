
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package sh.toxic.camel;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\012\005\000\002\002\004\000\002\012" +
    "\006\000\002\011\003\000\002\011\004\000\002\010\011" +
    "\000\002\010\013\000\002\010\012\000\002\010\014\000" +
    "\002\010\011\000\002\010\006\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\007" +
    "\005\000\002\007\005\000\002\007\003\000\002\007\003" +
    "\000\002\006\005\000\002\006\003\000\002\004\005\000" +
    "\002\004\003\000\002\005\005\000\002\005\003\000\002" +
    "\002\005\000\002\002\003\000\002\003\003\000\002\003" +
    "\003\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\116\000\004\014\004\001\002\000\022\005\010\015" +
    "\020\021\012\025\013\031\015\032\014\033\016\034\007" +
    "\001\002\000\004\002\006\001\002\000\004\002\000\001" +
    "\002\000\006\005\114\006\113\001\002\000\024\005\045" +
    "\015\020\021\012\025\013\031\015\032\014\033\016\034" +
    "\007\035\050\001\002\000\004\030\107\001\002\000\004" +
    "\007\076\001\002\000\004\007\070\001\002\000\004\005" +
    "\060\001\002\000\004\005\060\001\002\000\004\005\060" +
    "\001\002\000\034\005\045\015\020\020\ufffe\021\012\023" +
    "\ufffe\024\ufffe\025\013\027\ufffe\030\ufffe\031\015\032\014" +
    "\033\016\034\007\001\002\000\004\005\021\001\002\000" +
    "\004\035\022\001\002\000\010\004\024\005\026\007\025" +
    "\001\002\000\004\016\042\001\002\000\016\010\uffe6\011" +
    "\uffe6\012\uffe6\013\uffe6\016\uffe6\036\uffe6\001\002\000\010" +
    "\004\024\005\026\007\025\001\002\000\016\010\uffe5\011" +
    "\uffe5\012\uffe5\013\uffe5\016\uffe5\036\uffe5\001\002\000\014" +
    "\010\uffe7\011\uffe7\012\uffe7\013\uffe7\036\uffe7\001\002\000" +
    "\006\010\037\011\040\001\002\000\010\010\uffeb\011\uffeb" +
    "\036\uffeb\001\002\000\014\010\uffe9\011\uffe9\012\033\013" +
    "\034\036\uffe9\001\002\000\010\004\024\005\026\007\025" +
    "\001\002\000\010\004\024\005\026\007\025\001\002\000" +
    "\014\010\uffe8\011\uffe8\012\uffe8\013\uffe8\036\uffe8\001\002" +
    "\000\012\010\uffea\011\uffea\013\034\036\uffea\001\002\000" +
    "\016\010\uffe4\011\uffe4\012\uffe4\013\uffe4\016\uffe4\036\uffe4" +
    "\001\002\000\010\004\024\005\026\007\025\001\002\000" +
    "\010\010\uffec\011\uffec\036\uffec\001\002\000\004\005\043" +
    "\001\002\000\024\005\045\015\020\017\044\021\012\025" +
    "\013\031\015\032\014\033\016\034\007\001\002\000\004" +
    "\004\053\001\002\000\004\035\050\001\002\000\004\020" +
    "\047\001\002\000\034\005\ufffa\015\ufffa\020\ufffa\021\ufffa" +
    "\023\ufffa\024\ufffa\025\ufffa\027\ufffa\030\ufffa\031\ufffa\032" +
    "\ufffa\033\ufffa\034\ufffa\001\002\000\010\004\024\005\026" +
    "\007\025\001\002\000\006\011\040\036\052\001\002\000" +
    "\034\005\ufff7\015\ufff7\020\ufff7\021\ufff7\023\ufff7\024\ufff7" +
    "\025\ufff7\027\ufff7\030\ufff7\031\ufff7\032\ufff7\033\ufff7\034" +
    "\ufff7\001\002\000\022\005\045\015\020\021\012\025\013" +
    "\031\015\032\014\033\016\034\007\001\002\000\004\020" +
    "\055\001\002\000\034\005\ufff9\015\ufff9\020\ufff9\021\ufff9" +
    "\023\ufff9\024\ufff9\025\ufff9\027\ufff9\030\ufff9\031\ufff9\032" +
    "\ufff9\033\ufff9\034\ufff9\001\002\000\014\020\ufffd\023\ufffd" +
    "\024\ufffd\027\ufffd\030\ufffd\001\002\000\006\036\062\037" +
    "\061\001\002\000\006\036\uffed\037\uffed\001\002\000\004" +
    "\005\063\001\002\000\034\005\ufff6\015\ufff6\020\ufff6\021" +
    "\ufff6\023\ufff6\024\ufff6\025\ufff6\027\ufff6\030\ufff6\031\ufff6" +
    "\032\ufff6\033\ufff6\034\ufff6\001\002\000\006\036\uffee\037" +
    "\uffee\001\002\000\006\036\065\037\061\001\002\000\034" +
    "\005\ufff5\015\ufff5\020\ufff5\021\ufff5\023\ufff5\024\ufff5\025" +
    "\ufff5\027\ufff5\030\ufff5\031\ufff5\032\ufff5\033\ufff5\034\ufff5" +
    "\001\002\000\006\036\067\037\061\001\002\000\034\005" +
    "\ufff4\015\ufff4\020\ufff4\021\ufff4\023\ufff4\024\ufff4\025\ufff4" +
    "\027\ufff4\030\ufff4\031\ufff4\032\ufff4\033\ufff4\034\ufff4\001" +
    "\002\000\010\004\024\005\026\007\025\001\002\000\006" +
    "\010\072\011\040\001\002\000\004\026\073\001\002\000" +
    "\022\005\045\015\020\021\012\025\013\031\015\032\014" +
    "\033\016\034\007\001\002\000\004\027\075\001\002\000" +
    "\034\005\ufff8\015\ufff8\020\ufff8\021\ufff8\023\ufff8\024\ufff8" +
    "\025\ufff8\027\ufff8\030\ufff8\031\ufff8\032\ufff8\033\ufff8\034" +
    "\ufff8\001\002\000\010\004\024\005\026\007\025\001\002" +
    "\000\006\010\100\011\040\001\002\000\004\022\101\001" +
    "\002\000\022\005\045\015\020\021\012\025\013\031\015" +
    "\032\014\033\016\034\007\001\002\000\006\023\104\024" +
    "\103\001\002\000\034\005\ufffc\015\ufffc\020\ufffc\021\ufffc" +
    "\023\ufffc\024\ufffc\025\ufffc\027\ufffc\030\ufffc\031\ufffc\032" +
    "\ufffc\033\ufffc\034\ufffc\001\002\000\022\005\045\015\020" +
    "\021\012\025\013\031\015\032\014\033\016\034\007\001" +
    "\002\000\004\024\106\001\002\000\034\005\ufffb\015\ufffb" +
    "\020\ufffb\021\ufffb\023\ufffb\024\ufffb\025\ufffb\027\ufffb\030" +
    "\ufffb\031\ufffb\032\ufffb\033\ufffb\034\ufffb\001\002\000\004" +
    "\002\001\001\002\000\004\030\111\001\002\000\004\002" +
    "\uffff\001\002\000\006\036\116\037\115\001\002\000\006" +
    "\036\uffef\037\uffef\001\002\000\006\036\ufff0\037\ufff0\001" +
    "\002\000\006\005\120\006\117\001\002\000\034\005\ufff3" +
    "\015\ufff3\020\ufff3\021\ufff3\023\ufff3\024\ufff3\025\ufff3\027" +
    "\ufff3\030\ufff3\031\ufff3\032\ufff3\033\ufff3\034\ufff3\001\002" +
    "\000\006\036\ufff1\037\ufff1\001\002\000\006\036\ufff2\037" +
    "\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\116\000\004\012\004\001\001\000\006\010\016\011" +
    "\010\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\111\001\001\000\006\010\016\011\107\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\065\001\001\000\004\006\063\001\001\000\004\006" +
    "\056\001\001\000\006\010\016\011\055\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\002\031\003\026" +
    "\004\027\005\030\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\002\035\003\026\001\001\000\004\003\034\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\002\031\003\026\005\040\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\016\011\045\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\002\031\003\026\004\050\005\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\010" +
    "\016\011\053\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\002\031\003\026\004\070\005\030\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\016\011" +
    "\073\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\002\031\003\026\004\076\005\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\016\011\101\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\016\011" +
    "\104\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String errsin="";
    public void syntax_error(Symbol x){
        errsin+="\nError Sintaxis en pos Linea=" + (x.left+1) + ", Caracter=" + (x.right+1) + ", Value=" + x.value;
        throw new UnsupportedOperationException (errsin);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // IS ::= programa S finprograma 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IS",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= IS EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // IS ::= programa id S finprograma 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IS",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // S ::= I 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("S",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // S ::= I S 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("S",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // I ::= si pi EL pd entonces S finsi 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // I ::= si pi EL pd entonces S sino S finsi 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // I ::= para id asig T hasta id S finpara 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // I ::= para id asig T hasta id paso num S finpara 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // I ::= mientras pi EL pd hacer S finmientras 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // I ::= id asig EL pc 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // I ::= tipo Z pc 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // I ::= leer Z pc 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // I ::= entero Z pc 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // I ::= escribir K pc 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // K ::= K cm id 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("K",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // K ::= K cm str 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("K",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // K ::= id 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("K",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // K ::= str 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("K",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Z ::= Z cm id 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Z",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Z ::= id 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Z",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EL ::= EL ol EA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EL",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EL ::= EA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EL",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EA ::= E or E 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EA",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EA ::= E 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EA",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // E ::= E op T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // E ::= T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // T ::= num 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("T",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // T ::= id 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("T",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // T ::= pi EL pd 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("T",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
