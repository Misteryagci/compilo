package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeEQ extends Stree
{
    public StreeEQ(Stree left, Stree right)
    {
	    super(EnumTag.EQ, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.EQ, (Exp) left.build(), (Exp) right.build());
    }
}
