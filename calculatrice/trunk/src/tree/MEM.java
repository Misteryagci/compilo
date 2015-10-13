package tree;

import temp.Temp;
import temp.Label;


public class MEM extends Exp
{
    public Exp exp;
    
    
    public MEM(Exp e)
    {
        super(); exp=e;
    }

    public Object generate()
    {
        return null;
    }
}

