package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeAND extends Stree
{
    public StreeAND(Stree left, Stree right)
    {
	    super(EnumTag.AND, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.AND, (Exp) left.build(), (Exp) right.build());
    }
}
