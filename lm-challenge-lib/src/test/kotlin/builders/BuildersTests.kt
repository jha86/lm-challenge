package builders

import com.lm.sales.builders.BookBuilder
import com.lm.sales.builders.CDBuilder
import com.lm.sales.builders.PillsBuilder
import com.lm.sales.model.Presentation
import com.lm.sales.util.TaxesCalculator
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BuildersTests {

	@Test
	fun buildCD(){

		// Fictional  example of a CD building
		val cd = CDBuilder().withName("Purple Rain")
							.withArtist("Prince")
							.withTracks(9)
							.isImported(false)
							.withRecordLabel("Warner Bros")
							.withBasePrice(14.99)
							.build().apply {
								taxes = TaxesCalculator.calculate(this)
							}

		Assertions.assertEquals("Purple Rain", cd.name)
		Assertions.assertEquals("Prince", cd.mainArtist)
		Assertions.assertEquals(9, cd.tracks)
		Assertions.assertEquals(false, cd.imported)
		Assertions.assertEquals("Warner Bros", cd.recordLabel)
		Assertions.assertEquals(14.99, cd.basePrice)
	}

	@Test
	fun buildBook(){

		// Fictional  example of a book building
		val book = BookBuilder().withName("1Q84")
								.withAuthor("Haruki Murakami")
								.isImported(false)
								.withPages(928)
								.withEditorial("Tusquets")
								.withBasePrice(12.49)
								.build().apply {
									taxes = TaxesCalculator.calculate(this)
								}

		Assertions.assertEquals("1Q84", book.name)
		Assertions.assertEquals("Haruki Murakami", book.author)
		Assertions.assertEquals(false, book.imported)
		Assertions.assertEquals(928, book.pages)
		Assertions.assertEquals("Tusquets", book.editorial)
		Assertions.assertEquals(12.49, book.basePrice)
	}

	@Test
	fun buildPills(){

		// Fictional  example of pills packet building
		val pills = PillsBuilder().withName("Headache pills")
								.withPharma("Bayern")
								.isImported(false)
								.withBasePrice(9.75)
								.withPresentation(Presentation.packet)
								.build().apply {
									taxes = TaxesCalculator.calculate(this)
								}

		Assertions.assertEquals("Headache pills", pills.name)
		Assertions.assertEquals("Bayern", pills.pharma)
		Assertions.assertEquals(false, pills.imported)
		Assertions.assertEquals(9.75, pills.basePrice)
		Assertions.assertEquals(Presentation.packet, pills.presentation)
	}

}