package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeNOT extends Stree
{
    public StreeNOT(Stree left)
    {
	    super(EnumTag.NOT, left, null, null);
    }
    
    public Tree build()
    {
        return null;
    }
}
