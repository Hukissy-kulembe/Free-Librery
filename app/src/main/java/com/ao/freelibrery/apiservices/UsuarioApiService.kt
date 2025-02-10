package com.ao.freelibrery.apiservices

import com.ao.freelibrery.models.Usuario
import retrofit2.Call
import retrofit2.http.*

interface UsuarioApiService {

    @GET("usuarios")
    fun listarUsuarios(): Call<List<Usuario>>

    @GET("usuarios/{id}")
    fun buscarUsuarioPorId(@Path("id") id: Long): Call<Usuario>

    @POST("usuarios")
    fun criarUsuario(@Body usuarioInputDTO: Usuario): Call<Usuario>

    @PUT("usuarios/{id}")
    fun atualizarUsuario(@Path("id") id: Long, @Body usuarioInputDTO: Usuario): Call<Usuario>

    @DELETE("usuarios/{id}")
    fun excluirUsuario(@Path("id") id: Long): Call<Void>
}
