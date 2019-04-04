package com.example.samplemvc

import android.app.Application

class SampleMVCApplication: Application() {
    companion object {
        lateinit var mRestClient: RestClient
    }
    override fun onCreate() {
        super.onCreate()
        mRestClient = RestClient()
    }
}