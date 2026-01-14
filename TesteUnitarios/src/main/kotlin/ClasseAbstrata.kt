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


abstract class Funcionario(){
    abstract  fun calculaBonus(): Float
}
class Gerente: Funcionario()
{
    override  fun calculaBonus(): Float {
        return 10F
    }

}
class Analista: Funcionario() {
    override fun calculaBonus(): Float {
        return 10F
    }
}
fun imprimeValorBonus(funcionario: Funcionario){
    println(funcionario.calculaBonus())
}


fun main(){
    imprimeValorBonus(Gerente())
    imprimeValorBonus(Analista())
}

fun main22(){
    val cat = Gato("cat")
    cat.emitirSom()
    cat.Raiva()
}
