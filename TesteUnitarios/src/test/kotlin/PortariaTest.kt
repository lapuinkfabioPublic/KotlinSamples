import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test

class PortariaTest  {

    val bemvindo = "Welcome :)"
    val conviteInvalido = "Negado. Convite inválido."
    var negadoMenoresIdade = "Negado. Menores de idade não são permitidos."

    fun portariaTest(){}

    @Test
    @DisplayName("Testa a idade das portarias")
    fun portariaIdades(){
        Assertions.assertEquals(portaria(18,"comum", "xt0001"), bemvindo)
        Assertions.assertEquals(portaria(10,"comum", "xt0002"), bemvindo)
        Assertions.assertEquals(portaria(20,"comum", "xt0003"), bemvindo)
    }

    @Test
    @DisplayName("Negar a entrada para convites inválidos")
    fun validaTipoDeConvite(){
        Assertions.assertEquals(portaria(18,"comum", "xl2"),conviteInvalido)
        Assertions.assertEquals(portaria(10,"dd", "xl2"),conviteInvalido)
        Assertions.assertEquals(portaria(20,"dd", "xl2"),conviteInvalido)
    }

    @Test
    @DisplayName("Testa a idade das portarias")
    fun portaThrow(){
        Assumptions.assumeTrue(portaria(100,"comum", "xt0001") == bemvindo )
        Assumptions.assumeTrue(portaria(18,"comum", "xt0001") == bemvindo)
        Assumptions.assumeTrue(portaria(20,"comum", "xt0001") == bemvindo)

        Assertions.assertEquals(portaria(100,"comum", "xt0001") , bemvindo)
        Assertions.assertEquals(portaria(18,"comum", "xt0001") , bemvindo)
        Assertions.assertEquals(portaria(20,"comum", "xt0001") , bemvindo)

        //
    }
}