package com.akhijix.teachgit.dependencies

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.akhijix.teachgit.persistence.AppDatabase
import dagger.Provides
import javax.inject.Singleton

class StorageModule {
    @Provides
    @Singleton
    fun providesRoomDB(context : Context) : RoomDatabase{
        return Room.databaseBuilder(context,AppDatabase::class.java, "app.db").build()
    }
}