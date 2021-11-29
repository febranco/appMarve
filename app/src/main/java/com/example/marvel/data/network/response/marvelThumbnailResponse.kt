package com.example.marvel.data.network.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class marvelThumbnailResponse(
    val path: String,
    val extension : String
)
