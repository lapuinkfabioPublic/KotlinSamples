import selead.Result

fun main(){
   // var r : Result? = Result()

   // println(r?.Pesquisar(1,"fabio"))
    var c1 : Computador
    var m1:Microfone

    c1 = Computador("Dell", 100F , 1)
    m1 = Microfone("Aiwa", 30F)

    Computador("IBM", 100F , 1).instalarSoftware()

    println(c1.marca)
    println(c1.preco)
    c1.instalarSoftware()

    m1.aumentarVolume()
    println(m1.marca)
    println(m1.preco)

}

public class Computador ( marca:String,  preco: Float, cor: Int): Eletronico(marca, preco) {

   var abc : Float = 0.0F

    override fun ligar(){
        super.ligar()
        println("Carregando o sistema operacional...")
        println("Conectando na rede ...")
    }

    fun instalarSoftware(){
        super.ligar()
        println("Instalando...")
        println("Instalado")
        super.desligar()
    }

    fun removerSoftware(){}

    private class NestedClass{ //Nested Class para controle interno
        var id: Int = 0
        fun teste(){
            //abc = 333 com nested, fica isolado

        }

    }

    private inner class InnerNestedClass2{ //Nested Class para controle interno
        var id: Int = 0
        fun teste(){
            abc = 123.0F
            //abc = 333 com inner fica junto
        }

    }
}


public class Microfone(marca: String, preco: Float) : Eletronico(marca, preco) {
    public fun aumentarVolume(){}
    public fun diminuirVolume(){}
    public fun mute(){}
    public fun unmute(){}
    public fun gravar(){}
}

public  open class Eletronico(var marca:String, var preco:Float){
    //public , private , protected
    private var correnteEletrica = false
    protected open fun ligar(){
        correnteEletrica = true
    }
    protected fun desligar(){
        correnteEletrica = false
    }

}

//assinatura
fun abc(){}
fun abc(nome:String): Int
{
    return 0
}
