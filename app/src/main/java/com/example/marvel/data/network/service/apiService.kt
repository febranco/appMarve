package com.example.marvel.data.network.service

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object apiService {

    private fun initRetrofit() : Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("https://gateway.marvel.com/")
            .addConverterFactory(MoshiConverterFactory.create())
        build()

    }

    val service: marvelService = initRetrofit().create(marvelService::class.java)

}