package com.example.tracker_data.mapper

import com.example.tracker_data.remote.dto.Product
import com.example.tracker_domain.model.TrackableFood
import kotlin.math.roundToInt

fun Product.toTrackableFood(): TrackableFood? {
    val carbsPer100g = nutriments.carbohydrates100g.roundToInt()
    val proteinIPer100g = nutriments.proteins100g.roundToInt()
    val fatPer100g = nutriments.proteins100g.roundToInt()
    val caloriesPer100g = nutriments.energyKcal100g.roundToInt()

    return productName?.let {
        TrackableFood(
        name = it,
        caloriesPer100g =  caloriesPer100g,
        proteinPer100g = proteinIPer100g,
        fatPer100g = fatPer100g,
        carbsPer100g = carbsPer100g,
        imageUrl = imageFrontThumbUrl
        )
    }
}