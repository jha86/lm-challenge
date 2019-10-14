package com.lm.sales.model.drugstore

import com.lm.sales.model.Taxes

data class Pills(val pillsName: String,
                 val pharma: String,
                 val isImported: Boolean,
                 val price: Double, override var taxes: Taxes): Drugstore {

    override val name = pillsName
    override val manufacturer = pharma
    override val imported = isImported
    override val basePrice = price
}