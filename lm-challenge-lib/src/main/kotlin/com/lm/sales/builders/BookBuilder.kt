package com.lm.sales.builders

import com.lm.sales.model.Taxes
import com.lm.sales.model.stationery.Book

class BookBuilder {

	private lateinit var name: String
	private lateinit var author: String
	private var pages: Int = 0
	private lateinit var editorial: String
	private var isImported: Boolean = false
	private var basePrice: Double = 0.0
	private lateinit var taxes: Taxes

	fun withName(name: String): BookBuilder {
		this.name = name
		return this
	}

	fun withAuthor(author: String): BookBuilder {
		this.author = author
		return this
	}

	fun isImported(imported: Boolean): BookBuilder {
		this.isImported = imported
		return this
	}

	fun withPages(pages: Int): BookBuilder {
		this.pages = pages
		return this
	}

	fun withEditorial(editorial: String): BookBuilder {
		this.editorial = editorial
		return this
	}

	fun withBasePrice(price: Double): BookBuilder {
		this.basePrice = price
		return this
	}

	fun build(): Book {
		return Book(name, author, isImported, pages, editorial, basePrice)
	}

}