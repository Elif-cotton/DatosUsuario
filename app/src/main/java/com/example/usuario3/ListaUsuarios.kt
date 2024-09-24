package com.example.usuario3

class ListaUsuarios {
    private val usuarios = mutableListOf<Usuario>()

    // Función para agregar un usuario
    fun agregarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
    }

    // Función para eliminar un usuario
    fun eliminarUsuario(usuario: Usuario) {
        usuarios.remove(usuario)
    }

    // Función para mostrar todos los usuarios en la lista
    fun mostrarLista() {
        for (usuario in usuarios) {
            println(usuario.mostrarDatos())
        }
    }
}