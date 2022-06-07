package com.daveloper.curriculumvitae.data

import com.daveloper.curriculumvitae.data.daos.*
import com.daveloper.curriculumvitae.data.entities.*
import com.daveloper.curriculumvitae.domain.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class RepoImpl @Inject constructor(
    private val coroutineContext: CoroutineContext,
    private val educationDao: EducationDao,
    private val experienceDao: ExperienceDao,
    private val languageDao: LanguageDao,
    private val miscDao: MiscDao,
    private val profile: ProfileDao,
    private val skillDao: SkillDao
): Repo {
    override fun getProfile(): Flow<Profile> {
        TODO("Not yet implemented")
    }

    override fun setProfile(profile: Profile) {
        TODO("Not yet implemented")
    }

    override fun upsertEducation(education: Education) {
        TODO("Not yet implemented")
    }

    override fun upsertExperience(experience: Experience) {
        TODO("Not yet implemented")
    }

    override fun upsertLanguage(language: Language) {
        TODO("Not yet implemented")
    }

    override fun upsertMisc(misc: Misc) {
        TODO("Not yet implemented")
    }

    override fun upsertSkill(skill: Skill) {
        TODO("Not yet implemented")
    }


}