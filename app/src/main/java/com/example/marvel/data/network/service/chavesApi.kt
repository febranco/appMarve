package com.example.marvel.data.network.service

import java.util.*

val CHAVE_PUBLICA = "33a2e389da8ef7446287d0caf9f217d0"
val CHAVE_PRIVADA = "9f498dc55425627cf6d012a8bfa5332ed9b63a7e"
val TIMESTAMP = (Calendar.getInstance(TimeZone.getTimeZone("UTC")).timeInMillis /1000L).toString()
val MD5_HASH ="$TIMESTAMP$CHAVE_PRIVADA$CHAVE_PUBLICA"