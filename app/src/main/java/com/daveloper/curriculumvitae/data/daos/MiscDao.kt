package com.daveloper.curriculumvitae.data.daos

import androidx.room.*
import com.daveloper.curriculumvitae.data.entities.Misc

@Dao
interface MiscDao {
    @Query("SELECT * FROM misc")
    suspend fun getMiscs(): List<Misc>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(misc: Misc)

    @Delete
    suspend fun delete(misc: Misc)
}