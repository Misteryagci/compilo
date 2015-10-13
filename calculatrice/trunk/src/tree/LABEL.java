package tree;

import temp.Temp;
import temp.Label;


public class LABEL extends Stm
{ 
    public Label label;
   

    public LABEL(Label l) { super(); label = l; }
    
    public String toString() { return "LABEL (" + label.toString() + ")"; }

    public void toDot(StringBuffer str)
    {
        str.append("s_"+id+" [shape=\"ellipse\", label=\"LABEL\"];\n");
        str.append("l"+id+"_"+label+""+ "[shape=\"ellipse\", label=\""+label+"\"];\n");
        str.append("s_"+id+" -> "+ "l"+id+"_"+label +";\n");
    }
    
    public Object generate()
    {
        System.out.println("LABEL " + label.toString());
        return null;
    }
}

