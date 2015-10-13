package tree;
import temp.*;


public class RETURN extends Stm
{
    public Exp exp;


    public RETURN(Exp e)
    {
	super();
        exp = e;
    }

    public String toString()
    {
        return "RETURN (" + ((exp == null) ? "NULL" : exp.toString())  + ")";
    }
    
    public void toDot(StringBuffer str)
    {
        str.append("s_" + id + " [shape=\"ellipse\", label=\"RESULT\"];\n");
        
        if (exp == null) {
            str.append("snull_" + id + " [shape=\"ellipse\", label=\"NULL\"];\n");
            str.append("s_" + id + " -> snull_" + id + ";\n");
        }
        else {
            exp.toDot(str);
            str.append("s_" + id + " -> e_" + exp.id + ";\n");
        }
    }
   
    public Object generate()
    {
        if (exp == null) {
            System.out.println("RETURN");
            return null;
        }
        
        Object o = exp.generate();
        Object t;

        if (exp.getClass() ==  BINOP.class) {
            t = new Temp();
            System.out.println(t + " = " + o.toString());
        }
        else t = o;

        System.out.println("RETURN " + t);
        return null;
    }
}
