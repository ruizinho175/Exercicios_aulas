package Aula_3

fun main() {

    val peso = 80.00
    val altura = 1.90

    val IMC = peso / (altura * altura)

    when {
        IMC < 18.5 -> println("Abaixo do peso")
        IMC < 25.0 -> println("Peso normal")
        IMC < 30.0 -> println("Sobrepeso")
        else -> println("Obesidade")
    }

}