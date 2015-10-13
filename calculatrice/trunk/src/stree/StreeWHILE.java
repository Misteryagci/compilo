package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;
import temp.*;


public class StreeWHILE extends Stree
{
    public StreeWHILE(Stree left, Stree right)
    {
	    super(EnumTag.WHILE, left, right, null);
    }
   
    public Tree build()
    {
        Label l1 = new Label(), l2 = new Label(), l3 = new Label();
        return new SEQ(
                new SEQ(new LABEL(l1), new CJUMP(CJUMP.NE, (Exp) left.build(), new CONST<Integer>(0), l2, l3)),
                new SEQ(new LABEL(l2),
                new SEQ((Stm) right.build(),
                new SEQ(new JUMP(l1), new LABEL(l3)))));
    }
}
