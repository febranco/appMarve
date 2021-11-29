package com.example.marvel.data.network.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)


data class marvelRootResponse(
    @Json(name = "data")
    val marvelDataResponse: marvelDataResponse
)

