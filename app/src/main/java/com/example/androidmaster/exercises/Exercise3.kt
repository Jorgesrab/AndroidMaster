package com.example.androidmaster.exercises

fun main() {
    var name: String = "Diego"
    var name1: String = "Jorge"
    var name2: String = "Pablo"
    var name3: String = "Pedro"
    var name4: String = "Lucas"
    var name5: String = "Antonio"

    val diasSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(diasSemana.size)

    if (diasSemana.size >= 8) {
        println(diasSemana[7])
    } else {
        println("No hay más valores en el array.")
    }

    for (position in diasSemana.indices) {
        println(diasSemana[position])
    }

    for ((position, value) in diasSemana.withIndex()) {
        println("La posición $position tiene el valor $value.")
    }
}