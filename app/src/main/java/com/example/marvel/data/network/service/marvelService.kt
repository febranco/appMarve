package com.example.marvel.data.network.service

import retrofit2.Call
import com.example.marvel.data.network.response.marvelRootResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query



interface marvelService {

    @GET ("v1/public/characters")
    fun getHerois(
        @Query("ts") ts: String = TIMESTAMP,
        @Query("apikey") apikey: String = CHAVE_PUBLICA,
        @Query("hash") hash: String = MD5_HASH.md5(),
        @Query("limit") limit:  Int = 100,
        @Query("orderBy") orderBy: String = "-name"
    ): Call<marvelRootResponse>


    @GET ("v1/public/{characterId}")
    fun getHeroisId(
        @Path ("characterId") characterId  : String,
        @Query ("ts") ts: String = TIMESTAMP,
        @Query("apikey") apikey: String = CHAVE_PUBLICA,
        @Query("hash") hash: String = MD5_HASH.md5(),
        @Query("limit") limit:  Int = 100,
        @Query("orderBy") orderBy: String = "-name"

    ) : Call<marvelRootResponse>
}