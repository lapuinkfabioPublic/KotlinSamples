enum class Cargo {
    DIRETOR, GERENTE
}

enum class Prioridade(val id:Int) {
    BAIXA ( 0), MEDIA(1), ALTA (2)
}


fun main(){
    for (p in Prioridade.values())
    {
        println(p)
    }

    val pessoa2: PessoaFisica = PessoaFisica("fabio",1980)
    with(pessoa2){
        this.nome = "fabio2"
        this.doc = "1999"
        this.anoNascimento= 1981

    }

    println(pessoa2.nome)
    println(pessoa2.doc)
    println(pessoa2.anoNascimento)

}