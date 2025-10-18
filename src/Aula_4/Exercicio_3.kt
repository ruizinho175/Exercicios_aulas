fun main() {
    fun saudar( nome: String): String{
        return "Olá, $nome!"
    }
    fun calcularDesconto(preco: Double, desconto: Double = 10.0): Double {
        return (preco-desconto*preco/100)
    }

    println(saudar("Rui"))
    println(calcularDesconto(100.0))
}