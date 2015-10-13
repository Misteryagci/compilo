package tree;

import temp.*;


public class BINOP extends Exp
{
    public int binop;
    public Exp left, right;


    public final static int PLUS = 0, MINUS = 1, MUL = 2, DIV = 3, AND = 4, OR = 5, LSHIFT = 6, RSHIFT = 7, ARSHIFT = 8, XOR = 9, MOD = 10;
    public final static int EQ = 11, NE = 12, LT = 13, GT = 14, LE = 15, GE = 16, ULT = 17, ULE = 18, UGT = 19, UGE = 20;
    
    public static String binopToString(int b)
    {
        String[] strs = new String[] { "+", "-", "*", "/", "&&", "||", "<<", ">>", "ARSHIFT", "^", "%", "==", "!=", "<", ">", "<=", ">=", "ULT", "ULE", "UGT", "UGE" };
        return strs[b];
    }


    public BINOP(int b, Exp l, Exp r)
    {
	    super();
      	binop = b; left = l; right = r; 
    }

    public String toString()
    {
        return "BINOP (" + binopToString(binop) + ", " + left.toString() + ", " + right.toString() + ")";
    }

    public void toDot(StringBuffer str)
    {
        str.append("e_" + id + " [shape=\"ellipse\", label=\"BINOP\"];\n");
        str.append("rel_" + id + "_" + binop + " [shape=\"ellipse\", label=\"" + binopToString(binop) + "\"];\n");
        str.append("e_" + id + " -> rel_" + id + "_" + binop + ";\n");
        left.toDot(str);
        str.append("e_" + id + " -> e_" + left.id + ";\n");
        right.toDot(str);
        str.append("e_" + id + " -> e_" + right.id + ";\n");
    }
   
    public Object generate()
    {
        Object o1 = left.generate();
        Object o2 = right.generate();
        Object t1, t2;

        if (left.getClass() ==  BINOP.class) {
            t1 = new Temp();
            System.out.println(t1 + " = " + o1.toString());
        }
        else t1 = o1;

        if (right.getClass() ==  BINOP.class) {
            t2 = new Temp();
            System.out.println(t2 + " = " + o2.toString());
        }
        else t2 = o2;
        
        return t1 + " " + binopToString(binop) + " " + t2;
    }
}

