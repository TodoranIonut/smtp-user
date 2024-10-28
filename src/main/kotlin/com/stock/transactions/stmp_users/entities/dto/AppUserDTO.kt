package com.stock.transactions.stmp_users.entities.dto

import lombok.Data

@Data
data class AppUserDTO(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val gender: String
)