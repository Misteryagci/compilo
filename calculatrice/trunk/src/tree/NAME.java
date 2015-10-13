package tree;

import temp.Temp;
import temp.Label;


public class NAME extends Exp
{
    public Label label;
  

    public NAME(Label l) { super(); label = l; }

    public String toString() { return "NAME (" + label.toString() + ")"; }

    public void toDot(StringBuffer str)
    {
        str.append("e_" + id + " [shape=\"ellipse\", label=\"NAME\"];\n");
        str.append("l" + id + "_" + label + "[shape=\"ellipse\", label=\"" + label + "\"];\n");
        str.append("e_" + id + " -> " + "l" + id + "_"+ label + ";\n");
    }

    public Object generate()
    {
        return label.toString();
    }
}

