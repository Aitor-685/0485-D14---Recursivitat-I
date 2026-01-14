fun main() {
    println("Introdueix un nombre natural per comprovar si és primer perfecte:")
    val n = readln().toLongOrNull() ?: 0L

    if (n <= 1) {
        println("Error: cal un nombre natural > 1")
        return
    }

    val esPrimerPerfecte = esPrimerPerfecte(n)
    println("El nombre $n és primer perfecte? → $esPrimerPerfecte")
}

/**
 * Comprova recursivament si un nombre és primer perfecte:
 *   - El nombre actual ha de ser primer
 *   - La suma dels seus dígits ha de ser primer (o 2,3,5,7 si és d'un sol dígit)
 */
fun esPrimerPerfecte(n: Long): Boolean {
    // Cas base: si és un sol dígit
    if (n >= 0 && n <= 9) {
        return n in listOf(2L, 3L, 5L, 7L)  // només aquests són primers d'un sol dígit
    }

    // Primer pas: el nombre actual ha de ser primer
    if (!esPrimer(n)) {
        return false
    }

    // Calculem la suma dels dígits
    var suma = 0L
    var restant = n
    while (restant > 0) {
        suma += restant % 10
        restant /= 10
    }

    // Crida recursiva amb la suma dels dígits
    return esPrimerPerfecte(suma)
}

/**
 * Comprova si un nombre és primer (versió simple però suficient per aquest exercici)
 */
fun esPrimer(n: Long): Boolean {
    if (n <= 1L) return false
    if (n <= 3L) return true
    if (n % 2L == 0L || n % 3L == 0L) return false

    var i = 5L
    while (i <= n / i) {
        if (n % i == 0L || n % (i + 2L) == 0L) return false
        i += 6L
    }
    return true
}