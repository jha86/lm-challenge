package com.lm.sales.model

/**
 * Parent class of every shop product
 *
 * @author j.hernandez
 */
interface Product {

    val name: String
    val basePrice: Double
    var taxes: Taxes?
    val imported: Boolean
	val presentation: Presentation?
}

enum class Presentation {
    box, bottle, packet
}

data class Taxes(var taxesAmount: Double = 0.0,
                 var afterTaxesAmount: Double = 0.0)



