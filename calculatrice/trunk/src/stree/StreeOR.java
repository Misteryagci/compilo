package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeOR extends Stree
{
    public StreeOR(Stree left, Stree right)
    {
	    super(EnumTag.OR, left, right, null);
    }
    
    public Tree build()
    {
        return new BINOP(BINOP.OR, (Exp) left.build(), (Exp) right.build());
    }
}
