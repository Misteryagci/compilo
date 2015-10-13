package tree;


public class CALL extends Stm
{
    String func;
    ExpList args;

    public CALL(String f, ExpList a)
    {
        super();
        func = f; args = a;
    }
    
    public String toString()
    {
        return "CALL (" + func + ")";
    }

    public void toDot(StringBuffer str)
    {
        str.append("s_" + id + " [shape=\"ellipse\", label=\"CALL\"];\n");
        str.append("sfunc_" + id + " [shape=\"ellipse\", label=\"" + func + "\"];\n");
        str.append("s_" + id + " -> sfunc_" + id + ";\n");
    }

    public Object generate()
    {
        System.out.println("CALL " + func);
        return null;
    }
}
