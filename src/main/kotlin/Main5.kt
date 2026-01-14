fun main() {
    println("Introdueix n per calcular F(n):")
    val n = readln().toIntOrNull() ?: 0

    if (n < 0) {
        println("Error: n ha de ser >= 0")
        return
    }

    val resultat = fibonacciRecursiu(n)
    println("F($n) = $resultat")
}

fun fibonacciRecursiu(n: Int): Long {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fibonacciRecursiu(n - 1) + fibonacciRecursiu(n - 2)
}