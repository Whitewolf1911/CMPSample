package com.example.cmpsample.core.di

import com.example.cmpsample.core.data.HttpClientEngineFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import org.koin.core.annotation.Module
import org.koin.core.annotation.Named
import org.koin.core.annotation.Single

@Module
class AppModule {

    @Single
    @AuthHttpClient
    fun authHttpClient(engine: HttpClientEngine): HttpClient = HttpClient(engine){
        // ....
    }

    @Single
    @PrimaryHttpClient
    fun primaryHttpClient(engine: HttpClientEngine): HttpClient = HttpClient(engine){
        // ....
    }

    @Single
    fun httpClientEngine(): HttpClientEngine = HttpClientEngineFactory().getHttpEngine()

    //Alternatively you can use @Factory annotation. This will give fresh instance every time.
}

@Named
annotation class AuthHttpClient

@Named
annotation class PrimaryHttpClient