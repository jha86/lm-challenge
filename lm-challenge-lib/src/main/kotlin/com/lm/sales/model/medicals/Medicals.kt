package com.lm.sales.model.medicals

import com.lm.sales.model.Presentation
import com.lm.sales.model.Product

interface Medicals: Product {
    val pharma: String
    val presentation: Presentation
}