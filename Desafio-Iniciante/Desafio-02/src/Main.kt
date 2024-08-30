fun main() {
    // Exemplo de uso da classe ConservacaoMarinha
    val conservacao = ConservacaoMarinha("Recife de Coral", 150.0, true)

    // Acessando e modificando as propriedades
    println("Tipo de Ambiente: ${conservacao.tipo}")
    conservacao.tipo = "Manguezal"
    println("Novo Tipo de Ambiente: ${conservacao.tipo}")

    println("Área Protegida: ${conservacao.area} km²")
    conservacao.area = 200.0
    println("Nova Área Protegida: ${conservacao.area} km²")

    println("Programas de Monitoramento: ${conservacao.monitoramento}")
    conservacao.monitoramento = false
    println("Programas de Monitoramento Atualizado: ${conservacao.monitoramento}")
}