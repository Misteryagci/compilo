package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeLT extends Stree
{
    public StreeLT(Stree left, Stree right)
    {
	    super(EnumTag.LT, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.LT, (Exp) left.build(), (Exp) right.build());
    }
}
