fun main() {
    // Leitura do valor
    print("Digite um valor: ")
    val valor = readln().toDouble()

    // Cálculo do reajuste de 5%
    val valorReajustado = valor * 1.05

    // Impressão do valor reajustado
    println("O valor com reajuste de 5% é: %.2f".format(valorReajustado))
}
