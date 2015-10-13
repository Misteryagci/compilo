import java.io.FileReader;
import java_cup.runtime.Symbol;
import stree.*;
import tree.*;


public class Main
{
   /* public static void main(String[] args)
    {
    	try {
    	    FileReader file = new FileReader(args[0]);
    	    try {
    		CompLexer lexer = new CompLexer(file);
    		CompParser parser = new CompParser(lexer);
    		Symbol result = parser.debug_parse();
    	//	Symbol result=parser.parse();
    		try {
    		    Stree tree=(Stree)result.value;
    		    tree.toDot(args[1]);
    		  
               //  Tree t = tree.build();
                   System.out.println(tree);
            }	
    		catch (Exception e) {
    		    System.out.println("result error.. -> ." + e.getMessage());
    		}
    	    }
    	    catch (Exception e) {
    		System.out.println("parse error...");
    	    }
    	}
    	catch (Exception e){
    	    System.out.println("file error...");	    
    	}
    }*/

//  main to see Exception with Java without catch (very pratice to debugging).

    public static void main(String[] args)
    {
        FileReader file = null;
        Symbol result = null;

        try {
            file = new FileReader(args[0]);
            CompLexer lexer = new CompLexer(file);
    	    CompParser parser = new CompParser(lexer);
    	    result = parser.debug_parse();
        }
        catch (Exception e) {
        }
    	    
        Stree tree = (Stree)result.value;
       // System.out.println(tree);
    //	tree.toDot(args[1]);
    
        Tree t = ((Stree) result.value).build();
        t.toDot(args[1]);
	  //  System.out.println(t);
        t.generate();
    }
}
