package com.lm.sales.builders

import com.lm.sales.model.Product
import com.lm.sales.util.TaxesCalculator
import mu.KLogging

/**
 * Builder to generate recipes, if we had different recipe types, we should use a factory
 *
 * @j.hernandez
 */
class RecipeBuilder {

	companion object : KLogging()

	private var products: MutableList<Product> = mutableListOf()
	private var totalAmount: Double = 0.0
	private var salesTaxes: Double = 0.0
	private lateinit var recipeName: String

	fun withProducts(productList: MutableList<Product>): RecipeBuilder{
		this.products = productList
		return this
	}

	fun withRecipeName(recipeName: String): RecipeBuilder{
		this.recipeName = recipeName
		return this
	}

	/**
	 * Prints the recipe or prints a log message if recipe doesn't have products
	 */
	fun printRecipe(){

		if(this.products.isEmpty()) {
			logger.info ("Can't print the recipe without products!!")
		}else{

			recipeName.let { logger.info { it } }

			this.products.forEach{ salesTaxes = salesTaxes.plus(it.taxes!!.taxesAmount) }
			this.products.forEach { totalAmount = totalAmount.plus(it.taxes!!.afterTaxesAmount) }

			products.forEach{

				// We only add presentation type if not null
				var pres = ""
				if(it.presentation != null)
					pres = it.presentation!!.name.plus(" of")

				// If product is imported we write it in the recipe
				var imported = ""
				if(it.imported)
					imported = "imported"

				logger.info { "1 $imported $pres ${it.name}: ${it.taxes!!.afterTaxesAmount}" }
			}

			logger.info { "Sales Taxes: ${TaxesCalculator.round(salesTaxes)}" }
			logger.info { "Total: ${TaxesCalculator.round(totalAmount)}"   }
		}

	}


}

