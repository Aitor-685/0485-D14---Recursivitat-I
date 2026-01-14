fun main() {
    println("Torres de Hanoi")
    println("Introdueix el nombre de discos (n):")

    val n = readln().toIntOrNull() ?: 0

    if (n <= 0) {
        println("El nombre de discos ha de ser positiu.")
        return
    }

    println("\nMoviments necessaris per traslladar $n discos de A a C:")
    println("-----------------------------------------------------")

    hanoi(n, 'A', 'C', 'B')

    println("\nTotal de moviments: ${Math.pow(2.0, n.toDouble()).toLong()}")
}

/**
 * Funció recursiva que resol les Torres de Hanoi
 *
 * @param n       nombre de discos a moure
 * @param origen  pal d'origen (on estan inicialment els discos)
 * @param desti   pal destí (on volem deixar tots els discos)
 * @param auxiliar pal auxiliar (l'altre pal disponible)
 */
fun hanoi(n: Int, origen: Char, desti: Char, auxiliar: Char) {
    // Cas base: si només hi ha 1 disc, el movem directament
    if (n == 1) {
        println("$origen => $desti")
        return
    }

    // Pas 1: moure n-1 discos de l'origen a l'auxiliar (utilitzant destí com auxiliar)
    hanoi(n - 1, origen, auxiliar, desti)

    // Pas 2: moure el disc més gran (l'últim) de l'origen al destí
    println("$origen => $desti")

    // Pas 3: moure els n-1 discos que estan a l'auxiliar cap al destí
    // (utilitzant l'origen com a auxiliar)
    hanoi(n - 1, auxiliar, desti, origen)
}