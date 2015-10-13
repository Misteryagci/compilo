package tree;

import temp.Temp;
import temp.Label;


public class MOVE extends Stm
{
    public Exp dst, src;
    
    
    public MOVE(Exp d, Exp s) { super(); dst=d; src=s; }
    
    public String toString() { return "MOVE (" + dst.toString() + ", " + src.toString() + ")"; }
    
    public void toDot(StringBuffer str)
    {
  	    str.append("s_" + id + " [shape=\"ellipse\", label=\"MOVE\"];\n");
  	    dst.toDot(str);
        str.append("s_" + id + " -> e_"+ dst.id +";\n");
        src.toDot(str);
        str.append("s_" + id + " -> e_"+ src.id  +";\n");
    }

    public Object generate()
    {
        Object o1 = dst.generate();
        Object o2 = src.generate();
        System.out.println(o1 + " = " + o2);
        return null;
    }
}
