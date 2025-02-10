package com.ao.freelibrery.models

import java.time.LocalDate

data class Autor(
    val id: Long,
    val nome: String,
    val nacionalidade: String,
    val dataNascimento: LocalDate,
    val biografia: String
){

}
