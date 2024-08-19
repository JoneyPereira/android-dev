fun main() {
    // Leitura do numero qualquer
    print("Digite um valor: ")
    val A = readln().toInt()
    val div = A%2

    // Verificação se a A é par ou impar
    if (div == 0) {
        println("O numero $A é par.")
    } else {
        println("O numero $A é impar.")
    }
    // Verificação se a A é positivo ou negativo
    if (A > 0){
        println("O numero $A é positivo.")
    } else{
        println("O numero $A é negativo.")
    }
}
