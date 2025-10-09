package Aula_3

fun main() {

    val idade = 20

    val carta = true

    val podeConduzir = carta && idade > 18

    println("Pode conduzir: $podeConduzir")

    if (podeConduzir) {
        println("Pode conduzir")
    } else {
        println("Não pode conduzir")
    }

}