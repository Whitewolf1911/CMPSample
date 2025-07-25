package com.example.cmpsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform