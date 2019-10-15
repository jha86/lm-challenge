import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JsonParserTest {

    @Test
    fun parseCD() {

        val cd = "/music/CD.json".parse() as JsonObject

        Assertions.assertEquals("music CD", cd.string("name"))
        Assertions.assertEquals(false, cd.boolean("imported"))
        Assertions.assertEquals(14.99, cd.double("price"))
    }


    private fun String.parse(): Any? {
        val cls = Parser::class.java
        return cls.getResourceAsStream(this)?.let { inputStream ->
            return Parser.default().parse(inputStream)
        }
    }

}