package com.aphamogged.consumo_api.service

import com.aphamogged.consumo_api.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    @GET("{cep}/json/")
    fun getEnderecoByCep(
        @Path(value = "cep") cep: String
    ) : Call<Endereco>


    @GET("{uf}/{cidade}/{rua}/json/")
    suspend fun getEnderecosByUfCidadeRua(
        @Path(value = "uf") uf: String,
        @Path(value = "cidade") cidade: String,
        @Path(value = "rua") rua: String
    ): List<Endereco>
}
