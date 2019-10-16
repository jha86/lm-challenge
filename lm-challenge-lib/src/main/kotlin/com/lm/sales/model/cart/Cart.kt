package com.lm.sales.model.cart

import com.lm.sales.model.Product

/**
 * Data class containing the list of bought products
 *
 * @j.hernandez
 */
data class Cart(val productList: MutableList<Product> = mutableListOf())