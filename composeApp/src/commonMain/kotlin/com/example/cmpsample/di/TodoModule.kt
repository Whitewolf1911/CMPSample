package com.example.cmpsample.di

import com.example.cmpsample.core.di.AuthHttpClient
import com.example.cmpsample.core.di.PrimaryHttpClient
import com.example.cmpsample.data.KtorTodoRepository
import com.example.cmpsample.domain.TodoRepository
import com.example.cmpsample.presentation.TodoViewModel
import io.ktor.client.HttpClient
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
class TodoModule {

    @Factory(binds = [TodoRepository::class])
    fun providePrimaryTodoRepository(@PrimaryHttpClient httpClient: HttpClient) =
        KtorTodoRepository(httpClient = httpClient)

    @Factory(binds = [TodoRepository::class])
    fun provideAuthTodoRepository(@AuthHttpClient httpClient: HttpClient) =
        KtorTodoRepository(httpClient = httpClient)

    @KoinViewModel
    fun todoViewModel(todoRepository: TodoRepository) = TodoViewModel(todoRepository)
}