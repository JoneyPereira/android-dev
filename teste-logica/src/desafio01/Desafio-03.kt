fun main() {
    // Leitura dos valores de A e B
    print("Digite o valor de A: ")
    val A = readln().toInt()

    print("Digite o valor de B: ")
    val B = readln().toInt()

    // Declaração da variável C
    val C: Int

    // Verificação se A e B são iguais
    if (A == B) {
        // Se forem iguais, soma os valores
        C = A + B
    } else {
        // Se forem diferentes, multiplica os valores
        C = A * B
    }

    // Impressão do resultado
    println("O resultado é: $C")
}
