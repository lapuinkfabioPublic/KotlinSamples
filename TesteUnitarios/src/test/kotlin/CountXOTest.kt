import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CountXOTest {

    @Test
    @DisplayName("Testa a quantidade de x e o")
    fun textCountXO() {
        Assertions.assertTrue { countXO("xxoo") }
        Assertions.assertFalse { countXO("xxooo") }
        Assertions.assertTrue { countXO("xxoox") }

    }
}