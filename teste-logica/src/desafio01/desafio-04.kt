fun main() {
    // Leitura do número inteiro
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    // Cálculo do antecessor e sucessor
    val antecessor = numero - 1
    val sucessor = numero + 1

    // Impressão do antecessor e sucessor
    println("O antecessor de $numero é $antecessor")
    println("O sucessor de $numero é $sucessor")
}