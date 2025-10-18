fun main() {
    class ContaBancaria(val titular: String, private var _saldo: Double = 0.0) {
        //Se não inicializar é obrigatorio declarar quando chamo, se inicializar e não declarar quando chamo vai para o default

        val saldo : Double
            get() = _saldo

        fun depositar(montante: Double) {
            if (montante > 0) {
                _saldo += montante
                println("$montante€ depositados. Saldo: $_saldo€")
            }else
            {
                println("Valor não aceite. Os valores devem ser positivos.")
            }
        }

        fun levantar(montante: Double) {
            if (montante <= 0) {
                println("O valor deve ser positivo.")
            } else if (montante > saldo) {
                println("Saldo insuficiente. Saldo atual: $saldo€.")
            } else {
                _saldo -= montante
                println("Levantamento de $montante€ com sucesso. Saldo atual: $saldo€.")
            }
        }

        fun consultarSaldo() {
println("Saldo atual: $saldo€")
        }
    }
}