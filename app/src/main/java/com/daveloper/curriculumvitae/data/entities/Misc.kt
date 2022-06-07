package com.daveloper.curriculumvitae.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Misc(
    @PrimaryKey val text: String,
    val description: String
)