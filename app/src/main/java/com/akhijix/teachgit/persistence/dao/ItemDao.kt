package com.akhijix.teachgit.persistence.dao

import androidx.room.Insert

interface ItemDao {
    @Insert
    fun addItem(input : String){
        fun addItem()
    }
}