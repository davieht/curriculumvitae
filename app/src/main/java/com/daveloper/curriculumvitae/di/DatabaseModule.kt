package com.daveloper.curriculumvitae.di

import android.content.Context
import androidx.room.Room
import com.daveloper.curriculumvitae.data.CvDatabase
import com.daveloper.curriculumvitae.data.daos.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): CvDatabase =
        Room.databaseBuilder(
            appContext,
            CvDatabase::class.java,
            CvDatabase.DATABASE_NAME
        ).build()

    @Provides
    fun provideEducationDao(appDatabase: CvDatabase): EducationDao =
        appDatabase.educationDao

    @Provides
    fun provideExperienceDao(appDatabase: CvDatabase): ExperienceDao =
        appDatabase.experienceDao

    @Provides
    fun provideLanguageDao(appDatabase: CvDatabase): LanguageDao =
        appDatabase.languageDao

    @Provides
    fun provideMiscDao(appDatabase: CvDatabase): MiscDao =
        appDatabase.miscDao

    @Provides
    fun provideProfileDao(appDatabase: CvDatabase): ProfileDao =
        appDatabase.profileDao

    @Provides
    fun provideSkillDao(appDatabase: CvDatabase): SkillDao =
        appDatabase.skillDao
}