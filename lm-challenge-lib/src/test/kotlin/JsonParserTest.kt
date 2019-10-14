
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JsonParserTest {

    @Test
    fun convertCD() {

        val cd = "/CD.json".parse() as JsonObject

        Assertions.assertEquals("Purple Rain", cd.string("name"))
        Assertions.assertEquals("Prince", cd.string("artist"))
        Assertions.assertEquals(9, cd.int("tracksNumber"))
        Assertions.assertEquals(true, cd.boolean("imported"))
        Assertions.assertEquals(1984, cd.int("year"))
        Assertions.assertEquals("Warner Bros", cd.string("label"))
        Assertions.assertEquals(14.99, cd.double("price"))
    }


    private fun String.parse(): Any? {
        val cls = Parser::class.java
        return cls.getResourceAsStream(this)?.let { inputStream ->
            return Parser.default().parse(inputStream)
        }
    }

}