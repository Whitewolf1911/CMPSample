package com.example.cmpsample.data

import com.example.cmpsample.domain.TodoRepository
import io.ktor.client.HttpClient

class KtorTodoRepository(
    private val httpClient: HttpClient
) : TodoRepository {

    override suspend fun getTodos(): List<String> {
        return (1..10).map { "Todo $it" }
    }
}