package tree;

import temp.Temp;
import temp.Label;


public class SEQ extends Stm
{
    public Stm left, right;

    public SEQ(Stm l, Stm r) { super(); left = l; right = r; }
    
    public String toString()
    { 
        return "SEQ (" + left.toString() + ", " + right.toString() + ")";
    }
    
    public void toDot(StringBuffer str)
    {
	    str.append("s_"+id+" [shape=\"ellipse\", label=\"SEQ\"];\n");
	    left.toDot(str);
	    str.append("s_"+id+" -> s_"+left.id+";\n");
        right.toDot(str);
	    str.append("s_"+id+" -> s_"+right.id+";\n");
    }

    public Object generate()
    {
        left.generate();
        right.generate();
        return null;
    }
}
