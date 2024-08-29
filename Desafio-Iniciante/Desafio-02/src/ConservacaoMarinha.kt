class ConservacaoMarinha(
    var tipoAmbienteMarinho: String,    // Propriedade para o tipo de ambiente marinho
    var areaProtegidaKm2: Double,       // Propriedade para a área protegida em km²
    var programasDeMonitoramento: Boolean // Propriedade para indicar a presença de programas de monitoramento
) {
    // Bloco init é executado logo após o construtor primário
    init {
        // Validação inicial ou outras ações
        require(areaProtegidaKm2 > 0) { "A área protegida deve ser maior que zero." }
        println("ConservacaoMarinha criada com sucesso: Tipo de ambiente: $tipoAmbienteMarinho, Área protegida: $areaProtegidaKm2 km²")
    }

    // Construtor secundário que define um valor padrão para programas de monitoramento
    constructor(tipoAmbienteMarinho: String, areaProtegidaKm2: Double) :
        this(tipoAmbienteMarinho, areaProtegidaKm2, false)

    // Custom getters e setters para tipoAmbienteMarinho
    var tipo: String = tipoAmbienteMarinho
        get() = field.capitalize() // Capitaliza o valor quando acessado
        set(value) {
            field = value.lowercase() // Armazena o valor em minúsculas
        }

    // Custom getters e setters para area Protegida Km2
    var area: Double = areaProtegidaKm2
        get() = field
        set(value) {
            require(value > 0) { "A área protegida deve ser maior que zero." }
            field = value
        }

    // Custom getter e setter para programas De Monitoramento
    var monitoramento: Boolean = programasDeMonitoramento
        get() = field
        set(value) {
            field = value
        }
}