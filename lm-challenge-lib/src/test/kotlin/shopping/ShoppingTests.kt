package shopping

import com.lm.sales.builders.BookBuilder
import com.lm.sales.builders.CDBuilder
import com.lm.sales.model.cart.Cart
import com.lm.sales.services.TaxesCalculator
import org.junit.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShoppingTests {

	@Test
	fun input1(){

		val book = BookBuilder().withName("book")
				.isImported(false)
				.withBasePrice(12.49)
				.build().apply {
					taxes = TaxesCalculator.calculate(this)
				}

		val cd = CDBuilder().withName("music CD")
				.isImported(false)
				.withBasePrice(14.99)
				.build().apply {
					taxes = TaxesCalculator.calculate(this)
				}


		val cart = Cart().apply {
			productList.add(book)
			productList.add(cd)
		}




	}



}