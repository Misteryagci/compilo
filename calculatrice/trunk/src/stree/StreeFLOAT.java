package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeFLOAT extends Stree
{
    public StreeFLOAT(Object object)
    {
	    super(EnumTag.FLOAT, null, null, object);
    }

    public Tree build()
    {
        return new CONST<Float>((Float) object);
    }
}
