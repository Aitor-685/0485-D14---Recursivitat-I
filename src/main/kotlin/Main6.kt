fun main() {
    println("Introdueix un nombre enter per comprovar si és creixent:")
    val entrada = readln().trim()

    val n = entrada.toLongOrNull()
    if (n == null) {
        println("Error: cal introduir un nombre enter vàlid")
        return
    }

    val esCreixent = esNombreCreixent(n)
    println("El nombre $n és creixent? → $esCreixent")
}

fun esNombreCreixent(n: Long): Boolean {
    // Casos base
    if (n >= 0 && n <= 9) {
        return true          // un sol dígit sempre és creixent
    }

    // Agafem els dos últims dígits
    val ultimDigit    = n % 10
    val penultimDigit = (n / 10) % 10

    // Comprovem si l'ordre és correcte (penúltim ≤ últim)
    if (penultimDigit > ultimDigit) {
        return false
    }

    // Crida recursiva amb la resta del nombre (sense l'últim dígit)
    return esNombreCreixent(n / 10)
}