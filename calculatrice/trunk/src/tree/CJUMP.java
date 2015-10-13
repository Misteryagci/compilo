package tree;
import temp.*;


public class CJUMP extends Stm 
{
    public int relop;
    public Exp left, right;
    public Label iftrue, iffalse;
   

    public final static int EQ = 0, NE = 1, LT = 2, GT = 3, LE = 4, GE = 5, ULT = 6, ULE = 7, UGT = 8, UGE = 9;
   
    public static int notRel(int relop)
    {
        switch (relop) {
            case EQ:  return NE;
            case NE:  return EQ;
            case LT:  return GE;
            case GE:  return LT;
            case GT:  return LE;
            case LE:  return GT;
            case ULT: return UGE;
            case UGE: return ULT;
            case UGT: return ULE;
            case ULE: return UGT;
            default: throw new Error("bad relop in CJUMP.notRel");
        }
    }

    public static String relToString(int relop)
    {
        String[] strs = new String[] { "==", "!=", "<", ">", "<=", ">=", "ULT", "ULE", "UGT", "UGE" };
        return strs[relop];
    }


    public CJUMP(int rel, Exp l, Exp r, Label t, Label f)
    {
        super();
        relop = rel; left = l; right = r; iftrue = t; iffalse = f;
    }


    public String toString()
    { 
        return "CJUMP (" + relToString(relop) + ", " + left.toString() + ", " + right.toString() + ", " + iftrue.toString() + ", " + iffalse.toString() + ")";
    }
      
    public void toDot(StringBuffer str)
    {
        str.append("s_" + id + " [shape=\"ellipse\", label=\"CJUMP\"];\n");
        str.append("rel_" + id + "_" + relop + " [shape=\"ellipse\", label=\"" + relToString(relop) + "\"];\n");
        str.append("s_" + id + " -> rel_" + id + "_" + relop + ";\n");
        left.toDot(str);
        str.append("s_" + id + " -> e_" + left.id + ";\n");
        right.toDot(str);
        str.append("s_" + id + " -> e_" + right.id + ";\n");
        
        str.append("l_" + iftrue + " [shape=\"ellipse\", label=\"" + iftrue + "\"];\n");
        str.append("s_" + id + " -> l_" + iftrue + ";\n");
        str.append("l_" + iffalse + " [shape=\"ellipse\", label=\"" + iffalse + "\"];\n");
        str.append("s_" + id + " -> l_" + iffalse + ";\n");
    }


    public Object generate()
    {
        Object o1 = left.generate();
        Object o2 = right.generate();
        Object t1, t2;

        if (left.getClass() != BINOP.class) t1 = o1;
        else {
            t1 = new Temp();
            System.out.println(t1 + " = " + o1);
        }

        if (right.getClass() != BINOP.class) t2 = o2;
        else {
            t2 = new Temp();
            System.out.println(t2 + " = " + o2);
        }

        System.out.println("if (" + t1  + " " + relToString(relop) + " " + t2 + ") then JUMP " + iftrue.toString() + " else JUMP " + iffalse.toString());
        
        return null;
    }
}

