import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CountXOTest {


    @Test
    fun testNotNull(){
        Assertions.assertNotNull(countXO("teste"))

    }

    @Test
    @Disabled
    fun teste02(){
        //TODO para implementar ainda.
    }

    @Test
    @DisplayName("Testa a quantidade de x e o")
    fun textCountXO() {
      /*  Assertions.assertTrue { countXO("xxoo") }
        Assertions.assertTrue { countXO("xxoo") }
        Assertions.assertTrue { countXO("xxoo") }
*/

        // ou

        Assertions.assertAll(({
            Assertions.assertTrue(countXO("xxoo"))
        }),
            {
                Assertions.assertTrue(countXO("xxoo"))
            },
            {
                Assertions.assertTrue(countXO("xxooo"))
            }

        )
    }

    @Test
    @DisplayName("Testa a quantidade de z e y")
    fun rodaBaseadoEmCondicao(){
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertEquals(true, countXO("xxoo0"))
    }

    @Test
    fun lancaExcecao(){
        assertThrows<ArrayIndexOutOfBoundsException>{
            xpto()
        }
    }

    fun xpto(){
        throw IndexOutOfBoundsException()
    }
}