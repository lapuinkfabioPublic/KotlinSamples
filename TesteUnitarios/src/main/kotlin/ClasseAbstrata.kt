interface Selvagem {
    fun Raiva()
}

//Fabio Leandro Lapuinka - Criando função Abastrata
abstract class Animal (var nome: String)
{
     abstract fun emitirSom()
}

class Cachorro(nome:String) : Animal(nome) {
    override fun emitirSom(){
        println("ruido de latido")
    }
}

class Gato(nome:String) : Animal(nome) , Selvagem{
    override  fun emitirSom(){
        println("ruido de miado")
    }

    override fun Raiva() {
        println("fica ouriçado")
    }

}

fun main(){
    val cat = Gato("cat")
    cat.emitirSom()
    cat.Raiva()
}

open class Funcionario
{
    fun trabalha(){}
}
class Analista
class QA
class Programador
class Gerente