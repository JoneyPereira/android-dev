class RecifeCoral(
    areaProtegidaKm2: Double,
    programasDeMonitoramento: Boolean
) : ConservacaoMarinha("Recife de Coral", areaProtegidaKm2, programasDeMonitoramento) {

    override fun detalhesConservacao() {
        println("Recife de Coral: Área protegida de $areaProtegidaKm2 km².")
    }

    override fun calcularEficiencia(): Double {
        val eficienciaBase = 80.0 // Eficiência base para recifes de coral
        return calcularEficiencia(eficienciaBase, fatorAjuste = if (programasDeMonitoramento) 1.2 else 1.0)
    }
}
