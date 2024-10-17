package com.example.androidmaster

/**
 *VARIABLES
 */
/**
 * Val = constante (No se puede modificar)| Var = variable (Se puede modificar)
 */



fun main() {
    /**
     *Variables numericas
     */

    //Int
    val entero: Int = 1232;
    //Float
    var decimal:Float = 123.342f;
    //Double
    val doble:Double = 123.12;

    /**
     *Variables Alfanumericas
     */


    //Char
    var charExample:Char = 'a';
    //String
    val stringExample:String = "Hola buenas";
    val stringExample2:String = " me llamo Jorge";
    val stringExample3:String = "$stringExample$stringExample2 y tengo $decimal años";
    println(stringExample3)

    /**
     *Variables booleanas
     */

    //Booleanas
    val boolExample:Boolean = true;


    //Operaciones
    println("Sumar")
    println(entero+decimal) //+,-,*,/,%

    var exmapleSuma: Int = entero + decimal.toInt()




}