package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeFUNCTION extends Stree
{
    public StreeFUNCTION(Stree left, String name)
    {
	    super(EnumTag.FUNC, left, null, name);
    }

    public Tree build() 
    {
        return new FUNC((Stm) left.build(), (String) object);
    }      
}
