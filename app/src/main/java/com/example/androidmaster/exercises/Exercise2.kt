package com.example.androidmaster.exercises

fun main() {
    val pequeno = 5
    val adulto = 27
    val senior = 87

    val esLunes = true

    println("El precio de la entrada una persona de edad $pequeno es: \$${ticketPriceModificado(pequeno, esLunes)}.")
    println("El precio de la entrada una persona de edad $adulto es: \$${ticketPriceModificado(adulto, esLunes)}.")
    println("El precio de la entrada una persona de edad $senior es: \$${ticketPriceModificado(senior, esLunes)}.")

}

fun ticketPrice(edad : Int, esLunes : Boolean) : Int {
     return when {
        edad <= 12 -> 15
        edad in 13..60 -> {
            if (esLunes) {
              5
            } else {
                30
            }
        }
        edad > 61 -> 20
         else -> {-1}
     }
}

fun ticketPriceModificado(edad : Int, esLunes: Boolean) : Int {
    return when (edad) {
        in 0..12 -> 15
        in 13..60 -> if (esLunes) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}