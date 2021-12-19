package com.example.android.bodyconditionsystem

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface {

    @GET("{id}")
    fun getDetails(@Path("id") id: String?): Call<List<Details>>

}