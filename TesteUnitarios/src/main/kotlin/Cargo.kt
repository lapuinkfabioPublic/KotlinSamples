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

    var p: PessoaFisica = PessoaFisica("fabio",1980)


    with(p){
        acordar()
        dormir()
        salvar()

    }
    p.apply {

        nome = "fabio v1"
        anoNascimento = 1980
        doc = "v1v2v3"
    }

    println(p.nome)
    println(p.doc)
    println(p.anoNascimento)

}