package com.example.A221002_Aizulfadhli_Bin_Zainuddin_MR_Nelson_Lab5.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(order: OrderEntity)

    @Query("SELECT * FROM cupcake_orders ORDER BY id DESC")
    fun getAllOrders(): Flow<List<OrderEntity>>
}