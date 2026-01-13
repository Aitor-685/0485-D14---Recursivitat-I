fun main() {
    println("Introdueix un nombre per invertir-lo:")
    val n = readln().toLongOrNull() ?: 0L

    val invertit = invertirNombre(n)
    println("Nombre original : $n")
    println("Nombre invertit : $invertit")
}

fun invertirNombre(n: Long): Long {
    var numero = if (n < 0) -n else n   // tractem el valor absolut
    var resultat: Long = 0

    while (numero > 0) {
        val digit = numero % 10         // agafem l'últim dígit
        resultat = resultat * 10 + digit  // afegim el dígit al davant
        numero /= 10                    // eliminem l'últim dígit
    }

    // Si l'original era negatiu, posem el signe
    return if (n < 0) -resultat else resultat
}