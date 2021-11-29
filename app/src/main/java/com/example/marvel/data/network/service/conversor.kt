package com.example.marvel.data.network.service


import java.security.NoSuchAlgorithmException

fun String.md5(): String{
    try {
        val digest = java.security.MessageDigest.getInstance("MD5")
        digest.update(toByteArray())
        val messageDigest = digest.digest()
        val hexString = StringBuilder()
        for (aMessagemDigest in messageDigest){
            var h = Integer.toHexString(0xFF and aMessagemDigest.toInt())
            while (h.length < 2)
                    h = "0$h"
                hexString.append(h)
        }
        return hexString.toString()

    }catch (e: NoSuchAlgorithmException){
        e.printStackTrace()
    }
    return ""
}