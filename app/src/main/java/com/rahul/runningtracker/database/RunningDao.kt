package com.rahul.runningtracker.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.rahul.runningtracker.model.RanData

@Dao
interface  RunningDao {

    /** Running fragment queries ****************************************************************
     *
     * some functions are not suspend because they are used for getting live data. As  live data is
     * already asynchronous
     */


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run : RanData)

    @Delete
    suspend fun deleteRun(run: RanData)

    @Query("SELECT * FROM running_data ORDER BY timestamp DESC")
    fun getRunDataSortedByDate(): LiveData<List<RanData>>

    @Query("SELECT * FROM running_data ORDER BY avgSpeedInKpH DESC")
    fun getRunDataSortedBySpeed(): LiveData<List<RanData>>

    @Query("SELECT * FROM running_data ORDER BY caloriesBurned DESC")
    fun getRunDataSortedByCalories(): LiveData<List<RanData>>

    @Query("SELECT * FROM running_data ORDER BY timeInMillis DESC")
    fun getRunDataSortedByTime(): LiveData<List<RanData>>

    @Query("SELECT * FROM running_data ORDER BY distanceCoveredInMeter DESC")
    fun getRunDataSortedByDistanceCovered(): LiveData<List<RanData>>


    /** Statistics fragment queries *************************************************************/

    @Query("SELECT SUM(timeInMillis) FROM running_data")
    fun getTotalRunTimeInMillis() : LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM running_data")
    fun getTotalCaloriesBurned() : LiveData<Int>

    @Query("SELECT SUM(distanceCoveredInMeter) FROM running_data")
    fun getTotalDistanceCovered() : LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKpH) FROM running_data")
    fun getTotalAverageSpeed() : LiveData<Float>
}