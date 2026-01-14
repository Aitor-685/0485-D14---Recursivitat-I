fun main() {
    println("Introdueix un nombre per comptar-ne els dígits:")
    val n = readln().toLongOrNull() ?: 0L

    val digits = comptaDigitsRecursiu(n)
    println("El nombre $n té $digits dígit(s)")
}

fun comptaDigitsRecursiu(n: Long): Int {
    // Casos base
    if (n == 0L) return 1
    if (n > -10 && n < 10) return 1  // -9 .. 9 → 1 dígit

    // Cas recursiu
    val valorAbsolut = if (n < 0) -n else n
    return 1 + comptaDigitsRecursiu(valorAbsolut / 10)
}
