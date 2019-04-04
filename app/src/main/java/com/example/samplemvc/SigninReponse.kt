package com.example.samplemvc

import com.google.gson.annotations.SerializedName

data class SigninResponse (
    @SerializedName("First Name") val firstName: String,
    @SerializedName("Second Name") val secondName: String

)

