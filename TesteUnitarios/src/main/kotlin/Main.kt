fun endereco(rua :String, cidade :String, estado : String,
             cep: String = "")
{


}

fun media(vararg valores:Float): Float
{
    var soma = 0F
    for (i in valores)
    {
        soma += i
    }
    return soma / valores.size
}

fun main(){
    println("A média é:%f".format(media(8F, 10F, 5f, 5f)))

    /*endereco("", "", estado = "")

    "".equals("",false)*/
}