package Aula_3

fun main() {

    val nome = "Joao"
    val idade = 25
    val cidade = "Porto"
    val profissao = "Programador"

    val apresentacao = """Ola! Eu sou $nome, tenho $idade anos (${idade * 12} meses).
    Moro no $cidade e trabalho como $profissao.""".trimIndent()

    println(apresentacao)

}