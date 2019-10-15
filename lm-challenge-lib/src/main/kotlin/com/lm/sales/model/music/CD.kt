package com.lm.sales.model.music

import com.lm.sales.model.Taxes

/**
 * Compact disc implementation of [Music] product interface
 *
 * @author j.hernandez
 */
data class CD (override val name: String,
			   override val mainArtist: String?,
			   override val tracks: Int?,
			   override val recordLabel: String?,
			   override val imported: Boolean,
			   override val basePrice: Double,
			   override var taxes: Taxes? = null): Music