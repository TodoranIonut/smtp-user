package com.stock.transactions.stmp_users.entities.models

import lombok.Data
import lombok.Getter
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Getter
@Setter
@Data
@Document(collection = "users")
data class AppUser(
    @Id
    val id: String? = null,
    var firstName: String,
    var lastName: String,
    @Indexed(unique = true)
    var email: String,
    var password: String,
    var gender: String
)