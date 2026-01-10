fun endereco(rua :String, cidade :String, estado : String,
             cep: String = "")
{


}
/*
fun abc(): Nothing
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

fun main(){
    println("A média é:%f".format(media(8F, 10F, 5f, 5f)))
    println("A média é:%f".format(media(1, 2, 3, 4)))

    /*endereco("", "", estado = "")

    "".equals("",false)*/
}