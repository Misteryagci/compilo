package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeMINUS extends Stree
{
    public StreeMINUS(Stree left, Stree right)
    {
	    super(EnumTag.MINUS, left, right, null);
    }
   
    public Tree build()
    {
        return new BINOP(BINOP.MINUS, (Exp) getLeft().build(), (Exp) getRight().build());
    }
}
