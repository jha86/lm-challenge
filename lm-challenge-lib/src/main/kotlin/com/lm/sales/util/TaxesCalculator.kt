package com.lm.sales.util

import com.lm.sales.model.Product
import com.lm.sales.model.Taxes
import com.lm.sales.model.foods.Foods
import com.lm.sales.model.medicals.Medicals
import com.lm.sales.model.stationery.Book
import java.math.BigDecimal
import java.math.RoundingMode

/**
 * TaxesCalcultor tool to calculate basic and importing taxes
 *
 * @j.hernandez
 */
class TaxesCalculator {

	companion object {

        /**
         * Returns a [Taxes] object with calculated taxes
         *
         * @param imported
         * @param price
         * @param productClass
         *
         * @return [Taxes] object
         */
        fun calculate(product: Product): Taxes {

            var taxes = 0.0

            // Basic taxes: if product isn't a book, foods or medicals, it has a 10% more taxes
            if(product !is Book && product !is Foods && product !is Medicals)
                taxes = product.basePrice * 10 / 100

            // If imported, we add a 5% more to taxes
            if(product.imported)
                taxes = taxes.plus(product.basePrice * 5 /100)

            // kotlin's round rounds automatically
            return Taxes().apply {
                taxesAmount = round(taxes)
                afterTaxesAmount = round(product.basePrice.plus(taxes))
            }
        }

        /**
         * Rounds to the closest 0.05 with a 2 decimal digits scale
         *
         * @param amount [Double]
         *
         */
        private fun round(amount: Double): Double{
            return BigDecimal(amount).setScale(2, RoundingMode.HALF_EVEN).toDouble()
        }
	}
}