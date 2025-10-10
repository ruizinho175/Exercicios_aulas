fun main() {
    val tempoSegundos = 45735845
    var minutos = tempoSegundos/60
    val segundos = tempoSegundos%60
    var horas = 0

    println("$tempoSegundos segundos")

    if (minutos > 60) {
        horas = minutos/60
        minutos = minutos % 60
    } else horas = 0

    if (horas > 24) {
        horas = horas % 24
    }

    val tempo = String.format("Equivale a %02d:%02d:%02d", horas, minutos, segundos)
    println(tempo)

    val dias = tempoSegundos/86400
    println("e $dias dias")

    val tempoAteDia = 86400-(tempoSegundos%86400)
    var minutosAteDia = tempoAteDia/60
    val segundosAteDia = tempoAteDia%60
    var horasAteDia = 0

    if (minutosAteDia > 60) {
        horasAteDia = minutosAteDia/60
        minutosAteDia = minutosAteDia % 60
    } else horasAteDia = 0

    val ateDia = String.format("%02d:%02d:%02d ate ao proximo dia" , horasAteDia, minutosAteDia, segundosAteDia)
    println(ateDia)
}