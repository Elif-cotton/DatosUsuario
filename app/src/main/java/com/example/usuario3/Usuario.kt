package com.example.usuario3

class Usuario(val nombre: String, val edad: Int, private val trabajo: String?, private val referencia: Usuario?) {

    // Función para mostrar los datos de un usuario
    fun mostrarDatos(): String {
        val trabajoTexto = trabajo ?: ""  // Si el trabajo es null, no mostrar nada
        val referenciaTexto = if (referencia != null) {
            " - Recomendado por: ${referencia.nombre} de ${referencia.edad} años"
        } else {
            ""
        }

        // Crear la cadena con los datos y omitir valores null
        return "$nombre - $edad años - $trabajoTexto$referenciaTexto".trimEnd(' ', '-')
    }
}