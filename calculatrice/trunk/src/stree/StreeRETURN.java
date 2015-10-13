package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeRETURN extends Stree
{
    public StreeRETURN(Stree left)
    {
	super(EnumTag.RETURN, left, null, null);
    }

    public Tree build() 
    {
	if (left == null) 
	    return new RETURN(null);
	else
	    return new RETURN((Exp) left.build());
    }      
}
