package br.com.myjetpack.data.local

import androidx.annotation.DrawableRes

/**
 *Created by alecnsilva
 */

data class ProductModel(
    val id: String,
    val title: String,
    val subTitle: String,
    val description: String,
    val availableUnits: Int,
    var savedUnits: Int,
    val price: String,
    val promoPrice: String,
    @DrawableRes val img: Int
)