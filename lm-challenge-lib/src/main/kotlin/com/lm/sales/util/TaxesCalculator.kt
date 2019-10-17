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
         * @param product [Product]
         *
         * @return [Taxes] object
         */
        fun calculate(product: Product): Taxes {

            var applicableTaxes = 0

            // Basic taxes: if product isn't a book, foods or medicals, it has a 10% more taxes
            if(product !is Book && product !is Foods && product !is Medicals)
                applicableTaxes = 10

            // If imported, we add a 5% more to taxes
            if(product.imported)
                applicableTaxes = applicableTaxes.plus(5)

            // kotlin's round rounds automatically
            return Taxes().apply {
                taxesAmount = round( product.basePrice * applicableTaxes / 100)
                afterTaxesAmount = round(product.basePrice.plus(taxesAmount))
            }
        }

        /**
         * Rounds to the closest 0.05
         *
         * @param amount [Double]
         *
         * @return [Double]
         */
        private fun round005(amount: Double): Double{
            return Math.round(amount * 20.0) / 20.0
        }

        /**
         * Rounds towards the even side
         *
         * @param amount [Double]
         *
         * @return [Double]
         *
         */
        fun round(amount: Double): Double{
            return BigDecimal(amount).setScale(2, RoundingMode.HALF_EVEN).toDouble()
        }
	}
}