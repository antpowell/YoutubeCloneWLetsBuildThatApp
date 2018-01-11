package com.anthony_powell.youtubeclonewletsbuildthatapp

import okhttp3.*
import java.io.IOException

/**
 * Created by powel on 1/11/2018.
 */

class DataService{

    companion object {

        fun fetchData(){
            println("featching data...")

            val url = "https://gateway.marvel.com:443/v1/public/characters?apikey=e0d90ef687bc7f644df05b8a4870354e"
            val request = Request
              .Builder()
              .url(url)
              .build()
            val client = OkHttpClient()

            client.newCall(request).enqueue(object: Callback{

                override fun onFailure(call: Call?, e: IOException?) {
                    println("HTTP Request failure due to: $e")
                }

                override fun onResponse(call: Call?, response: Response?) {
                    val body = response?.body()?.string()
                    println(body)
                }
            })
        }

    }
}