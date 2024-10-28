package com.stock.transactions.stmp_users

import com.stock.transactions.stmp_users.entities.models.AppUser
import com.stock.transactions.stmp_users.repositories.AppUserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import kotlin.math.PI

@SpringBootApplication
class StmpUsersApplication

fun main(args: Array<String>) {
	runApplication<StmpUsersApplication>(*args)
}

//@Bean
//fun init(appRepo : AppUserRepository) = CommandLineRunner {
//	val myUser = AppUser(firstName = "Marius", lastName = "Popa", email = "mariuspopa@hopa.com", password = "123")
//	appRepo.save(myUser)
//}