package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeMULT extends Stree
{
    public StreeMULT(Stree left, Stree right)
    {
	    super(EnumTag.MULT, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.MUL, (Exp) getLeft().build(), (Exp) getRight().build());
    }
}
