package  selead

sealed class Result //significa que a classe está fechada para herança
{
    fun Pesquisar(id :Int, nome:String) : String{
        println("$id - $nome")
        return id.toString()
    }
}

class Sucess : Result(){}
class Failure : Result(){}