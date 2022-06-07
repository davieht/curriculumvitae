package com.daveloper.curriculumvitae.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.daveloper.curriculumvitae.data.daos.*
import com.daveloper.curriculumvitae.data.entities.*

@Database(
    entities = [
        Profile::class,
        Education::class,
        Experience::class,
        Language::class,
        Misc::class,
        Skill::class,
    ],
    version = 1
)
abstract class CvDatabase : RoomDatabase() {

    abstract val profileDao: ProfileDao
    abstract val skillDao: SkillDao
    abstract val educationDao: EducationDao
    abstract val experienceDao: ExperienceDao
    abstract val miscDao: MiscDao
    abstract val languageDao: LanguageDao

    companion object {
        const val DATABASE_NAME = "cv_db"
    }
}