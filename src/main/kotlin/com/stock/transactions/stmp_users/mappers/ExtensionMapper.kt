package com.stock.transactions.stmp_users.mappers

import com.stock.transactions.stmp_users.entities.dto.AppUserDTO
import com.stock.transactions.stmp_users.entities.models.AppUser

fun AppUser.toDTO() = AppUserDTO(
    firstName = this.firstName,
    lastName = this.lastName,
    email = this.email,
    password = this.password,
    gender = this.gender
)

fun AppUserDTO.toEntity() = AppUser(
    firstName = this.firstName,
    lastName = this.lastName,
    email = this.email,
    password = this.password,
    gender = this.gender
)