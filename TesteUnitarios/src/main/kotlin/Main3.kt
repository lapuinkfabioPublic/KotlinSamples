fun main(){

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
    fun instalarSoftware(){
        super.ligar()
        println("Instalando...")
        println("Instalado")
        super.desligar()
    }

    fun removerSoftware(){}
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
    protected fun ligar(){}
    protected fun desligar(){}

}

