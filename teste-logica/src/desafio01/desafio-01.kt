fun main() {
    // Leitura dos valores de A, B e C
    print("Digite o valor de A: ")
    val A = readLine()!!.toInt()

    print("Digite o valor de B: ")
    val B = readLine()!!.toInt()

    print("Digite o valor de C: ")
    val C = readLine()!!.toInt()

    // Cálculo da soma de A e B
    val soma = A + B

    // Exibição da soma
    println("A soma de A e B é: $soma")

    // Verificação se a soma é menor que C
    if (soma < C) {
        println("A soma é menor que C")
    } else {
        println("A soma não é menor que C")
    }
}
