package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeMOD extends Stree
{
    public StreeMOD(Stree left, Stree right)
    {
	    super(EnumTag.MOD, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.MOD, (Exp) getLeft().build(), (Exp) getRight().build());
    }
}
