fun main() {
    // Leitura do primeiro valor booleano
    print("Digite o primeiro valor booleano (true ou false): ")
    val valor1 = readln().toBoolean()

    // Leitura do segundo valor booleano
    print("Digite o segundo valor booleano (true ou false): ")
    val valor2 = readln().toBoolean()

    // Verificação se ambos são verdadeiros ou falsos
    if (valor1 && valor2) {
        println("Ambos os valores são VERDADEIROS.")
    } else if (!valor1 && !valor2) {
        println("Ambos os valores são FALSOS.")
    } else {
        println("Os valores são diferentes (um é VERDADEIRO e o outro é FALSO).")
    }
}
