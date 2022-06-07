package com.daveloper.curriculumvitae.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Experience(
    @PrimaryKey val id: Int,
    val startDate: String,
    val endDate: String,
    val profession: String,
    val employer: String,
    val description: String
)