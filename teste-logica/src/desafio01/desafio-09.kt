fun main() {
    // Leitura do peso e da altura
    print("Digite o seu peso (em kg): ")
    val peso = readln().toDouble()

    print("Digite a sua altura (em metros): ")
    val altura = readln().toDouble()

    // Cálculo do IMC
    val imc = peso / (altura * altura)

    // Determinação da condição de acordo com o IMC
    val condicao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso ideal (parabéns)"
        imc in 25.0..29.9 -> "Levemente acima do peso"
        imc in 30.0..34.9 -> "Obesidade grau I"
        imc in 35.0..39.9 -> "Obesidade grau II (severa)"
        imc >= 40 -> "Obesidade grau III (mórbida)"
        else -> "IMC fora da faixa esperada"
    }

    // Impressão do IMC e da condição
    println("Seu IMC é: %.2f".format(imc))
    println("Condição: $condicao")
}
