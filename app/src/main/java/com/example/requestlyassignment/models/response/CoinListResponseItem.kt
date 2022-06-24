package com.example.requestlyassignment.models.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoinListResponseItem(

    @Json(name = "id")
    val id: String?,
    @Json(name = "image")
    val lastUpdated: String?,
    @Json(name = "name")
    val name: String?,
)