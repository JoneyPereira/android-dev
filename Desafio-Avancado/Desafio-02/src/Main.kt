fun main() {
    // Usando polimorfismo para manipular diferentes tipos de conservações
    val conservacoes: List<ConservacaoMarinha> = listOf(
        RecifeCoral(150.0, true),
        Manguezal(200.0, false),
        ConservacaoMarinha.criarConservacaoPadrao() // Classe anônima
    )

    for (conservacao in conservacoes) {
        conservacao.detalhesConservacao()
        println("Eficiência da Conservação: ${conservacao.calcularEficiencia()}%")
        println()
    }

    // Usando uma classe anônima diretamente
    val areaProtegidaDesconhecida = object : ConservacaoMarinha("Ecossistema Desconhecido", 100.0, false) {
        override fun detalhesConservacao() {
            println("Área Protegida para Ecossistema Desconhecido: $areaProtegidaKm2 km².")
        }

        override fun calcularEficiencia(): Double {
            return 50.0 // Eficiência base para ecossistema desconhecido
        }
    }

    areaProtegidaDesconhecida.detalhesConservacao()
    println("Eficiência da Conservação: ${areaProtegidaDesconhecida.calcularEficiencia()}%")
}