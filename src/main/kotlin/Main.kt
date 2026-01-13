fun main() {
    val n = readln().toIntOrNull() ?: 0

    if (n < 0) {
        println("Error: el factorial no està definit per a nombres negatius.")
        return
    }

    println("\nCàlcul detallat del factorial de $n:")
    val resultat = factorial(n)
    println("\nResultat final: $n! = $resultat")
}

fun factorial(n: Int): Int{
    if (n == 0 || n == 1) {
        println("-> $n! = 1 (caso base)")
        return 1
    }
    val valorAnterior = factorial(n - 1)
    val resultatParcial = n * valorAnterior

    println("-> $n! = $n × $valorAnterior = $resultatParcial")

    return resultatParcial
}