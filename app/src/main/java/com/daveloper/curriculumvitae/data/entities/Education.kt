package com.daveloper.curriculumvitae.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Education(
    @PrimaryKey val id: Int,
    val startDate: String,
    val endDate: String,
    val fieldOfStudy: String,
    val name: String,
    val description: String
)