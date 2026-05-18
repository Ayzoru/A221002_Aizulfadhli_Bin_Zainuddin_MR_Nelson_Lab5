package com.example.A221002_Aizulfadhli_Bin_Zainuddin_MR_Nelson_Lab5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cupcake_orders")
data class OrderEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val quantity: Int,
    val flavor: String,
    val date: String,
    val price: String
)