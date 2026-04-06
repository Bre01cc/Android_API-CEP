package com.aphamogged.consumo_api.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    val BASE_URL = "https://viacep.com.br/ws/"
    private val retrofitFactory = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    fun getEnderecoService(): EnderecoService{
        return retrofitFactory.create(EnderecoService::class.java)
    }
}