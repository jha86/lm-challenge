package com.lm.sales.model.foods

import com.lm.sales.model.Presentation
import com.lm.sales.model.Taxes

/**
 * Chocolate bar implementation of [Candy] [Foods] interfaces
 *
 */
data class ChocolateBar (override val name: String,
						 override val type: Candy.CandyType,
						 override val manufacturer: String,
						 override val presentation: Presentation,
						 override val imported: Boolean,
						 override val basePrice: Double,
						 override var taxes: Taxes?): Candy(type)
