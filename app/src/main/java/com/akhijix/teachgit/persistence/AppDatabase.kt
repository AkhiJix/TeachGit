package com.akhijix.teachgit.persistence

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase
import com.akhijix.teachgit.persistence.dao.ItemDao


@Entity
data class User(
    @PrimaryKey val id : Int,
    val firstName : String?,
    val lastName : String?
)


@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getItemDao() : ItemDao
}