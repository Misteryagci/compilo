package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeTYPE extends Stree {

    public StreeTYPE(Object object)
    {
	    super(EnumTag.TYPE, null, null, object);
    }

    public Tree build() 
    {
        System.out.println("TYPE");
        return null;
    }   
    
}
