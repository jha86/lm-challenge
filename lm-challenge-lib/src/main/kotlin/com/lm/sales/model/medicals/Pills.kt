package com.lm.sales.model.medicals

import com.lm.sales.model.Presentation
import com.lm.sales.model.Taxes

data class Pills(override val name: String,
				 override val pharma: String? = null,
				 override val imported: Boolean,
				 override val basePrice: Double,
				 override val presentation: Presentation?,
				 override var taxes: Taxes? = null): Medicals