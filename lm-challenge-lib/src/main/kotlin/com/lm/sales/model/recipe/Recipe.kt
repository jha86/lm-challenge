package com.lm.sales.model.recipe

import com.lm.sales.model.cart.Cart

data class Recipe(val cart: Cart, val salesTaxes: Double, val totalAmount: Double)