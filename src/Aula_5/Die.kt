fun rollDice(): Int{
    return (1..6).random()
}

fun main() {
    val diceRoll = rollDice()
    println("Resultado do dado: $diceRoll")
}