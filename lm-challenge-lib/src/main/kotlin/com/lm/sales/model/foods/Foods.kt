package com.lm.sales.model.foods

import com.lm.sales.model.Product

interface Foods: Product {

    val manufacturer: String?
    // ...
}