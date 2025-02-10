package com.ao.freelibrery.apiservices

import com.ao.freelibrery.models.Autor
import com.ao.freelibrery.models.Livro
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface LivroApiService {


    @POST("freelibrary/livro")
    fun cadastrar(@Body livroInput: Livro): Call<Livro>

    @GET("freelibrary/livro")
    fun buscarTodos(
        @Query("titulo") titulo: String?,
        @Query("autor") autor: String?,
        @Query("genero") genero: String?,
        @Query("editora") editora: String?
    ): Call<Set<Livro>>

    @GET("freelibrary/livro/{id}")
    fun buscarPorId(@Path("id") id: Long): Call<Livro>

    @GET("freelibrary/livro/titulo/{titulo}")
    fun buscarPorTitulo(@Path("titulo") titulo: String): Call<Livro>

    @GET("freelibrary/livro/isbn/{isbn}")
    fun buscarPorIsbn(@Path("isbn") isbn: String): Call<Livro>

    @GET("freelibrary/livro/autores/{livro}")
    fun listarAutores(@Path("livro") livro: String): Call<Set<Autor>>

    @GET("freelibrary/livro/generos/{genero}")
    fun buscarLivrosPorGenero(@Path("genero") genero: String): Call<Set<Livro>>

    @GET("freelibrary/livro/autor/{nome}")
    fun buscarLivrosPorAutor(@Path("nome") nome: String): Call<Set<Livro>>

    @DELETE("freelibrary/livro/{id}")
    fun deletarPorId(@Path("id") id: Long): Call<Void>

    @PUT("freelibrary/livro/{id}")
    fun atualizar(
        @Path("id") id: Long,
        @Body livroInput: Livro
    ): Call<Livro>

}
