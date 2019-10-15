package com.lm.sales.builders

import com.lm.sales.model.music.CD

class CDBuilder {

	private lateinit var discName: String
	private var artist: String? = null
	private var tracksNumber: Int? = null
	private var label: String? = null
	private var isImported: Boolean = false
	private var basePrice: Double = 0.0

	fun withName(name: String): CDBuilder {
		this.discName = name
		return this
	}

	fun withArtist(artist: String): CDBuilder {
		this.artist = artist
		return this
	}

	fun withTracks(tracksNumber: Int): CDBuilder {
		this.tracksNumber = tracksNumber
		return this
	}

	fun withRecordLabel(label: String): CDBuilder {
		this.label = label
		return this
	}

	fun isImported(imported: Boolean): CDBuilder {
		this.isImported = imported
		return this
	}

	fun withBasePrice(price: Double): CDBuilder {
		this.basePrice = price
		return this
	}

	fun build(): CD {
		return CD(discName, artist, tracksNumber, label, isImported, basePrice)
	}

}