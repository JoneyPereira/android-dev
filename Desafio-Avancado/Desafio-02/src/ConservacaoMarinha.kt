abstract class ConservacaoMarinha(
    val tipoAmbienteMarinho: String,
    val areaProtegidaKm2: Double,
    val programasDeMonitoramento: Boolean
) : Conservacao {

    // Companion object para funções ou propriedades que pertencem à classe e não à instância
    companion object {
        fun criarConservacaoPadrao(): ConservacaoMarinha {
            return object : ConservacaoMarinha("Desconhecido", 0.0, false) {
                override fun calcularEficiencia(): Double {
                    return 0.0
                }
            }
        }
    }

    // Método abstrato que deve ser implementado pelas subclasses
    abstract fun detalhesConservacao()

    // Método comum que pode ser sobrescrito
    open fun calcularEficiencia(baseEficiencia: Double, fatorAjuste: Double = 1.0): Double {
        return baseEficiencia * fatorAjuste
    }
}