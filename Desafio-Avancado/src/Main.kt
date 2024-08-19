import java.io.File
import java.io.IOException
import java.lang.NumberFormatException

// Função que calcula a pegada de carbono de um item com base na quantidade
fun calcularPegadaDeCarbono(item: String, quantidade: Int): Double {
    return when (item.lowercase()) {
        "carne" -> 27.0 * quantidade // Emissões estimadas de carne por kg
        "leite" -> 3.2 * quantidade  // Emissões estimadas de leite por litro
        "vegetais" -> 2.0 * quantidade // Emissões estimadas de vegetais por kg
        "arroz" -> 2.7 * quantidade // Emissões estimadas de arroz por kg
        else -> 1.0 * quantidade // Valor padrão para outros itens
    }
}

fun main() {
    val caminhoArquivo = "src/itens.txt" // Substitua pelo caminho do arquivo desejado
    var pegadaDeCarbonoTotal = 0.0

    try {
        // Lê o arquivo linha por linha
        File(caminhoArquivo).forEachLine { linha ->
            val partes = linha.split(",") // Espera que os dados estejam no formato "item,quantidade"

            // Uso do operador Elvis para valores padrão e let para operações seguras
            val item = partes.getOrNull(0)?.trim() ?: "item_desconhecido"
            val quantidade = partes.getOrNull(1)?.trim()?.toIntOrNull() ?: 0

            // Calcula a pegada de carbono para o item atual
            val pegadaDeCarbono = item.let { calcularPegadaDeCarbono(it, quantidade) }

            // Acumula o valor total da pegada de carbono
            pegadaDeCarbonoTotal += pegadaDeCarbono

            // Exibe a pegada de carbono do item atual
            println("Item: $item, Quantidade: $quantidade, Pegada de Carbono: $pegadaDeCarbono kg CO2e")
        }

        // Exibe a pegada de carbono total
        println("Pegada de Carbono Total: $pegadaDeCarbonoTotal kg CO2e")

    } catch (e: IOException) {
        println("Erro ao ler o arquivo: ${e.message}")
    } catch (e: NumberFormatException) {
        println("Erro de formato de número: ${e.message}")
    } catch (e: Exception) {
        println("Erro inesperado: ${e.message}")
    }
}
