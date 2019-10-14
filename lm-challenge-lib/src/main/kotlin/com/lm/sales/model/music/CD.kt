package com.lm.sales.model.music

import com.lm.sales.model.Taxes

/**
 * Compact disc implementation of [Music] product interface
 *
 * @author j.hernandez
 */
data class CD (val discName: String,
			   val artist: String,
			   val tracksNumber: Int?,
			   val label: String,
			   val isImported: Boolean,
			   val price: Double, override var taxes: Taxes): Music {

	override val name = discName
	override val mainArtist = artist
	override val tracks = tracksNumber
	override val recordLabel = label
	override val imported = isImported
	override val basePrice = price
}