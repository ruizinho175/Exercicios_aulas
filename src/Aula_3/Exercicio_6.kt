package Aula_3

import java.util.Locale

fun main() {

    val comprimento = 5
    val largura = 3
    val raio = 3

    val area_ret = comprimento.toDouble() * largura.toDouble()
    println("Retangulo (" + comprimento + "x" + largura + "): Area =" + area_ret)
    val area_circ = raio.toDouble() * raio.toDouble() * 3.14159
    println("Circulo (raio $raio): Area = ${String.format(Locale.ROOT,"%.2f", area_circ)}")
//o Locale.ROOT faz com que ele use as definicoes do root, se for Locale.US usa a dos EUA. Neste caso usamos esta para forcar o separador decimal a ser o ponto e nao a virgula.

    if (area_circ > area_ret) {
        println("O circulo tem maior area.")
    }
        else {
            println("O retangulo tem maior area.")
        }
}