package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeDIV extends Stree
{
    public StreeDIV(Stree left, Stree right)
    {
	    super(EnumTag.DIV, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.DIV, (Exp) getLeft().build(), (Exp) getRight().build());
    }
}
