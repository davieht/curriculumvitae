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
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideCoroutineContext(): CoroutineContext = Dispatchers.IO
}