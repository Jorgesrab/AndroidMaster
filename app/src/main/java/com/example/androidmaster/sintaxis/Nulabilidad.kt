package com.example.androidmaster.sintaxis

fun main() {
    var name : String? = null

    println(name!![0])

    // !! --> Esto indica que siempre va a existir un valor.


    // name? si no es nulo posición ---< ?: Si es nulo, "No hay valor".
    println(name?.get(0) ?: "No hay valor")
}