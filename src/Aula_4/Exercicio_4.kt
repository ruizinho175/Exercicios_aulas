fun main() {
    class Livro (val titulo: String, val autor: String, val paginas: Int){

        fun resumo(){
            println("Titulo: $titulo Autor: $autor Paginas: $paginas")
        }
    }

    val livro1 = Livro("O Capital", "Marx", 123)
    val livro2 = Livro("O Livro", "do Autor", 333)

    livro1.resumo()
    livro2.resumo()
}