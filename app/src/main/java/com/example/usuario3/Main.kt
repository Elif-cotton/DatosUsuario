package com.example.usuario3

fun main() {
    // Crear la lista de usuarios
    val listaUsuarios = ListaUsuarios()

    // Crear y agregar 5 usuarios
    val usuario1 = Usuario("Walter Black", 60, "Profesor de matemáticas", null)
    val usuario2 = Usuario("Ana Luisa Cardenas", 60, "Abogada", null)
    val usuario3 = Usuario("Pedro Montes", 35, "Ingeniero", usuario2)
    val usuario4 = Usuario("Carlos Perez", 28, null, null)
    val usuario5 = Usuario("Laura Garcia", 22, "Estudiante", usuario3)

    listaUsuarios.agregarUsuario(usuario1)
    listaUsuarios.agregarUsuario(usuario2)
    listaUsuarios.agregarUsuario(usuario3)
    listaUsuarios.agregarUsuario(usuario4)
    listaUsuarios.agregarUsuario(usuario5)

    // Mostrar la lista de usuarios
    println("Lista de usuarios:")
    listaUsuarios.mostrarLista()

    // Eliminar un usuario
    println("\nEliminando a Carlos Perez de la lista...")
    listaUsuarios.eliminarUsuario(usuario4)

    // Mostrar la lista de usuarios después de eliminar
    println("\nLista de usuarios después de eliminar:")
    listaUsuarios.mostrarLista()
}