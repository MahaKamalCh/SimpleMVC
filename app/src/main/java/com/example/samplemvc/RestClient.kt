package com.example.samplemvc

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.*

class RestClient {

    private var BASE_URL = "some url"

    private lateinit var mApiService: SigninService

    fun RestClint() {

        val okHttpClient = OkHttpClient().newBuilder().build()

        var retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()

        mApiService = retrofit.create(SigninService::class.java)
    }

    fun getApiService(): SigninService {
        return mApiService
    }
}