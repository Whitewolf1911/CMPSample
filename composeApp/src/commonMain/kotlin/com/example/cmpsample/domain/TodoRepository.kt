package com.example.cmpsample.domain

interface TodoRepository {
    suspend fun getTodos(): List<String>
}