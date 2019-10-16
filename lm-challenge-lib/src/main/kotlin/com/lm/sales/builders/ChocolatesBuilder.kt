package com.lm.sales.builders

import com.lm.sales.model.Presentation
import com.lm.sales.model.foods.Chocolates
import com.lm.sales.model.music.CD

class ChocolatesBuilder {

    private lateinit var name: String
    private lateinit var manufacturer: String
    private lateinit var presentation: Presentation
    private var isImported: Boolean = false
    private var basePrice: Double = 0.0

    fun withName(name: String): ChocolatesBuilder {
        this.name = name
        return this
    }

    fun withManufacturer(manufacturer: String): ChocolatesBuilder {
        this.manufacturer = manufacturer
        return this
    }

    fun withPresentation(presentation: Presentation): ChocolatesBuilder {
        this.presentation = presentation
        return this
    }

    fun isImported(imported: Boolean): ChocolatesBuilder {
        this.isImported = imported
        return this
    }

    fun withBasePrice(price: Double): ChocolatesBuilder {
        this.basePrice = price
        return this
    }

    fun build(): Chocolates {
        return Chocolates(name, manufacturer, presentation, isImported, basePrice)
    }

}