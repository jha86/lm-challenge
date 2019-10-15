package com.lm.sales.model.drugstore

import com.lm.sales.model.Presentation
import com.lm.sales.model.Taxes

data class Perfume(override val name: String,
				   override val manufacturer: String,
				   override val imported: Boolean,
				   override val basePrice: Double,
				   override val presentation: Presentation,
				   override var taxes: Taxes? = null): Drugstore