package tree;

import temp.Temp;
import temp.Label;


public class JUMP extends Stm
{
    public Exp exp;
    public temp.LabelList targets;


    public JUMP(Exp e, temp.LabelList t) { super(); exp = e; targets = t; }

    public JUMP(temp.Label target)
    {
        this(new NAME(target), new temp.LabelList(target,null));
    }

    public String toString() { return "JUMP (" + targets.head + ")"; }
  
    public void toDot(StringBuffer str)
    {
	    str.append("s_"+id+" [shape=\"ellipse\", label=\"JUMP\"];\n");
	    str.append("l_"+targets.head+" [shape=\"ellipse\", label=\"" + targets.head + "\"];\n");
	    str.append("s_"+id+" -> l_"+ targets.head +";\n");
    }
    
    public Object generate()
    {
        System.out.println("JUMP " + targets.head.toString());
        return null;
    }
}

