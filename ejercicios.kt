package org.example

fun main() {
    fun ejercicios(punto: Int) {
        when {
            punto == 1 -> {
                val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                println("entrada de ejercicio#$punto =" + numeros)
                println("respuesta ejercicio#$punto =" + numeros.filter { it % 2 == 0 })
            }

            punto == 2 -> {
                val nombres = listOf("Juan", "María", "Ana", "Pedro")
                println("entrada de ejercicio#$punto =" + nombres)
                println("respuesta ejercicio#$punto =" + nombres.map { it.uppercase() })
            }

            punto == 3 -> {
                val numeros = listOf(1, 2, 3, 4, 5)
                println("entrada de ejercicio#$punto =" + numeros)
                println("respuesta ejercicio#$punto =" + numeros.reduce { acc, it -> acc + it })
            }

            punto == 4 -> {
                val nombres = listOf(
                    "Ana", "María", "Alberto", "Pedro",
                    "Andrés"
                )
                println("entrada de ejercicio#$punto =" + nombres)
                println("respuesta ejercicio#$punto =" + nombres.filter { it.startsWith("A") })
            }

            punto == 5 -> {
                val numeros = listOf(10, 20, 30, 40, 50)
                println("entrada de ejercicio#$punto =" + numeros)
                println("respuesta ejercicio#$punto =" + numeros.take(3))
            }


//            revisar
            punto == 6 -> {
                val claves = listOf("nombre", "edad", "profesión")
                val valores = listOf("Juan", 25, "Ingeniero")
                val mapa = claves.zip(valores).toMap()

                println("entrada de ejercicio#$punto =" + claves)
                println("entrada de ejercicio#$punto =" + valores)
                println("respuesta ejercicio#$punto =" + mapa)
            }

            punto == 7 -> {
                val nombres = listOf("Ana", "María", "Juan", "Pedro", "Alberto")
                println("entrada de ejercicio#$punto =$nombres")
                println("respuesta ejercicio#$punto =" + nombres.sortedBy { it.length })
            }

            punto == 8 -> {
                val nombres = listOf("Ana", "María", "Juan", "Pedro", "Alberto")
                val filtro = nombres.filter { it.length >= 4 }.map { it.lowercase() }
                println("entrada de ejercicio#$punto =$nombres")
                println("respuesta ejercicio#$punto =" + filtro)
            }

            punto == 9 -> {
                data class Persona(
                    val nombre: String,
                    val edad: Int
                );
                val
                        personas = listOf(
                    Persona("Juan", 25), Persona("María", 32),
                    Persona("Ana", 35), Persona("Pedro", 29)
                )
                println("entrada de ejercicio#$punto =$personas")
                println("respuesta ejercicio#$punto =" + personas.filter { it.edad > 30 })
            }

            punto == 10 -> {
                val mapa = mapOf(
                    "nombre" to "Juan", "edad" to 25, "profesión" to "Ingeniero"
                )

                println("entrada de ejercicio#$punto =$mapa")
                println("respuesta ejercicio#$punto =" +mapa.toList())
                val lista = listOf
                println()
            }

            punto == 11 -> {

//                println("entrada de ejercicio#$punto =$nombres")
//                println("respuesta ejercicio#$punto ="
            }
        }

    }

    ejercicios(10)
}
