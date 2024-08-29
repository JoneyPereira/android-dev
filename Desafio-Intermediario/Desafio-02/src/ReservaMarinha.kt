class ReservaMarinha(
    areaProtegidaKm2: Double,
    programasDeMonitoramento: Boolean,
    val nomeReserva: String
) : ConservacaoMarinha(areaProtegidaKm2, programasDeMonitoramento) {

    override fun exibirDetalhes() {
        println("Reserva Marinha: $nomeReserva")
        super.exibirDetalhes()
    }
}