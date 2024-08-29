open class ConservacaoMarinha(
    val areaProtegidaKm2: Double,
    var programasDeMonitoramento: Boolean
) {
    lateinit var tipoAmbienteMarinho: TipoAmbienteMarinho

    init {
        require(areaProtegidaKm2 > 0) { "A área protegida deve ser maior que zero." }
    }

    fun definirTipoAmbiente(tipo: TipoAmbienteMarinho) {
        this.tipoAmbienteMarinho = tipo
    }

    open fun exibirDetalhes() {
        with(this) {
            println("Área Protegida: $areaProtegidaKm2 km²")
            println("Programas de Monitoramento: $programasDeMonitoramento")
            if (this::tipoAmbienteMarinho.isInitialized) {
                println("Tipo de Ambiente Marinho: $tipoAmbienteMarinho")
            } else {
                println("Tipo de Ambiente Marinho não definido.")
            }
        }
    }
}