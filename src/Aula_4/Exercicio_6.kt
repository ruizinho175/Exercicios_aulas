fun main() {
    class ContaBanco(private var _saldo: Int) {
        var saldo: Int
            get() = _saldo
            set(value) {
                if (value > 0) {
                    _saldo = value
                } else {
                    println("O saldo deve ser um valor positivo")
                }
            }


        fun depositar(montante: Int) {
            if (montante > 0) {
                _saldo += montante
                println("$montante€ depositados. Saldo: $_saldo€")
            } else {
                println("Valor não aceite. Os valores devem ser positivos.")
            }
        }

        fun levantar(montante: Int) {
            if (montante <= 0) {
                println("O valor deve ser positivo.")
            } else if (montante > saldo) {
                println("Saldo insuficiente. Saldo atual: $saldo€.")
            } else {
                _saldo -= montante
                println("Levantamento de $montante€ com sucesso. Saldo atual: $saldo€.")
            }
        }
    }
}