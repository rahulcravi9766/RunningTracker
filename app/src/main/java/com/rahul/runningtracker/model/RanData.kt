package com.rahul.runningtracker.model

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_data")
data class RanData(
     var ranImage : Bitmap? = null,
     var timestamp: Long = 0L,
     var avgSpeedInKpH : Float = 0f,
     var distanceCoveredInMeter : Int = 0,
     var timeInMillis : Long = 0L,
     var caloriesBurned : Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null
}