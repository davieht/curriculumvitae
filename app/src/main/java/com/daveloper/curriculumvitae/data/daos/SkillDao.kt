package com.daveloper.curriculumvitae.data.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.daveloper.curriculumvitae.data.entities.Skill

@Dao
interface SkillDao {
    @Query("SELECT * FROM skill")
    suspend fun getSkills(): List<Skill>

    @Insert(onConflict = REPLACE)
    suspend fun upsert(skill: Skill)

    @Delete
    suspend fun delete(skill: Skill)
}