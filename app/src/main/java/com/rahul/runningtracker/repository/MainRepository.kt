package com.rahul.runningtracker.repository

import com.rahul.runningtracker.database.RunningDao
import com.rahul.runningtracker.model.RanData
import javax.inject.Inject

class MainRepository @Inject constructor(
   private val dao : RunningDao
) {
    /** Running fragment functions *************************************************************/

    suspend fun insertRunningData(run : RanData) = dao.insertRun(run)

    suspend fun deleteRunningData(run : RanData) = dao.deleteRun(run)

    fun getAllRunsSortedByDate() = dao.getRunDataSortedByDate()

    fun getAllRunsSortedByDistance() = dao.getRunDataSortedByDistanceCovered()

    fun getAllRunsSortedByTimeInMillis() = dao.getRunDataSortedByTime()

    fun getAllRunsSortedByAvgSpeed() = dao.getRunDataSortedBySpeed()

    fun getAllRunsSortedByCaloriesBurned() = dao.getRunDataSortedByCalories()



    /** Statistics fragment functions *************************************************************/

    fun getTotalAvgSpeed() = dao.getTotalAverageSpeed()

    fun getTotalDistance() = dao.getTotalDistanceCovered()

    fun getTotalCaloriesBurned() = dao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = dao.getTotalRunTimeInMillis()

}