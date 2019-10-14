package com.lm.sales.model.music

import com.lm.sales.model.Product

interface Music: Product {

    val mainArtist: String
    val tracks: Int?
    val recordLabel: String
	//val format: <Format> //Vinyl, CD, MP3, Tape...
    // ...
}