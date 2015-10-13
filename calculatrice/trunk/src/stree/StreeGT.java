package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeGT extends Stree
{
    public StreeGT(Stree left, Stree right)
    {
	    super(EnumTag.GT, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.GT, (Exp) left.build(), (Exp) right.build());
    }
}
