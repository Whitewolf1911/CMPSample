package com.example.cmpsample.core.data

import io.ktor.client.engine.HttpClientEngine

expect class HttpClientEngineFactory() {
    fun getHttpEngine(): HttpClientEngine
}