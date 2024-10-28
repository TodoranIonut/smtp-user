package com.stock.transactions.stmp_users.service

import com.stock.transactions.stmp_users.entities.models.AppUser

interface AppUserService {

    fun saveNewUser(user : AppUser) : AppUser
    fun getAllUsers() : List<AppUser>
    fun getByEmail(email : String) : AppUser?
}