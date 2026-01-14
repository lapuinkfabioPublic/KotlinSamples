
class Endereco(var rua: String, var cep: String ){

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Endereco ${this.rua} ${this.cep}"
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Endereco)
            this.rua == other.rua && this.cep == other.cep
        else
            false

    }
}
data class DataEndereco (var rua:String,var cidade: String){}

fun endereco(endereco: Endereco){}

fun main(){
    val e1 = Endereco("rua 1", "cidade 1")
    val e2 = DataEndereco("rua 1", "cidade 1")

    val e3 = e1 //aqui estou colocando somente a referencia ao objeto
    e3.rua = "alteracao" //aqui estou
    val e4 =  e2.copy() //o dataClass faz a copia dos dados e estrutura

    println(e1.rua)

    println(e1.toString())
    println(e1.hashCode())
    println(e1.equals(e2))

    println(e2.toString())
}