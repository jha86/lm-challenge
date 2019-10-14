package com.lm.sales.builders

import com.lm.sales.model.Taxes
import com.lm.sales.model.music.CD

class BookBuilder {

	private lateinit var discName: String
	private lateinit var artist: String
	private var tracksNumber: Int? = null
	private lateinit var label: String
	private var isImported: Boolean = false
	private var basePrice: Double = 0.0
	private lateinit var taxes: Taxes

	fun withName(name: String): BookBuilder {
		this.discName = name
		return this
	}

	fun withArtist(artist: String): BookBuilder {
		this.artist = artist
		return this
	}

	fun withTracks(tracksNumber: Int): BookBuilder {
		this.tracksNumber = tracksNumber
		return this
	}

	fun withRecordLabel(label: String): BookBuilder {
		this.label = label
		return this
	}

	fun setImported(imported: Boolean): BookBuilder {
		this.isImported = imported
		return this
	}

	fun withBasePrice(price: Double): BookBuilder {
		this.basePrice = price
		return this
	}

	fun build(): CD {
		return CD(discName, artist, tracksNumber, label, isImported, basePrice, taxes)
	}

}