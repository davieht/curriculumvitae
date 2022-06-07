package com.daveloper.curriculumvitae.data.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.daveloper.curriculumvitae.data.entities.Language

@Dao
interface LanguageDao {

    @Query("SELECT * FROM language ORDER BY classification DESC")
    suspend fun getLanguagesOrdered(): List<Language>

    @Insert(onConflict = REPLACE)
    suspend fun upsert(language: Language)

    @Delete
    suspend fun delete(language: Language)
}