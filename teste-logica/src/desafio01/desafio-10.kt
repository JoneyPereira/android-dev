fun main() {
    // Leitura das três notas
    print("Digite a primeira nota: ")
    val nota1 = readln().toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readln().toDouble()

    print("Digite a terceira nota: ")
    val nota3 = readln().toDouble()

    // Cálculo da média das notas
    val media = (nota1 + nota2 + nota3) / 3

    // Impressão da média
    println("A média das notas é: %.2f".format(media))
}
