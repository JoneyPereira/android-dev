fun main() {
    // Leitura dos três valores inteiros
    print("Digite o primeiro valor inteiro: ")
    val valor1 = readln().toInt()

    print("Digite o segundo valor inteiro: ")
    val valor2 = readln().toInt()

    print("Digite o terceiro valor inteiro: ")
    val valor3 = readln().toInt()

    // Encontrando os valores em ordem decrescente
    val valores = listOf(valor1, valor2, valor3).sortedDescending()

    // Impressão dos valores em ordem decrescente
    println("Os valores em ordem decrescente são: ${valores.joinToString(", ")}")
}
