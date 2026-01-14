
open class Animal(nome1: String)
{

    open var nome: String = ""
        get() {

            return field
        }


    fun CalculaBonus(cargo: Cargo): Float{
        return if (cargo ==  Cargo.DIRETOR){
            5000F
        }
        else if(cargo==Cargo.GERENTE){
            3000F
        }
        else
        {
            2000F
        }
    }
}

fun endereco(rua :String, cidade :String, estado : String,
             cep: String = "")
{


}
/*

/
fun abc(): Nothing/
{
    //TODO para fazer
}
*/
fun media(vararg valores: Any): Float
{
    var soma = 0F
    for (i in valores)
    {
        when (i) {
            is Float -> soma += i
//            is Double -> soma += i
            is Int -> soma += i
  //          is String -> soma += i
        }
    }
    return soma / valores.size
}

fun main2(){

    val animal = Animal(nome)
    println(animal.CalculaBonus(Cargo.GERENTE))


//    println("A média é:%f".format(media(8F, 10F, 5f, 5f)))
  //  println("A média é:%f".format(media(1, 2, 3, 4)))

    /*endereco("", "", estado = "")

    "".equals("",false)*/
}

class Database(){

    fun openConnection(){
        println("Conexão Estabelecida")
    }
}
class Server{
    lateinit var db: Database
    fun initServer(){

        if(!::db.isInitialized){ //se a variavel db não está inicializada
            db = Database()
        }

        db.openConnection()
    }

}

fun main(){
    val server = Server()

}