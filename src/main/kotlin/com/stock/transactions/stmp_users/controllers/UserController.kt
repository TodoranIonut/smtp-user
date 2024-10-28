package com.stock.transactions.stmp_users.controllers

import com.stock.transactions.stmp_users.entities.dto.AppUserDTO
import com.stock.transactions.stmp_users.entities.models.AppUser
import com.stock.transactions.stmp_users.mappers.AppUserMapper
import com.stock.transactions.stmp_users.mappers.toDTO
import com.stock.transactions.stmp_users.mappers.toEntity
import com.stock.transactions.stmp_users.repositories.AppUserRepository
import com.stock.transactions.stmp_users.service.AppUserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    val appUserService: AppUserService,
) {


    @PostMapping
    fun getUsers(@RequestBody newUser : AppUserDTO): ResponseEntity<AppUserDTO> {
        val user = newUser.toEntity()
        val savedUser = appUserService.saveNewUser(user)
        val responseUser = savedUser.toDTO()
        return ResponseEntity.ok(responseUser)
    }

    @GetMapping("/all")
    fun getUsers(): ResponseEntity<List<AppUserDTO>> {
        return ResponseEntity.ok(appUserService.getAllUsers().map { user-> user.toDTO() } )
    }

    @GetMapping("/email/{email}")
    fun getUsers(@PathVariable("email") searchedEmail : String): ResponseEntity<AppUserDTO> {
        val findUser = appUserService.getByEmail(searchedEmail)
        return ResponseEntity.ok(findUser?.toDTO())
    }

}