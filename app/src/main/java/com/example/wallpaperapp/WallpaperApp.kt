package com.example.wallpaperapp

import android.app.Application
import android.content.Context

class WallpaperApp : Application() {

    companion object {
        private lateinit var mContext: Context
        fun getApplicationContext(): Context {
            return mContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        initializeApi()
    }

    private fun initializeApi() {
        mContext = applicationContext
    }
}