package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeAFF extends Stree {

    public StreeAFF(Stree left, Stree right)
    {
	    super(EnumTag.AFF, left, right, null);
    }

    public Tree build() 
    {
        return new MOVE((Exp) left.build(), (Exp) right.build());
    }   
    
}
