fun main() {
    println("Hola Leonel, estoy aprendiendo Kotlin")
}fun main() {

    val usuarioCorrecto = "Leonel"
    val contraseñaCorrecta = "1234"

    println("Ingrese su usuario:")
    val usuarioIngresado = readLine()

    println("Ingrese su contraseña:")
    val contraseñaIngresada = readLine()

    if (usuarioIngresado == usuarioCorrecto && contraseñaIngresada == contraseñaCorrecta) {
        println("Acceso concedido")
    } else {
        println("Usuario o contraseña incorrectos")
    }
}