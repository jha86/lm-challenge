package com.lm.sales.model.drugstore

import com.lm.sales.model.Product

interface Drugstore: Product {

    val manufacturer: String?
    // ...
}
