package com.daveloper.curriculumvitae.domain

import com.daveloper.curriculumvitae.data.entities.*
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun getProfile(): Flow<Profile>
    fun setProfile(profile: Profile)
    fun upsertEducation(education: Education)
    fun upsertExperience(experience: Experience)
    fun upsertLanguage(language: Language)
    fun upsertMisc(misc: Misc)
    fun upsertSkill(skill: Skill)
}