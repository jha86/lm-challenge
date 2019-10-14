package com.lm.sales.model.stationery

import com.lm.sales.model.Taxes

/**
 * Book implementation of [Stationery] product interface
 *
 * @author j.hernandez
 */
data class Book (val bookName: String,
                 val isImported: Boolean,
                 val bookPages: Int?,
                 val bookEditorial: String?,
                 val bookManufacturer: String?,
                 val price: Double, override var taxes: Taxes) : Stationery {

    override val name = bookName
    override val imported = isImported
    override val pages = bookPages
    override val editorial = bookEditorial
    override val manufacturer = bookManufacturer
    override val basePrice = price

}