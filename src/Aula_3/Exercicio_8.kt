fun main() {
    val precoOriginal = 135
    var percentagemDesconto = 0
    var cartaoCliente = true

    if (cartaoCliente) {
        percentagemDesconto += 5
    }

    if (precoOriginal > 100) {
        percentagemDesconto += 10
    }

    if (precoOriginal<10) {
        percentagemDesconto = 0
    }

    println("""Preco original: $precoOriginal
        |Desconto: ${precoOriginal*percentagemDesconto/100}
        |Preco final: ${precoOriginal-precoOriginal*percentagemDesconto/100}
        |Descontos aplicados:
    """.trimMargin())

    if (cartaoCliente && precoOriginal > 10) {
        println("5% cartao cliente")
    }

    if (precoOriginal > 100) {
        println("10% em compras acima de 100")
    }
}