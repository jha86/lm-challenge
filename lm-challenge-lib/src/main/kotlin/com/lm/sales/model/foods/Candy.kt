package com.lm.sales.model.foods

abstract class Candy(type: CandyType) : Foods {

	abstract val type: CandyType
	// ...

	enum class CandyType {
		chocolates, candyBar, bubbleGums, candies
	}
}

