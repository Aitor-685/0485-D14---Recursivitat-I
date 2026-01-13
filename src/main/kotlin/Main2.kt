fun main() {
    println("Càlcul del DOBLE FACTORIAL (n!!)")
    println("Introdueix un nombre natural >= 0:")

    val entrada = readln().trim()
    val n = entrada.toIntOrNull()

    if (n == null || n < 0) {
        println("Error: cal introduir un nombre natural (0 o positiu)")
        return
    }

    println("\nCàlcul pas a pas de $n!!")
    val resultat = dobleFactorial(n)

    println("\nResultat final:")
    println("$n!! = $resultat")
}

fun dobleFactorial(n: Int): Long {
    // Casos base
    if (n == 0 || n == 1) {
        println("   → ${n}!! = 1   (cas base)")
        return 1L
    }

    // Determinam el següent nombre de la mateixa paritat
    val seguent = if (n % 2 == 0) n - 2 else n - 2

    val valorAnterior = dobleFactorial(seguent)
    val resultatParcial = n.toLong() * valorAnterior

    println("   → ${n}!! = $n × ${seguent}!! = $n × $valorAnterior = $resultatParcial")

    return resultatParcial
}