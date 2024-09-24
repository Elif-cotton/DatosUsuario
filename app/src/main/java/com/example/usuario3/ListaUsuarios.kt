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

    // Función para filtrar usuarios por edad mayor a un número dado
    fun filtrarPorEdad(edadMinima: Int): List<Usuario> {
        return usuarios.filter { it.edad > edadMinima }
    }

    // Función para mostrar una lista filtrada de usuarios (nombre y edad)
    fun mostrarListaFiltrada(usuariosFiltrados: List<Usuario>) {
        for (usuario in usuariosFiltrados) {
            println("${usuario.nombre} - ${usuario.edad} años")
        }
    }
}