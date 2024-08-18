fun main() {
    val emissionFactors = mapOf(
        "carro" to 0.21,
        "onibus" to 0.105,
        "aviao" to 0.133
    )

    val distances = mutableListOf<Double>()
    val transportModes = mutableListOf<String>()
    var continueInput = true

    while (continueInput) {
        println("Digite a distância percorrida (km): ")
        val distance = readlnOrNull()?.toDoubleOrNull()

        if (distance != null) {
            distances.add(distance)
        } else {
            println("Entrada inválida. Tente novamente.")
            continue
        }

        println("Digite o meio de transporte utilizado (carro, onibus, aviao): ")
        val transportMode = readlnOrNull()

        if (transportMode != null && emissionFactors.containsKey(transportMode)) {
            transportModes.add(transportMode)
        } else {
            println("Meio de transporte inválido. Tente novamente.")
            continue
        }

        println("Deseja adicionar outra viagem? (s/n)")
        val continueResponse = readlnOrNull()
        if (continueResponse.equals("n", ignoreCase = true)) {
            continueInput = false
        }
    }

    val totalCarbonFootprint = calculateTotalCarbonFootprint(distances, transportModes, emissionFactors)
    println("A pegada de carbono total é: $totalCarbonFootprint kg CO2")
}

fun calculateTotalCarbonFootprint(
    distances: List<Double>,
    transportModes: List<String>,
    emissionFactors: Map<String, Double>
): Double {
    var total = 0.0

    for (i in distances.indices) {
        val transportMode = transportModes[i]
        val distance = distances[i]
        val emissionFactor = emissionFactors[transportMode] ?: 0.0

        val carbonFootprint = distance * emissionFactor
        println("Viagem ${i + 1}: $distance km de $transportMode resulta em $carbonFootprint kg CO2")
        total += carbonFootprint
    }

    return total
}
