fun main() {
    println("Introdueix un nombre per invertir-lo:")
    val n = readln().toLongOrNull() ?: 0L

    val invertit = invertirNombreRecursiu(n)
    println("Nombre original : $n")
    println("Nombre invertit : $invertit")
}

fun invertirNombreRecursiu(n: Long, acumulat: Long = 0): Long {
    // Cas base: quan ja hem processat tots els dígits
    if (n == 0L) {
        return acumulat
    }

    // Agafem l'últim dígit
    val ultimDigit = n % 10

    // Construïm el nou acumulat posant aquest dígit al davant
    val nouAcumulat = acumulat * 10 + ultimDigit

    // Crida recursiva amb la resta del nombre (sense l'últim dígit)
    return invertirNombreRecursiu(n / 10, nouAcumulat)
}