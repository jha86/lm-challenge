package com.lm.sales.model.stationery

import com.lm.sales.model.Product

interface Stationery: Product {

    // parameter examples

    //val type: <BookType> //Book, Notebook, Magazine, Diary...
    val editorial: String?
    val pages: Int?
    // ...
}