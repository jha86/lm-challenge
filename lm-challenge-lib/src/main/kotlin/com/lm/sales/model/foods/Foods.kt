package com.lm.sales.model.foods

import com.lm.sales.model.Presentation
import com.lm.sales.model.Product

interface Foods: Product {

    val manufacturer: String
    val presentation: Presentation?
    // ...
}