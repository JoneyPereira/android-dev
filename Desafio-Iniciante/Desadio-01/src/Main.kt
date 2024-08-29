import java.util.*

fun main() {
    val eletricidadeFatorEmissao = 0.475 // kg CO2/kWh
    val gasNaturalFatorEmissao = 2.0 // kg CO2/m³

    var totalPegadaCarbono = 0.0

    while (true) {
        println("Informe o tipo de energia (eletricidade ou gas natural) ou digite 'sair' para finalizar:")
        val tipoEnergia = readlnOrNull()?.lowercase(Locale.getDefault())

        if (tipoEnergia == "sair") {
            break
        }

        if (tipoEnergia != "eletricidade" && tipoEnergia != "gas natural") {
            println("Tipo de energia inválido. Por favor, insira 'eletricidade' ou 'gas natural'.")
            continue
        }

        println("Informe o consumo de $tipoEnergia:")
        val consumo = readlnOrNull()?.toDoubleOrNull()

        if (consumo == null || consumo <= 0) {
            println("Consumo inválido. Por favor, insira um valor numérico positivo.")
            continue
        }

        val pegadaCarbono = when (tipoEnergia) {
            "eletricidade" -> consumo * eletricidadeFatorEmissao
            "gas natural" -> consumo * gasNaturalFatorEmissao
            else -> 0.0
        }

        totalPegadaCarbono += pegadaCarbono
        println("Pegada de carbono calculada para $tipoEnergia: $pegadaCarbono kg CO2")
    }

    println("O valor total da pegada de carbono é: $totalPegadaCarbono kg CO2")
}
