package sh.toxic.camel;

import java.util.ArrayList;
import java_cup.runtime.*;
%%

%class Lexer
%line
%column 
%cup

%{
    public String errlex="";
    public ArrayList<Token> ts = new ArrayList<Token>();
    public Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }
%}

a = [a-zA-Z]
n = [0-9]
espacio = [\n\t\r ]

num = {n}+ ("."{n})?
id = {a} ({a}|{n}|"_")*
list = {id} (","{id})*
op = "+" | "-" | "*" |"/"
or = "<" |"<="| ">="|"=="|"!="|">"
ol = "|"|"&"
asig = "="
pc=";"
cm=","
Tipo = "Tipo"|"tipo"|"TIPO"
Mientras = "Mientras"|"mientras"|"MIENTRAS"
FinMientras = "FinMientras"|"finmientras"|"FINMIENTRAS"|"Fin Mientras"|"fin mientras"
hacer = "hacer"|"HACER"|"Hacer"

%%

{Mientras} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.mientras);}
{hacer} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.hacer);}
{FinMientras} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.finmientras);}
"("  {ts.add(new Token("P. Izquierdo ", yytext()));return symbol(sym.pi);}
")" {ts.add(new Token("P. Derecho ", yytext()));return symbol(sym.pd);}
{cm} {ts.add(new Token("coma", yytext()));return symbol(sym.cm);}
{op} {ts.add(new Token("operador aritmético ", yytext()));return symbol(sym.op);}
{ol} {ts.add(new Token("operador logico ", yytext()));return symbol(sym.ol);}
{num} {ts.add(new Token("Numero ", yytext()));return symbol(sym.num);}
{id} {ts.add(new Token("Identificador ", yytext()));return symbol(sym.id);}
{Tipo} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.tipo);}
{list} {ts.add(new Token("Lista de variables ", yytext())); return symbol(sym.list);}
{or} {ts.add(new Token("Op. relacional ", yytext()));return symbol(sym.or);}
{pc} {ts.add(new Token("punto y coma ", yytext()));return symbol(sym.pc);}
{asig} {ts.add(new Token("Asignación ", yytext()));return symbol(sym.asig);}
{espacio} {}
. {errlex+="\nError lexico: " + yytext() + " caracter no valido en pos: " + (yyline+1) + "," + (yycolumn+1);}
