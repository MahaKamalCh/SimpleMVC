package com.example.samplemvc

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface SigninService {

    @POST("users/signin")
    fun signin(@Body body: SigninRequest): Call<SigninResponse>
}