fun main() {
    data class Estudante(
        val nome: String,
        val numero: Int,
        //posso ter private variables em data classes? Se numero fosse private como usava o seu valor nos metodos de disciplina? Getter?
        var curso: String
    )

    class Disciplina(val nome: String, val codigo: String) {

        private var _estudantes: List<Estudante> = emptyList()

        fun adicionarEstudante(estudante: Estudante): Boolean {
            if (_estudantes.any { it.numero == estudante.numero }) return false
            _estudantes += estudante
            return true

            //se o estudante já tiver inscrito (numero de aluno) não deixar inscrever de novo (return false)
        }

        fun imprimirEstudantes() {
            if (_estudantes.isEmpty()) {
                println("Não há alunos inscritos em $nome")
            } else {
                println("Estudantes inscritos em $codigo-$nome:")
                _estudantes.sortedBy { it.nome }.forEach { elemento ->
                    println("${elemento.nome} - ${elemento.numero} - ${elemento.curso}")
                }
                // ou for (elemento in _estudantes) {println(e)}
            }
        }
    }
}