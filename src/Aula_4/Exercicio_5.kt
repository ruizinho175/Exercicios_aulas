fun main() {
    class Livro (val titulo: String, val autor: String) {
        var paginas: Int = 0

        constructor (titulo: String, autor: String, paginas: Int)
                : this(titulo, autor) {
            this.paginas = paginas
        }

        fun resumo() {
            println("Titulo: $titulo Autor: $autor Paginas: $paginas")
        }
    }

    val livro1 = Livro("O Capital", "Marx", 123)
    val livro2 = Livro("A", "B")

 livro1.resumo()
 livro2.resumo()
}