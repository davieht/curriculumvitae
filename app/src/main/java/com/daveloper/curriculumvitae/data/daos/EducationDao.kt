package com.daveloper.curriculumvitae.data.daos

import androidx.room.*
import com.daveloper.curriculumvitae.data.entities.Education
import com.daveloper.curriculumvitae.data.entities.Skill

@Dao
interface EducationDao {

    @Query("SELECT * FROM education ORDER BY endDate, startDate DESC")
    suspend fun getEducationsOrdered(): List<Education>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(education: Education)

    @Delete
    suspend fun delete(education: Education)
}