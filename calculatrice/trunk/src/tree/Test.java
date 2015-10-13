package tree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import temp.*;


public class Test
{
    SEQ s;
    Label l1 = new Label();
    Label l2 = new Label();
    Label l3 = new Label();
    Temp t1 = new Temp();
    Temp t2 = new Temp();
    

    public Test()
    {
        s = new SEQ(new CJUMP(CJUMP.EQ, new TEMP(t1), new CONST(7), l1, l2),
                new SEQ(new LABEL(l1),
                new SEQ(new MOVE(new TEMP(t2), new CONST(5)),
                new SEQ(new JUMP(l3),
                new SEQ(new LABEL(l2),
                new SEQ(new MOVE(new TEMP(t2), new CONST(7)), new LABEL(l3)))))));
    }
    

    public String toString()
    {
        return s.toString();
    }

    public void toDot(String file)
	{
        try {
	        BufferedWriter out = new BufferedWriter(new FileWriter(file));
	        out.write("digraph Stree {\n");
	        StringBuffer str = new StringBuffer();
	        s.toDot(str);
	        out.write(str.toString());
	        out.write("}\n");
	        out.close();
	    } catch (IOException e) {
	        System.err.println("ERROR: build dot");
        }
    }
}
