fun main() {
    // Valor do salário mínimo (fixo)
    val salarioMinimo = 1293.20

    // Leitura do valor do salário do usuário
    print("Digite o valor do seu salário: ")
    val salarioUsuario = readln().toDouble()

    // Cálculo de quantos salários mínimos o usuário ganha
    val quantidadeSalarios = salarioUsuario / salarioMinimo

    // Impressão do resultado
    println("Você ganha aproximadamente %.2f salários mínimos.".format(quantidadeSalarios))
}
