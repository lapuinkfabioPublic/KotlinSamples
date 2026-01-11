//Fabio Leandro Lapuinka 01/10/2025

class Pessoa2 private constructor(){ //este construtor privado não deixa
    //a classe se instanciada/
}

class PessoaFisica(var nome: String, var anoNascimento: Int) {

    init{
        if (anoNascimento < 0)
        {
            throw  Exception ("Ano Nascimento Menor que 0")
        }
    }

    init{
        println("v1")
    }

    init{
        println("v2")
    }

    init{
        println("v3")
    }

    var doc : String? = null

    /*constructor(nome:String, anoNascimento: Int, doc: String) : this(nome,anoNascimento)
    {
        if(doc == ""){
          this.doc= "(none)"
        }
    }*/
   // var lastmsg = ""
   //var lastmsg = ""
  // var lastmsg = ""
    fun Salvar() {
      //  lastmsg = "Salvar"
    }
    fun dormir(){

    }

    fun acordar(){

    }

}


fun main() {
    //angulo reto, na frente do monitor
   // var Pessoa2 = Pessoa2()

    var p = PessoaFisica("fabio", 1980)
    var p2 = PessoaFisica("fabio", 1980)
    println(p.nome)
    println(p.anoNascimento)
    println(p.doc)
    p.Salvar()

    var a:Int = 10
    println(Int.MAX_VALUE)

   // println(p.lastmsg)

}