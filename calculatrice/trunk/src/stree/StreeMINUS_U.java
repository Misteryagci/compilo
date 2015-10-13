package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;
import temp.*;


public class StreeMINUS_U extends Stree {

    public StreeMINUS_U(Stree left)
    {
	    super(EnumTag.MINUS_U, left, null, null);
    }

    public Tree build()
    {
        return new BINOP(BINOP.MINUS, (Exp) new CONST<Integer>((Integer) 0), (Exp) left.build());
    }
}
