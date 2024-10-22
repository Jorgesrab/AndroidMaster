package com.example.androidmaster.exercises

fun main() {
    val morningNotification = 51;
    val eveningNotifcaion = 152;

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotifcaion)
}

fun printNotificationSummary(numeroMensajes: Int) {
    if (numeroMensajes > 99) {
        println("Tu movil va a explotar con tanto mensaje! Tienes 99 notificaciones.")
    } else {
        // Recuerda que se puede usar $ para poner el valor directamente en un string.
        println("Tienes $numeroMensajes notificaciones.")
    }
}