package com.rahul.runningtracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rahul.runningtracker.model.RanData

@Database(entities = [RanData::class], version = 1)
@TypeConverters
abstract class RunningDatabase : RoomDatabase(){

    abstract fun runningDao() : RunningDao
}