package com.lm.sales.services

import com.lm.sales.model.Product
import com.lm.sales.model.Taxes
import com.lm.sales.model.foods.Foods
import com.lm.sales.model.medicals.Medicals
import com.lm.sales.model.stationery.Stationery

/**
 * TaxesCalcultor service to calculate basic and importing taxes
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

            // Basic taxes: if product isn't a Stationery (Books), Foods or Medicals, it has a 10% more taxes
            if(product !is Stationery || product !is Foods || product !is Medicals)
                taxes = product.basePrice * 10 / 100

            // If imported, we add a 5% more to taxes
            if(product.imported)
                taxes.plus(product.basePrice * 5 /100)

            return Taxes().apply {
                taxesAmount = taxes
                afterTaxesAmount = product.basePrice.plus(taxes)
            }
        }
	}
}