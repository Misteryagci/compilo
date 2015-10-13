package stree;

public enum EnumTag
{     
    IF ("IF"), 
    THENELSE ("THENELSE"), 
    WHILE ("WHILE"), 
    AFF ("="), 
    NOT ("!"), 
    AND ("&&"), 
    OR ("||"), 
    LT ("<"), 
    GT (">"), 
    LE ("<="), 
    GE (">="), 
    EQ ("=="), 
    DIFF ("!=") , 
    PLUS ("+"), 
    MINUS ("-"), 
    MINUS_U ("-"), 
    MULT ("*"), 
    DIV ("/"), 
    MOD ("%"), 
    SUCC("SUCC"),
    PRODUCT("PRODUCT"),
    IDENTIFIER ("IDENTIFIER"),
    CALL ("CALL"),
    TABLE ("TABLE"),
    CHARACTER ("CHARACTER"), 
    INTEGER ("INTEGER"), 
    FLOAT ("FLOAT"), 
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    TYPE("TYPE"),
    FUNC("FUNC"),
    RETURN("RETURN");

    private final String tag;

    EnumTag(String s)
    {
        tag = s;
    }

    public String toString()
    {
        return tag;
    }
}

