package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeLE extends Stree
{
    public StreeLE(Stree left, Stree right)
    {
	    super(EnumTag.LE, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.LE, (Exp) left.build(), (Exp) right.build());
    }
}
