package com.ao.freelibrery.models

import java.time.LocalDate

data class Livro(
    val titulo: String,
    val anoDePublicacao: LocalDate,
    val isbn: String,
    val numeroDePagina: Int,
    val idioma: String,
    val sinopse: String,
    val editora: String,
    val generos: List<String>,
    val autores: List<String>,
    val capaUrl: String
)
