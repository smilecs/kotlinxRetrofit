package com.example.smile.kotlinxretrosample

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("/todos/1")
    fun getToDo(): Call<Field>
}