package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeSTRING extends Stree
{
    public StreeSTRING(String object)
    {
	    super(EnumTag.STRING, null, null, object);
    }
    
    public Tree build()
    {
        return new CONST<String>((String) object);
    }
}
