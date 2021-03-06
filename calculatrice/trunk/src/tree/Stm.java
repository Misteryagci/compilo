package tree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


abstract public class Stm extends Tree
{
    protected int id;   // used in toDot
    protected static int uniqId=0;
   
    public Stm()
    {
	    id=uniqId++; 
    }
    
    public String toString() { return new String("STM") ;};
    
    public void toDot(StringBuffer str)
    {
	    str.append("a_"+id+" [shape=\"ellipse\", label=\"STM\"];\n");
    }

    public void toDot(String file)
    {
	    try {
	        BufferedWriter out = new BufferedWriter(new FileWriter(file));
	        out.write("digraph Stree {\n");
	        StringBuffer str = new StringBuffer();
	        toDot(str);
	        out.write(str.toString());
	        out.write("}\n");
	        out.close();
	    } catch (IOException e) {
	        System.err.println("ERROR: build dot");
	    }		
    }
    
    public Object generate()
    {
        return null;
    }
}

