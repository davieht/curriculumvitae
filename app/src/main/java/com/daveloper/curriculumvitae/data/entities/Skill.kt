package com.daveloper.curriculumvitae.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Skill(
    @PrimaryKey val name: String,
    val percent: Float,
)