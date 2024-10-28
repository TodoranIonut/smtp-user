package com.stock.transactions.stmp_users.service

import com.mongodb.client.model.Filters
import com.stock.transactions.stmp_users.entities.models.AppUser
import com.stock.transactions.stmp_users.repositories.AppUserRepository
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.findOne
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Service

@Service
class AppUserServiceImpl(
    val appUserRepository: AppUserRepository,
    val mongoTemplate: MongoTemplate
) : AppUserService {
    override fun saveNewUser(user: AppUser): AppUser {
        return appUserRepository.insert(user)
    }

    override fun getAllUsers(): List<AppUser> {
        return appUserRepository.findAll()
    }


    override fun getByEmail(email: String): AppUser? {
//        return appUserRepository.findByEmail(email)
        val query = Query(Criteria.where("email").`is`(email))
        return mongoTemplate.findOne(query, AppUser::class.java)
    }
}