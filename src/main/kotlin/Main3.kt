fun main() {
    println("Introdueix un nombre per comptar-ne els dígits:")
    val n = readln().toLongOrNull() ?: 0L

    val digits = comptaDigits(n)
    println("El nombre $n té $digits dígit(s)")
}

fun comptaDigits(n: Long): Int {
    // Cas especial: el 0 té 1 dígit
    if (n == 0L) return 1

    // Convertim a positiu per si és negatiu
    var valor = if (n < 0) -n else n
    var comptador = 0

    while (valor > 0) {
        valor /= 10          // eliminem l'últim dígit
        comptador++          // comptem un dígit més
    }

    return comptador
}
