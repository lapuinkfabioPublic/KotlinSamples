fun main(){

    var c1 : Computador
    var m1:Microfone

    c1 = Computador("Dell", 100F)
    m1 = Microfone("Aiwa", 30F)

    println(c1.marca)
    println(c1.preco)
    c1.ligar()
    c1.desligar()


    m1.ligar()
    m1.aumentarVolume()


    println(m1.marca)
    println(m1.preco)

}

class Computador ( marca:String,  preco: Float): Eletronico(marca, preco) {
    fun instalarSoftware(){}
    fun removerSoftware(){}
}

class Microfone(marca: String, preco: Float) : Eletronico(marca, preco) {
    fun aumentarVolume(){}
    fun diminuirVolume(){}
    fun mute(){}
    fun unmute(){}
}

open class Eletronico(var marca:String, var preco:Float){
    fun ligar(){}
    fun desligar(){}

}

