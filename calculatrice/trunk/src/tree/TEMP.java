package tree;

import temp.*;

public class TEMP extends Exp
{
    public temp.Temp temp;


    public TEMP(temp.Temp t) { super(); temp = t; }
  
    public String toString() { return "TEMP (" + temp.toString() + ")"; }
    
    public void toDot(StringBuffer str)
    {
	    str.append("e_" + id + " [shape=\"ellipse\", label=\"TEMP\"];\n");
	    str.append("t" + id + "_" + temp + " [shape=\"ellipse\", label=\"" + temp + "\"];\n");
	    str.append("e_" + id + " -> t" + id + "_"+ temp +";\n");
    }
}

