package com.example.androidmaster.sintaxis

class condicionales {


}

fun  pruebaIf() {
    val age = 20

    if (age >= 18) {
        println("You are an adult.")
    }
}

fun pruebElseIf() {
    val temperature = 25

    if (temperature > 30) {
        println("It's hot!")
    } else {
        println("It's not too hot.")
    }
}


fun elseIfCondicional() {
    val score = 75

    if (score >= 90) {
        println("Excellent!")
    } else if (score >= 80) {
        println("Good job!")
    } else if (score >= 70) {
        println("Fair.")
    } else {
        println("Needs improvement.")
    }
}

fun whenStatement() {
    val dayOfWeek = 3

    when (dayOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")
    }
}

fun whenWhitRange() {
    val age = 25

    when {
        age < 18 -> println("You are a minor.")
        age in 18..64 -> println("You are an adult.")
        else -> println("You are a senior citizen.")
    }
}

fun anidados() {
    val isLoggedIn = true
    val hasPermission = false

    if (isLoggedIn) {
        if (hasPermission) {
            println("Access granted.")
        } else {
            println("You need permission to access this.")
        }
    } else {
        println("Please log in.")
    }
}

fun pruebaWhenAny(value: Any){

    when(value){
        is Int -> println("Soy un entero ")
        is Double -> println("Soy un double")

    }

}


fun whenReutn():String {
    val age = 25

    return when {
        age < 18 -> "You are a minor."
        age in 18..64 ->"You are an adult."
        else -> "You are a senior citizen."
    }
}
