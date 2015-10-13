package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreePRODUCT extends Stree
{
    public StreePRODUCT(Stree left, Stree right)
    {
	    super(EnumTag.PRODUCT, left, right, null);
    }
    
    public Tree build()
    {
        return null;
    }
}
