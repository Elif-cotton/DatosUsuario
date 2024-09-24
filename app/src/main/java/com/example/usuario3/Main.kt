package com.example.usuario3

fun main() {
    // Crear usuarios por separado
    val usuario1 = Usuario("Ana Luisa Cardenas", 60, "Abogada", null)
    val usuario2 = Usuario("Pedro Montes", 35, "Ingeniero", usuario1)
    val usuario3 = Usuario("Carlos Perez", 28, null, null)

    // Mostrar datos de los usuarios
    usuario2.mostrarDatos()
    usuario3.mostrarDatos()
    usuario1.mostrarDatos()
}