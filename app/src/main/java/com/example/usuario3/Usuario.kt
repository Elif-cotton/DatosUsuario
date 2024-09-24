package com.example.usuario3

class Usuario(val nombre: String, val edad: Int, val trabajo: String?, val referencia: Usuario?) {

    // Función de clase para mostrar los datos
    fun mostrarDatos() {
        val trabajoTexto = trabajo ?: "Sin trabajo"
        val referenciaTexto = if (referencia != null) {
            "Fue citado por: ${referencia.nombre} de ${referencia.edad} años"
        } else {
            "No tiene referencia"
        }

        // Imprimir cada dato en una línea diferente
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Trabajo: $trabajoTexto")
        println(referenciaTexto)
        println() // Salto de línea adicional entre usuarios
    }
}