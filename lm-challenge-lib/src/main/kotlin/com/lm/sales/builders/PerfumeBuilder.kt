package com.lm.sales.builders

import com.lm.sales.model.Presentation
import com.lm.sales.model.drugstore.Perfume

class PerfumeBuilder {

    private lateinit var name: String
    private var manufacturer: String? = null
    private lateinit var presentation: Presentation
    private var isImported: Boolean = false
    private var basePrice: Double = 0.0

    fun withName(name: String): PerfumeBuilder {
        this.name = name
        return this
    }

    fun withManufacturer(manufacturer: String): PerfumeBuilder {
        this.manufacturer = manufacturer
        return this
    }

    fun withPresentation(presentation: Presentation): PerfumeBuilder {
        this.presentation = presentation
        return this
    }

    fun isImported(imported: Boolean): PerfumeBuilder {
        this.isImported = imported
        return this
    }

    fun withBasePrice(price: Double): PerfumeBuilder {
        this.basePrice = price
        return this
    }

    fun build(): Perfume {
        return Perfume(name, manufacturer, isImported, basePrice, presentation)
    }

}