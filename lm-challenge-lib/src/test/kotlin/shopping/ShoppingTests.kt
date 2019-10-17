package shopping

import com.lm.sales.builders.*
import com.lm.sales.model.Presentation
import com.lm.sales.model.cart.Cart
import com.lm.sales.util.TaxesCalculator
import mu.KLogging
import org.junit.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShoppingTests {

	companion object : KLogging()

	@Test
	fun input1(){

		// Builds book from input 1 an calculates taxes
		val book = BookBuilder().withName("book")
								.withBasePrice(12.49)
								.build().apply {
									taxes = TaxesCalculator.calculate(this)
								}

		// Builds CD from input 1 and calculates taxes
		val cd = CDBuilder().withName("music CD")
							.withBasePrice(14.99)
							.build().apply {
								taxes = TaxesCalculator.calculate(this)
							}

		// Builds chocolate bar from input1 and calculate taxes
		val chocoBar = ChocolatesBuilder().withName("chocolate bar")
				                          .withBasePrice(0.85)
				                          .build().apply {
												taxes = TaxesCalculator.calculate(this)
										  }

		val cart = Cart().apply {
			productList.add(book)
			productList.add(cd)
			productList.add(chocoBar)
		}

		// Adds cart products to recipe and prints it
		RecipeBuilder().withProducts(cart.productList).withRecipeName("Output 1:").printRecipe()
	}

	@Test
	fun input2(){

		// Builds chocolates box from input2 and calculate taxes
		val importedChocoBox = ChocolatesBuilder().withName("chocolates")
										  .withPresentation(Presentation.box)
				                          .isImported(true)
				                          .withBasePrice(10.00)
				                          .build().apply {
												taxes = TaxesCalculator.calculate(this)
				                          }

		// Builds bottle of perfume from input2 and calculate taxes
		val importedPerfume = PerfumeBuilder().withName("perfume")
									  .withPresentation(Presentation.bottle)
									  .isImported(true)
				                      .withBasePrice(47.50)
									  .build().apply {
											taxes = TaxesCalculator.calculate(this)
				                      }

		val cart = Cart().apply {
			productList.add(importedChocoBox)
			productList.add(importedPerfume)
		}

		// Adds cart products to recipe and prints it
		RecipeBuilder().withProducts(cart.productList).withRecipeName("Output 2:").printRecipe()
	}

	@Test
	fun input3(){

		// Builds importeds bottle of perfume from input3 and calculate taxes
		val importedPerfume = PerfumeBuilder().withName("perfume")
				.withPresentation(Presentation.bottle)
				.isImported(true)
				.withBasePrice(27.99)
				.build().apply {
					taxes = TaxesCalculator.calculate(this)
				}

		// Builds bottle of perfume from input3 and calculate taxes
		val perfume = PerfumeBuilder().withName("perfume")
				.withPresentation(Presentation.bottle)
				.withBasePrice(18.99)
				.build().apply {
					taxes = TaxesCalculator.calculate(this)
				}

		// Builds packet of headache pills from input3 and calculate taxes
		val pills = PillsBuilder().withName("headache pills")
								  .withPresentation(Presentation.packet)
				              	  .withBasePrice(9.75)
								  .build().apply {
										taxes = TaxesCalculator.calculate(this)
								   }

		// Builds box of imported chocolates from input3 and calculate taxes
		val importedChocoBox = ChocolatesBuilder().withName("chocolates")
				.withPresentation(Presentation.box)
				.isImported(true)
				.withBasePrice(11.25)
				.build().apply {
					taxes = TaxesCalculator.calculate(this)
				}

		val cart = Cart().apply {
			productList.add(importedPerfume)
			productList.add(perfume)
			productList.add(pills)
			productList.add(importedChocoBox)
		}

		// Adds cart products to recipe and prints it
		RecipeBuilder().withProducts(cart.productList).withRecipeName("Output 3:").printRecipe()
	}
}