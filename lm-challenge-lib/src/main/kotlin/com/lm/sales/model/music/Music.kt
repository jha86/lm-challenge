package com.lm.sales.model.music

import com.lm.sales.model.Product

interface Music: Product {

    val mainArtist: String?
    val tracks: Int?
    val recordLabel: String?
    // ...
}