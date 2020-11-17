import scala.io.Source
import scala.collection.immutable._

object Main {
  def main(args: Array[String]): Unit = {
    val chunksize = 1000 //definição do tamanho da parcela a ser lida
    val source = Source.fromFile("../data/creditcard.csv") //criando referência ao arquivo
    val lines = source.getLines //atribuindo o método getLines à variável lines para leitura de linhas do arquivo
    val firstline = lines.next //leitura da primeira linha
    val lista: LazyList[String] = {
        def loop(line: String): LazyList[String] = line #:: loop(lines.next) 
        //definição da estrutura da lista:
        //  - head = line
        //  - tail = loop(lines.next)
        loop(firstline) //definindo o primeiro elemento da lista (primeira linha do arquivo)
    }
    println(lista) //exibindo a lista (ainda não computada)
    lista.take(chunksize).foreach(println) //exibindo o primeiro "chunk" da lista
  }
}
