fun main() {
    println("Introdueix un nombre natural per calcular la reducció digital:")
    val entrada = readln().trim()

    val n = entrada.toLongOrNull()
    if (n == null || n < 0) {
        println("Error: cal introduir un nombre natural vàlid (>= 0)")
        return
    }

    val resultat = reduccioDigits(n)
    println("Reducció digital de $n → $resultat")
}

/**
 * Retorna la reducció digital (digital root) d'un nombre
 * mitjançant recursivitat.
 */
fun reduccioDigits(n: Long): Int {
    // Cas base: si ja és un sol dígit (0..9), retornem el valor
    if (n >= 0 && n <= 9) {
        return n.toInt()
    }

    // Sumem els dígits del nombre actual
    var suma = 0L
    var restant = n

    while (restant > 0) {
        suma += restant % 10
        restant /= 10
    }

    // Crida recursiva amb la suma obtinguda
    return reduccioDigits(suma)
}