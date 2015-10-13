package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeCALL extends Stree
{
    public StreeCALL(Object object)
    {
        super(EnumTag.CALL, null, null, object);
    }

    public Tree build() 
    {
        return new CALL((String) object, null);
    }      
}
