package com.example.samplemvc

import com.google.gson.annotations.SerializedName

data class SigninRequest (

    @SerializedName("Email") val email: String,
    @SerializedName("Password") val password: String

)
