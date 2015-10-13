package tree;

import temp.Temp;
import temp.Label;


public class FUNC extends Stm
{
    public Stm left;
    public String name;

    public FUNC(Stm l, String n) { super(); left = l; name = n; }
    
    public String toString()
    { 
        return "FUNC (" + name + ", " + left.toString() +  ")";
    }
    
    public void toDot(StringBuffer str)
    {
	    str.append("s_"+id+" [shape=\"ellipse\", label=\"FUNC\"];\n");
	    left.toDot(str);
	    str.append("s_"+id+" -> s_"+left.id+";\n");
    }

    public Object generate()
    {
        System.out.println("\nFUNC " + name);
        left.generate();
        System.out.println("ENDFUNC\n");
        
        return null;
    }
}
