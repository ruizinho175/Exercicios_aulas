fun main () {
    val teste1 = 12
    val teste2 = 15
    val teste3 = 8
    val projeto = 16
    val faltas = 2
    val trabalhoExtra = true

    val mediaTestes = (teste1.toDouble() + teste2.toDouble() + teste3.toDouble()) / 3

    var notaFinal = mediaTestes * 0.6 + projeto * 0.4

    if (trabalhoExtra && notaFinal < 19) {
        notaFinal += 1
    }

    if (faltas > 3) {
        notaFinal -= faltas/3
    }

    when {
       notaFinal < 10 -> println("Resultado final: Reprovado")
       notaFinal < 13 -> println("Resultado final: Aprovado")
       notaFinal < 16 -> println("Resultado final: Bom")
       notaFinal < 18 -> println("Resultado final: Muito Bom")
       else  -> println("Resultado final: Excelente")
    }

    println("""
        |
        |Média: $mediaTestes
        |Notas dos testes: $teste1    $teste2    $teste3
        |Nota do projeto: $projeto
        |Faltas: $faltas
        |Trabalho extra: $trabalhoExtra
    """.trimMargin())
}