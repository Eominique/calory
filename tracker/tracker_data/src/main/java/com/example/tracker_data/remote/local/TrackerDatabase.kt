package com.example.tracker_data.remote.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tracker_data.remote.local.entity.TrackedFoodEntity
import com.example.tracker_data.remote.local.entity.TrackerDao

@Database(
    entities = [TrackedFoodEntity::class],
    version = 1
)
abstract class TrackerDatabase: RoomDatabase() {

    abstract val dao: TrackerDao
}