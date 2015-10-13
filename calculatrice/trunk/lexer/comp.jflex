import java_cup.runtime.*;

%%
%class CompLexer
%line
%column
%cupsym CompSymbol
%cup

%{
private Symbol symbol (int type) {
    return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
    return new Symbol (type, yyline, yycolumn, value);
}

static protected void trace(String str){
    // Comment / Uncomment this
    //System.err.println("*** "+str);   
}

private StringBuffer string = new StringBuffer();

%}

Identifier	= [a-zA-Z][a-zA-Z0-9_]*
LineTerminator	= \r|\n|\r\n
WhiteSpace	= {LineTerminator} | [ \t\f]
	// Integers
IntegerLiteral = 0 | [1-9][0-9]*

	// Floats
FloatLiteral = (({IntegerLiteral} "." [0-9]*) | ("." [0-9]+)) ([eE][-+]?{IntegerLiteral})?

	// Strings
%state STRING_LITERAL

	// Characters
Character = [^\r\n]
CharacterLiteral = "'" {Character} "'"

	// Comments
CommentOneLine       = "//" {Character}* {LineTerminator}
CommentMultipleLines = "/*" [^*] ~"*/" | "/*" "*"+ "/"
Comment = {CommentOneLine} | {CommentMultipleLines}

	//Boolean
BooleanLiteral = "TRUE" | "FALSE" | "true" | "false"
    
%%

    <YYINITIAL> {
/* -------------------------------------------------
	Separateurs Operateurs
   ------------------------------------------------- */

"("	{  return symbol(CompSymbol.LPAR); }
")"	{  return symbol(CompSymbol.RPAR); }
"["	{  return symbol(CompSymbol.LBRACKET); }
"]"	{  return symbol(CompSymbol.RBRACKET); }
"<"	{  return symbol(CompSymbol.LT); }
">"	{  return symbol(CompSymbol.GT); }
"<="	{  return symbol(CompSymbol.LE); }
">="	{  return symbol(CompSymbol.GE); }
"!="	{  return symbol(CompSymbol.DIFF); }
"="	{  return symbol(CompSymbol.EQ); }
"=="	{  return symbol(CompSymbol.EQEQ); }
"+"	{  return symbol(CompSymbol.PLUS); }
"-"	{  return symbol(CompSymbol.MINUS); }
"/"	{  return symbol(CompSymbol.DIV); }
"%"	{  return symbol(CompSymbol.MOD); }
";"	{  return symbol(CompSymbol.SEMIC); }
"," {  return symbol(CompSymbol.COMA); }


/*********/
/** ADD **/
/*********/

":"     {  return symbol(CompSymbol.COLONS);}
"++"    {  return symbol(CompSymbol.INCREM); }
"--"    {  return symbol(CompSymbol.DECREM); }
"{"     {  return symbol(CompSymbol.LBRACE); }
"}"     {  return symbol(CompSymbol.RBRACE); }

/* LOGIC */
"&&"    {  return symbol(CompSymbol.AND); }
"||"    {  return symbol(CompSymbol.OR); }
"!"     {  return symbol(CompSymbol.NO_LOGIC); }

/* BIT MANIP */
"|"     {  return symbol(CompSymbol.PIPE); }
"~"     {  return symbol(CompSymbol.TILD); }
"^"     {  return symbol(CompSymbol.CHAP); }
"<<"    {  return symbol(CompSymbol.LEFT_DECAL); }
">>"    {  return symbol(CompSymbol.RIGHT_DECAL); }

/* MEMORY ACCESS */
"."     {  return symbol(CompSymbol.POINT); }
"->"    {  return symbol(CompSymbol.ARROW); }



/* SEVERAL USE */
"&"     {  return symbol(CompSymbol.AND_COM); }
"*"	{  return symbol(CompSymbol.MULT); }



/* -----------------------------------------
              Keywords
 ---------------------------------------- */
"if"	{  return symbol(CompSymbol.IF); }
"else"	{  return symbol(CompSymbol.ELSE); }
"while"	{  return symbol(CompSymbol.WHILE); }


/*********/
/** ADD **/
/*********/

"foreach" {  return symbol(CompSymbol.FOR_EACH); }
"in"      {  return symbol(CompSymbol.IN); }
"repeat"  {  return symbol(CompSymbol.REPEAT); }
"let"     {  return symbol(CompSymbol.LET); }
"function"  {  return symbol(CompSymbol.FUNCTION); } 
"return"  {  return symbol(CompSymbol.RETURN); } 

/* SIMPLE TYPES */
"integer"             {  return symbol(CompSymbol.INT); }
"character"           {  return symbol(CompSymbol.CHAR); }
"float"               {  return symbol(CompSymbol.FLOAT); }
"boolean"             {  return symbol(CompSymbol.BOOL); }
"string"              {  return symbol(CompSymbol.STRING); }
"`"                   {  return symbol(CompSymbol.VAR_TYPE); }


/* COMPLEX TYPES */
"list of "   {  return symbol(CompSymbol.LIST_OF_TYPE); } 
// "^"          {  return symbol(CompSymbol.POINTER_TYPE); } 
"structure"  {  return symbol(CompSymbol.STRUCT); } 
"class"      {  return symbol(CompSymbol.CLASS); }
"type"       {  return symbol(CompSymbol.TYPE); }

/* CONSTANT */
"null"       {  return symbol(CompSymbol.NULL); } 
/*"true"       {  return symbol(CompSymbol.TRUE); } 
"false"      {  return symbol(CompSymbol.FALSE); }
"TRUE"       {  return symbol(CompSymbol.TRUE); }
"FALSE"      {  return symbol(CompSymbol.FALSE); }*/

/* -------------------------------------------------
	Variables, Entiers
   ------------------------------------------------- */

{Identifier}	{
    return symbol(CompSymbol.IDENTIFIER, yytext()); }
{IntegerLiteral}	{
    return symbol(CompSymbol.INTEGER_LITERAL, new Integer(yytext())); }
{FloatLiteral}	{
    return symbol(CompSymbol.FLOAT_LITERAL, new Float(yytext())); }
{CharacterLiteral}	{
    return symbol(CompSymbol.CHARACTER_LITERAL, yytext()); }
{BooleanLiteral}  {
    return symbol(CompSymbol.BOOLEAN_LITERAL, yytext()); }

// Strings
\" {
    yybegin(STRING_LITERAL);
    string.delete(0, string.length()); }
}

// Strings
<STRING_LITERAL> {
\" { 
    yybegin(YYINITIAL);
    return symbol(CompSymbol.STRING_LITERAL, string.toString()); }
[^\n\r\"\\]+                   { string.append(yytext()); }
\\t                            { string.append('\t'); }
\\n                            { string.append('\n'); }
\\r                            { string.append('\r'); }
\\\"                           { string.append('\"'); }
\\                             { string.append('\\'); }
}

<YYINITIAL> {
/* -------------------------------------------------
	Commentaires - Caracteres non pris en compte
   ------------------------------------------------- */
{WhiteSpace}                   { /* ignore */ }
{Comment}                   { /* ignore */ }
/* -------------------------------------------------
	Autres signes
   ------------------------------------------------- */
.	{ /* ignore */ }

}
