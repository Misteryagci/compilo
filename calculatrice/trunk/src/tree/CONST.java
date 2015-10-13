package tree;

import temp.Temp;
import temp.Label;


public class CONST<T> extends Exp
{
    T value;
    public int type;
    
    
    public final static int INT = 0, FLOAT = 1, CHAR = 2, STRING = 3, BOOL = 4;

    public static String typeToString(int t)
    {
        String[] strs = new String[] { "INT", "FLOAT", "CHAR", "STRING", "BOOL" };
        return strs[t];
    }


    public CONST(T v)
    {
        super();
        value = v;
        
        if (value.getClass() == Integer.class)          type = INT;
        else if (value.getClass() == Float.class)       type = FLOAT;
        else if (value.getClass() == Character.class)   type = CHAR;
        else if (value.getClass() == String.class)      type = STRING;
        else if (value.getClass() == Boolean.class)     type = BOOL;
    }
    
    public String toString() { return "CONST (" + typeToString(type) + ", " + value + ")"; }

    public void toDot(StringBuffer str)
    {
	    str.append("e_" + id + " [shape=\"ellipse\", label=\"CONST\"];\n");
	    
     /*   str.append("l1e" + id + "[shape=\"ellipse\", label=\"" + typeToString(type) + "\"];\n");
	    str.append("e_" + id + " -> l1e" + id + ";\n"); */
	    
        str.append("l2e" + id + "[shape=\"ellipse\", label=\"" + value + "\"];\n");
	    str.append("e_" + id + " -> l2e" + id + ";\n");
    }
    
    public Object generate()
    {
        return value.toString();
    }
}

