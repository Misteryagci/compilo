package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeINTEGER extends Stree {

    public StreeINTEGER(Object object)
    {
	    super(EnumTag.INTEGER, null, null, object);
    }

    public Tree build()
    {
        return new CONST<Integer>((Integer) object);
    }
}
