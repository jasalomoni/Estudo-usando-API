package com.one.digitalinnovation.workapi.api

import com.one.digitalinnovation.workapi.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}