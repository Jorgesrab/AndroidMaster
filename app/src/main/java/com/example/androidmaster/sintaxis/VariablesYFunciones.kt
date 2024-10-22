package com.example.androidmaster.sintaxis

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
    var decimal: Float = 123.342f;
    //Double
    val doble: Double = 123.12;

    /**
     *Variables Alfanumericas
     */


    //Char
    var charExample: Char = 'a';
    //String
    val stringExample: String = "Hola buenas";
    val stringExample2: String = " me llamo Jorge";
    val stringExample3: String = "$stringExample$stringExample2 y tengo $decimal años";
    val nombre: String = "Jorge";
    println(stringExample3)
    showMyName(nombre)

    /**
     *Variables booleanas
     */

    //Booleanas
    val boolExample: Boolean = true;


    //Operaciones
    println("Sumar")
    println(entero + decimal) //+,-,*,/,%

    var exmapleSuma: Int = entero + decimal.toInt()

    //llamada a la funcion
    pruebaDeFunciones()

    showMyAge(17)

}

//Funcion simple
fun pruebaDeFunciones() {
    println("Prueba de funciones")

}

fun showMyAge(currenage: Int) {
    println("Tengo $currenage años")

}

fun showMyName(nombre: String) {
    println("Mi nombre es $nombre")
}

fun resta(numero1: Int, numero2: Int): Int {
    return numero1 - numero2
}

fun suma(numero1: Int, numero2: Int) = numero1 + numero2

