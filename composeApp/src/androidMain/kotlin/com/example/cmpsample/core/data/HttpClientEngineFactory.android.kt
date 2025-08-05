package com.example.cmpsample.core.data

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.engine.okhttp.OkHttpEngine

actual class HttpClientEngineFactory {
    actual fun getHttpEngine(): HttpClientEngine {
        return OkHttp.create()
    }
}