package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeBOOLEAN extends Stree
{
    public StreeBOOLEAN(Object object)
    {
	    super(EnumTag.BOOLEAN, null, null, object);
    }
    
    public Tree build()
    {
        return new CONST<Boolean>((Boolean) object);
    }
}
