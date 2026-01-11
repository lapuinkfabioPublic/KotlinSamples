//Fabio Leandro Lapuinka 01/10/2025

class Pessoa2 private constructor(){ //este construtor privado não deixa
    //a classe se instanciada/
}

class PessoaFisica(val nome: String, val anoNascimento: Int) {

    constructor(nome:String, anoNascimento: Int, doc: String) : this(nome,anoNascimento)
    var lastmsg = ""
    var lastmsg = ""
    fun Salvar() {
        lastmsg = "Salvar"
    }
    fun dormir(){

    }

}


fun main() {
    //angulo reto, na frente do monitor
   // var Pessoa2 = Pessoa2()

    var p = PessoaFisica("fabio", 1980)
    println(p.nome)
    println(p.anoNascimento)
    println(p.lastmsg)
    p.Salvar()

    var a:Int = 10
    println(Int.MAX_VALUE)

    println(p.lastmsg)

}