package com.stock.transactions.stmp_users.repositories

import com.stock.transactions.stmp_users.entities.models.AppUser
import org.springframework.data.mongodb.repository.MongoRepository

interface AppUserRepository : MongoRepository<AppUser, Long> {

    fun findByEmail(email : String) : AppUser?
}