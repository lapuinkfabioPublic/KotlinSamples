import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test

class PortariaTest  {

    fun portariaTest(){}

    @Test
    @DisplayName("Testa a idade das portarias")
    fun portariaIdades(){
        portaria(18,"comum", "xt0001")
        portaria(10,"comum", "xt0002")
        portaria(20,"comum", "xt0003")
    }

    @Test
    fun portaThrow(){
        Assumptions.assumeTrue(portaria(10,"comum", "xt0001") == "Welcome :)")
        Assumptions.assumeTrue(portaria(18,"comum", "xt0001") == "Welcome :)")
        Assumptions.assumeTrue(portaria(20,"comum", "xt0001") == "Welcome :)")
    }
}