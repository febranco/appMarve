package com.example.marvel.data.network.response

// usando o moshi para ter uma leitura melhor do json em kotlin

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

data class marvelDataResponse(
    @Json(name = "results")
    val result: List<marvelResultsResponse>
)
