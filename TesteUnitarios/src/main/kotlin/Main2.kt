class Matematica{

    var id:Int=10

    companion object{
        val PI = 3.141592653589793;

        fun abc(){
            println("Sou a classe matematica")
        }
        init{
            println("Iniciando o companion object")
        }
    }

    object OBJ1{
        val id1 : Int
        get() = 100

        fun abc(){
            println("O objeto objeto abc")
        }
        init{
            println("Iniciando o companion object 1")
        }
    }
    object OBJ2{
        val id2 : Int
            get() = 110

        fun abc2(){
            println("O objeto objeto abc2")
        }
        init{
            println("Iniciando o companion object 2")
        }
    }
}

fun main(){

    //object
    //companion object

    Math.PI
    Matematica().id
    Matematica.PI
    Matematica.abc()
    println(Matematica.OBJ1.id1)
    println(Matematica.OBJ2.id2)
}