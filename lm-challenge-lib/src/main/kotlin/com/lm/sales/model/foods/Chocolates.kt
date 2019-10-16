package com.lm.sales.model.foods

import com.lm.sales.model.Presentation
import com.lm.sales.model.Taxes

/**
 * Chocolates implementation of [Foods] interface
 *
 */
data class Chocolates (override val name: String,
					   override val manufacturer: String,
					   override val presentation: Presentation,
					   override val imported: Boolean,
					   override val basePrice: Double,
					   override var taxes: Taxes? = null): Foods
