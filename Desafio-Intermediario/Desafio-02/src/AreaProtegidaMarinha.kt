class AreaProtegidaMarinha(
    areaProtegidaKm2: Double,
    programasDeMonitoramento: Boolean,
    val statusProtecao: String
) : ConservacaoMarinha(areaProtegidaKm2, programasDeMonitoramento) {

    override fun exibirDetalhes() {
        println("Área Protegida Marinha - Status: $statusProtecao")
        super.exibirDetalhes()
    }
}