package com.daveloper.curriculumvitae.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.daveloper.curriculumvitae.data.entities.Profile

@Dao
interface ProfileDao {
    @Query("SELECT * FROM profile LIMIT 1")
    suspend fun getProfile(): Profile

    @Insert(onConflict = REPLACE)
    suspend fun upsert(profile: Profile)
}