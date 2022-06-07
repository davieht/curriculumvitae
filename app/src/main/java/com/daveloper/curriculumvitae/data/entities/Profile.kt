package com.daveloper.curriculumvitae.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.daveloper.curriculumvitae.data.entities.*
import java.util.*

@Entity
data class Profile(
    @PrimaryKey val id: String,
    val name: String,
    val birthdate: String,
    val address: String,
    val email: String,
    val phone: String,
    val profession: String,
    val subtext: String,
)









