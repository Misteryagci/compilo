package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;


public class StreeDIFF extends Stree
{
    public StreeDIFF(Stree left, Stree right)
    {
	    super(EnumTag.DIFF, left, right, null);
    }

    public Tree build()
    {
        return null;
    }
}
