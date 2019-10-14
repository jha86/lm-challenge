package builders

import com.lm.sales.builders.CDBuilder
import org.junit.Test
import org.junit.jupiter.api.Assertions

class CDBuilderTest {

	@Test
	fun build(){

		val cd = CDBuilder().withName("Purple Rain")
							.withArtist("Prince")
							.withTracks(9)
							.setImported(true)
							.withRecordLabel("Warner Bros")
							.withBasePrice(15.00)
							.build()

		Assertions.assertEquals("Purple Rain", cd.name)
		Assertions.assertEquals("Prince", cd.mainArtist)
		Assertions.assertEquals(9, cd.tracks)
		Assertions.assertEquals(true, cd.isImported)
		Assertions.assertEquals("Warner Bros", cd.label)
		Assertions.assertEquals(15.00, cd.basePrice)
	}

}