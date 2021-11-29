package com.example.marvel.data.network.service

import java.util.*

val CHAVE_PUBLICA = ""
val CHAVE_PRIVADA = ""
val TIMESTAMP = (Calendar.getInstance(TimeZone.getTimeZone("UTC")).timeInMillis /1000L).toString()
val MD5_HASH ="$TIMESTAMP$CHAVE_PRIVADA$CHAVE_PUBLICA"