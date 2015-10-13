package stree;

import java.lang.String;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;
import temp.*;


public class StreeIF extends Stree {

    public StreeIF(Stree left, Stree right)
    {
	    super(EnumTag.IF, left, right, null);
    }

    public Tree build()
    {
        Stree l = right.getLeft();
        Stree r = right.getRight();
        Label l1 = new Label(), l2 = new Label(), l3;

        if (r == null) {                                    // the ELSE statement doesn't exist in this case.
            return new SEQ(new CJUMP(CJUMP.NE, (Exp) left.build(), new CONST<Integer>(0), l1, l2),
                           new SEQ(new LABEL(l1), new SEQ((Stm) l.build(), new LABEL(l2))));
        }
        else {
            l3 = new Label();
            return new SEQ(new CJUMP(CJUMP.NE, (Exp) left.build(), new CONST<Integer>(0), l1, l2),
                           new SEQ(new LABEL(l1), new SEQ((Stm) l.build(), 
                           new SEQ(new JUMP(l3),
                           new SEQ(new LABEL(l2), new SEQ((Stm) r.build(), new LABEL(l3)))))));
        }
    }
}
