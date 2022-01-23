package com.rahul.runningtracker.di

import android.app.Application
import androidx.room.Room
import com.rahul.runningtracker.database.RunningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RunningModule {

    @Provides
    @Singleton
    fun providesRunningDatabase(app : Application) : RunningDatabase =
        Room.databaseBuilder(app, RunningDatabase::class.java,"running_database").build()

    @Provides
    @Singleton
    fun provideRunningDao(db : RunningDatabase) = db.runningDao()
}