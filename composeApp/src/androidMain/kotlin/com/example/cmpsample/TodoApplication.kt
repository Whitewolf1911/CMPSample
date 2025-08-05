package com.example.cmpsample

import android.app.Application
import com.example.cmpsample.core.di.initKoin
import org.koin.android.ext.koin.androidContext

class TodoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@TodoApplication)
        }
    }
}