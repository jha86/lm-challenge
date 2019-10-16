package com.lm.sales.model.stationery

import com.lm.sales.model.Presentation
import com.lm.sales.model.Taxes

/**
 * Book implementation of [Stationery] product interface
 *
 * @author j.hernandez
 */
data class Book (override val name: String,
				 val author: String?,
				 override val imported: Boolean,
				 override val pages: Int?,
				 override val editorial: String?,
				 override val basePrice: Double,
				 override val presentation: Presentation?,
				 override var taxes: Taxes? = null): Stationery