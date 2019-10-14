package com.lm.sales.model.drugstore

import com.lm.sales.model.Product

interface Drugstore: Product {

    //val type: <DrugstoreType> //Cleaning, Perfume, PersonalCare...
    val manufacturer: String
    // ...
}