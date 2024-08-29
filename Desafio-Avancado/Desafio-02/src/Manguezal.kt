class Manguezal(
    areaProtegidaKm2: Double,
    programasDeMonitoramento: Boolean
) : ConservacaoMarinha("Manguezal", areaProtegidaKm2, programasDeMonitoramento) {

    override fun detalhesConservacao() {
        println("Manguezal: Área protegida de $areaProtegidaKm2 km².")
    }

    override fun calcularEficiencia(): Double {
        val eficienciaBase = 70.0 // Eficiência base para manguezais
        return calcularEficiencia(eficienciaBase, fatorAjuste = if (programasDeMonitoramento) 1.3 else 1.0)
    }
}