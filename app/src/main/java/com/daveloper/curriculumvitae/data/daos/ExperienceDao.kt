package com.daveloper.curriculumvitae.data.daos

import androidx.room.*
import com.daveloper.curriculumvitae.data.entities.Experience
import com.daveloper.curriculumvitae.data.entities.Skill

@Dao
interface ExperienceDao {
    @Query("SELECT * FROM experience ORDER BY endDate, startDate DESC")
    suspend fun getExperiencesOrdered(): List<Experience>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(experience: Experience)

    @Delete
    suspend fun delete(experience: Experience)
}