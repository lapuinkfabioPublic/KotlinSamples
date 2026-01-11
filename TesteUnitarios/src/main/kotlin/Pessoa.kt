class PessoaFisica(val nome: String, val anoNascimento: Int) {
    var lastmsg = ""
    fun Salvar() {
        lastmsg = "Salvar"
    }
    fun dormir(){

    }

}


fun main() {
    //angulo reto, na frente do monitor

    var p = PessoaFisica("fabio", 1980)
    println(p.nome)
    println(p.anoNascimento)
    println(p.lastmsg)
    p.Salvar()

    var a:Int = 10
    println(Int.MAX_VALUE)

    println(p.lastmsg)

}