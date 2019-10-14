package com.lm.sales.builders

import com.lm.sales.model.Taxes
import com.lm.sales.model.music.CD

class CDBuilder {

	private lateinit var discName: String
	private lateinit var artist: String
	private var tracksNumber: Int? = null
	private lateinit var label: String
	private var isImported: Boolean = false
	private var basePrice: Double = 0.0
	private lateinit var taxes: Taxes

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

	fun setImported(imported: Boolean): CDBuilder {
		this.isImported = imported
		return this
	}

	fun withBasePrice(price: Double): CDBuilder {
		this.basePrice = price
		return this
	}

	fun withTaxes(taxes: Taxes): CDBuilder {
		this.taxes = taxes
		return this
	}

	fun build(): CD {
		return CD(discName, artist, tracksNumber, label, isImported, basePrice, taxes)
	}

}