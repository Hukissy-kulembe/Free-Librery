package com.ao.freelibrery.models

import java.time.LocalDate

data class Usuario(
    val id: Long,
    val nome: String,
    val email: String,
    val senha: String,
    val dataNascimento: LocalDate
){

}
