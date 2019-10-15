package com.lm.sales.model.cart

import com.lm.sales.model.Product

/**
 * Data class to contain a list of bought products
 *
 * @j.hernandez
 */
class Cart{
    var productList: MutableList<Product> = mutableListOf()
}