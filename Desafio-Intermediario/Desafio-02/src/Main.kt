fun main() {
    // Instanciando uma Reserva Marinha
    val reservaMarinha = ReservaMarinha(300.0, true, "Reserva de Corais")
    reservaMarinha.definirTipoAmbiente(TipoAmbienteMarinho.RECIFE_DE_CORAL)
    reservaMarinha.exibirDetalhes()

    // Instanciando uma Área Protegida Marinha
    val areaProtegida = AreaProtegidaMarinha(500.0, true, "Área de Proteção Integral")
    areaProtegida.definirTipoAmbiente(TipoAmbienteMarinho.MANGUEZAL)
    areaProtegida.exibirDetalhes()

    // Usando a Data Class
    val dados = DadosConservacao("Reserva Baía", TipoAmbienteMarinho.BAIA, 120.0, false)
    println("Dados de Conservação: $dados")
}
/*
 - Equipe: Bitpulse 
 - Alan Andrade Nogueira
 - Lucas Souza de Almeida
 - Joney Sousa Pereira
*/