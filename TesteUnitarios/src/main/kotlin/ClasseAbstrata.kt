interface Selvagem {
    fun Raiva()
}

//Fabio Leandro Lapuinka - Criando função Abastrata
abstract class Animal2 (var nome: String)
{
     abstract fun emitirSom()
}

class Cachorro(nome:String) : Animal2(nome) {
    override fun emitirSom(){
        println("ruido de latido")
    }
}

class Gato(nome:String) : Animal2(nome) , Selvagem{
    override  fun emitirSom(){
        println("ruido de miado")
    }

    override fun Raiva() {
        println("fica ouriçado")
    }

}

open class Funcionario2
{
    fun trabalha(){}
}


fun interface  Funcionario{
    abstract  fun calculaBonus(str :String, id: Int): Float
}
class Gerente: Funcionario
{
    override  fun calculaBonus(str : String, id: Int): Float {
        return 10F
    }

}
class Analista: Funcionario {
    override fun calculaBonus(str : String, id: Int): Float {
        return 10F
    }
}
fun imprimeValorBonus(funcionario: Funcionario){
    println(funcionario.calculaBonus("abc", 10))
}


fun main(){
    imprimeValorBonus(Gerente())
    imprimeValorBonus(Analista())
    imprimeValorBonus { str , _ -> // uso underline para dizer que o parametro não é usado
        println("abc ${str}")//implementacao de u
        println("abcd ${str}")
        println("abcdef ${str}")
        println("h ${str}")

        10F
    }
}

fun main22(){
    val cat = Gato("cat")
    cat.emitirSom()
    cat.Raiva()
}
//SAM Single Abstract Method
