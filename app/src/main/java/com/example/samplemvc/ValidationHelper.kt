package com.example.samplemvc

class ValidationHelper{

    companion object {
        fun validateEmail(email: String): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }
    }
}