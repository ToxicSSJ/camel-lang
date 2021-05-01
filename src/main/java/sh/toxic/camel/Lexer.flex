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
str = [\"] + [.*[^\"]] + [\"]
espacio = [\n\t\r ]

num = {n}+ ("."{n})?
id = {a} ({a}|{n}|"_")*
op = "+" | "-" | "*" |"/"
or = "<" |"<="| ">="|"=="|"!="|">"
ol = "|"|"&"
asig = "="
pc = ";"
cm = ","
Tipo = "Tipo"|"tipo"|"TIPO"
Leer = "Leer"|"leer"|"LEER"
Entero = "Entero"|"entero"|"ENTERO"
Escribir = "Escribir"|"escribir"|"ESCRIBIR"
Si = "Si"|"si"|"SI"
Entonces = "Entonces"|"entonces"|"ENTONCES"
SiNo = "SiNo"|"sino"|"SINO"|"siNo"|"Sino"
FinSi = "FinSi"|"finsi"|"FINSI"|"finSi"|"Finsi"
Para = "Para"|"para"|"PARA"
Hasta = "Hasta"|"hasta"|"HASTA"
FinPara = "FinPara"|"finpara"|"FINPARA"|"finPara"|"Finpara"
Paso = "Paso"|"paso"|"PASO"
Programa = "Programa"|"programa"|"PROGRAMA"
FinPrograma = "FinPrograma"|"finprograma"|"FINPROGRAMA"|"finPrograma"|"Finprograma"
Mientras = "Mientras"|"mientras"|"MIENTRAS"
FinMientras = "FinMientras"|"finmientras"|"FINMIENTRAS"|"finMientras"|"Finmientras"
Hacer = "hacer"|"HACER"|"Hacer"
Paso = "paso"|"PASO"|"Paso"

%%

{Programa} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.programa);}
{Leer} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.leer);}
{Entero} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.entero);}
{Para} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.para);}
{Hasta} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.hasta);}
{Paso} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.paso);}
{FinPara} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.finpara);}
{Si} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.si);}
{Entonces} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.entonces);}
{SiNo} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.sino);}
{FinSi} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.finsi);}
{Mientras} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.mientras);}
{Hacer} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.hacer);}
{Tipo} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.tipo);}
{Escribir} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.escribir);}
{FinMientras} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.finmientras);}
{FinPrograma} {ts.add(new Token("Palabra reservada ", yytext()));return symbol(sym.finprograma);}
"("  {ts.add(new Token("P. Izquierdo ", yytext()));return symbol(sym.pi);}
")" {ts.add(new Token("P. Derecho ", yytext()));return symbol(sym.pd);}
{op} {ts.add(new Token("operador aritmético ", yytext()));return symbol(sym.op);}
{ol} {ts.add(new Token("operador logico ", yytext()));return symbol(sym.ol);}
{num} {ts.add(new Token("Numero ", yytext()));return symbol(sym.num);}
{id} {ts.add(new Token("Identificador ", yytext()));return symbol(sym.id);}
{or} {ts.add(new Token("Op. relacional ", yytext()));return symbol(sym.or);}
{pc} {ts.add(new Token("punto y coma ", yytext()));return symbol(sym.pc);}
{cm} {ts.add(new Token("coma ", yytext()));return symbol(sym.cm);}
{asig} {ts.add(new Token("Asignación ", yytext()));return symbol(sym.asig);}
{espacio} {}
{str} {ts.add(new Token("Texto ", yytext()));return symbol(sym.str);}
. {errlex+="\nError lexico: " + yytext() + " caracter no valido en pos: " + (yyline+1) + "," + (yycolumn+1);}
