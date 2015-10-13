import java_cup.runtime.*;

%%
%class CalculetteLexer
%line
%column
%cupsym CalculetteSymbol
%cup
%state comment

%{
private Symbol symbol (int type) {
        return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline, yycolumn, value);
}

%}
LineTerminator = \r|\n|\r\n
id      = [a-zA-Z][a-zA-Z0-9_]*
nb      = 0|[1-9][0-9]*
float =  [0-9][0-9]*[.][0-9][0-9]*

Whitespace = {LineTerminator} | [ \t\f]

%x COMMENTAIRE
%x STRING


%%
/* -------------------------------------------------
	GESTION DES COMMENTAIRES
   ------------------------------------------------- */


"\""  {yybegin(STRING);}
<STRING>"\"" { yybegin(YYINITIAL);return symbol(CalculetteSymbol.STRINGSS);}
<STRING>. { }
"/*"  {yybegin(COMMENTAIRE);}
<COMMENTAIRE>"*/" {yybegin(YYINITIAL);}
<COMMENTAIRE>.|\n { }
"//".*\n {}


/* -------------------------------------------------
	Separateurs Operateurs
   ------------------------------------------------- */


"("	{  return symbol(CalculetteSymbol.LPAR); }
")"	{  return symbol(CalculetteSymbol.RPAR); }
"["	{  return symbol(CalculetteSymbol.LBRACKET); }
"]"	{  return symbol(CalculetteSymbol.RBRACKET); }
"<"	{  return symbol(CalculetteSymbol.LT); }
">"	{  return symbol(CalculetteSymbol.GT); }
"<="	{  return symbol(CalculetteSymbol.LE); }
">="	{  return symbol(CalculetteSymbol.GE); }
"()=" { return symbol(CalculetteSymbol.ENTREPARENT); }
"!="	{  return symbol(CalculetteSymbol.DIFF); }
"="	{  return symbol(CalculetteSymbol.EQ); }
"=="	{  return symbol(CalculetteSymbol.EQEQ); }
"+"	{  return symbol(CalculetteSymbol.PLUS); }
"-"	{  return symbol(CalculetteSymbol.MINUS); }
"/"	{  return symbol(CalculetteSymbol.DIV); }
"%"	{  return symbol(CalculetteSymbol.MOD); }
";"	{  return symbol(CalculetteSymbol.POINTVIRG); }
"," 	{  return symbol(CalculetteSymbol.COMA); }
"'"."'" { return symbol(CalculetteSymbol.CHARAA);}

/*********/
/** ADD **/
/*********/

":"     {  return symbol(CalculetteSymbol.COLONS);}
"++"    {  return symbol(CalculetteSymbol.INCREM); }
"--"    {  return symbol(CalculetteSymbol.DECREM); }
"{"     {  return symbol(CalculetteSymbol.LBRACE); }
"}"     {  return symbol(CalculetteSymbol.RBRACE); }

/* LOGIQUE */
"&&"    {  return symbol(CalculetteSymbol.AND); }
"||"    {  return symbol(CalculetteSymbol.OR); }
"!"     {  return symbol(CalculetteSymbol.NO_LOGIC); }

/* non gere par le cup :/ */
"|"     {  return symbol(CalculetteSymbol.PIPE); }
"~"     {  return symbol(CalculetteSymbol.TILD); }
"^"     {  return symbol(CalculetteSymbol.CHAP); }
"<<"    {  return symbol(CalculetteSymbol.LEFT_DECAL); }
">>"    {  return symbol(CalculetteSymbol.RIGHT_DECAL); }

/* ACCES A LA MEMOIRE */
"."     {  return symbol(CalculetteSymbol.POINT); }
"->"    {  return symbol(CalculetteSymbol.ARROW); }



/* & et *  */
"&"     {  return symbol(CalculetteSymbol.AND_COM); }
"*"	{  return symbol(CalculetteSymbol.MULT); }



/* -----------------------------------------
              Keywords
 ---------------------------------------- */
"if"	{  return symbol(CalculetteSymbol.IF); }
"then"   { return symbol(CalculetteSymbol.THEN); }
"else"	{  return symbol(CalculetteSymbol.ELSE); }
"while"	{  return symbol(CalculetteSymbol.WHILE); }


/*********/
/** fucntion,loop, **/
/*********/

"foreach" {  return symbol(CalculetteSymbol.FOR_EACH); }
"in"      {  return symbol(CalculetteSymbol.IN); }
"repeat"  {  return symbol(CalculetteSymbol.REPEAT); }
"let"     {  return symbol(CalculetteSymbol.LET); }
"main" { return symbol(CalculetteSymbol.MAIN); }
"function"  {  return symbol(CalculetteSymbol.FUNCTION); } 
"procedure" { return symbol(CalculetteSymbol.PROCEDURE); }
"return"  {  return symbol(CalculetteSymbol.RETURN); } 
"stop"   { return symbol(CalculetteSymbol.STOP); }
"break"   {return symbol(CalculetteSymbol.BREAK); }

/* TYPES SIMPLES */
"integer"             {  return symbol(CalculetteSymbol.INT); }
"char"           {  return symbol(CalculetteSymbol.CHAR); }
"boolean"             {  return symbol(CalculetteSymbol.BOOL); }
"string"              {  return symbol(CalculetteSymbol.STRING); }
"‘"                   {  return symbol(CalculetteSymbol.VAR_TYPE); }


/* TYPES COMPLEXES */
"list of "   {  return symbol(CalculetteSymbol.LIST_OF_TYPE); } 
// "^"          {  return symbol(CalculetteSymbol.POINTER_TYPE); } 
"structure"  {  return symbol(CalculetteSymbol.STRUCT); } 
"class"      {  return symbol(CalculetteSymbol.CLASS); }
"static"  {return symbol(CalculetteSymbol.STATIC); }
"type"       {  return symbol(CalculetteSymbol.TYPE); }

/* CONSTANT */
"null"       {  return symbol(CalculetteSymbol.NULL); } 
"true"       {  return symbol(CalculetteSymbol.TRUE); } 
"false"      {  return symbol(CalculetteSymbol.FALSE); }
/* -------------------------------------------------
	Variables, Entiers
   ------------------------------------------------- */

{id}     { return symbol(CalculetteSymbol.ID); }
{float}	{  return symbol(CalculetteSymbol.FLOAT); }
{nb}    {return symbol(CalculetteSymbol.NBR);}

/* -------------------------------------------------
	Commentaires - Caracteres non pris en compte
   ------------------------------------------------- */
{Whitespace}    {}

/* -------------------------------------------------
	Autres signes
   ------------------------------------------------- */
.	{ /* ignore */ }


