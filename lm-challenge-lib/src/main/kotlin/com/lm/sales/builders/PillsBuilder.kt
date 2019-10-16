package com.lm.sales.builders

import com.lm.sales.model.Presentation
import com.lm.sales.model.medicals.Pills

class PillsBuilder {

	private lateinit var name: String
	private lateinit var pharma: String
	private lateinit var presentation: Presentation
	private var isImported: Boolean = false
	private var basePrice: Double = 0.0

	fun withName(name: String): PillsBuilder {
		this.name = name
		return this
	}

	fun withPharma(pharma: String): PillsBuilder {
		this.pharma = pharma
		return this
	}

	fun withPresentation(presentation: Presentation): PillsBuilder {
		this.presentation = presentation
		return this
	}

	fun isImported(imported: Boolean): PillsBuilder {
		this.isImported = imported
		return this
	}

	fun withBasePrice(price: Double): PillsBuilder {
		this.basePrice = price
		return this
	}

	fun build(): Pills {
		return Pills(name, pharma, isImported, basePrice, presentation)
	}

}