package com.example.androidmaster

fun main() {
    val soloLectura: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    // No apunta a direcciones de memoria, llama al toString().
    println(soloLectura)

    // Saca el último de la lista o el primero.
    println(soloLectura.last())
    println(soloLectura.first())

    // Busca aquellos elementos de la lista que tenga la letra "a" en cualquier parte de la palabra.
    val ejemplo = soloLectura.filter { it.contains("a") }
    println(ejemplo)

    // Lambda. Recorre la lista y lo saca con comas.
    soloLectura.forEach { diaSemana -> print("$diaSemana, ")}
    println()

    listaMutable()
}
fun listaMutable() {
    // Es una lista mutable.
    val diasSemana: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    diasSemana.add(0, "Pepe")
    println("LISTA MUTABLE")
    println(diasSemana)

    if (diasSemana.isNotEmpty()) {
        println("La lista no está vacía.")
        diasSemana.forEach { println(it) }
    } else if (diasSemana.isEmpty()) {
        println("La lista está vacía")
    }
}