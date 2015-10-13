package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeCHARACTER extends Stree
{
    public StreeCHARACTER(Object object)
    {
	    super(EnumTag.CHARACTER, null, null, object);
    }
    
    public Tree build()
    {
        return new CONST<Character>((Character) object);
    }
}
