package com.daveloper.curriculumvitae.data.entities

import androidx.room.Embedded
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
//    val skills: List<Skill> = listOf(),
//    @Embedded val languages: List<Language>,
//    @Embedded val additionalSkills: List<String>,
//    @Embedded val interests: List<String>,
//    @Embedded val misc: List<Misc>,
//    @Embedded val educations: List<Education> = listOf(),
//    @Embedded val experiences: List<Experience> = listOf()
)

data class Profile1(
    val id: String,
    val name: String,
    val birthdate: String,
    val address: String,
    val email: String,
    val phone: String,
    val profession: String,
    val subtext: String,
    val skills: List<Skill>,
    val languages: List<Language>,
    val additionalSkills: List<String>,
    val interests: List<String>,
    val misc: List<Misc>,
    val educations: List<Education> = listOf(),
    val experiences: List<Experience> = listOf()
)







