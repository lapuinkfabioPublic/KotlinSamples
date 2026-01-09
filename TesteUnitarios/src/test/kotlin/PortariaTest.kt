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
    @DisplayName("Negar a entrada para convites comum")
    fun validaTipoDeConviteComum(){
        Assertions.assertEquals(portaria(25,"comum", "xx888"),conviteInvalido)
    }

    @Test
    @DisplayName("Negar a entrada para convites inválidos")
    fun validaTipoDeConviteLuxo(){
        Assertions.assertEquals(portaria(25,"luxo", "xx888"),conviteInvalido)
    }

    @Test
    @DisplayName("Negar a entrada para convites inválidos")
    fun validaTipoDeConvitePremium(){
        Assertions.assertEquals(portaria(25,"premium", "xx888"),conviteInvalido)
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