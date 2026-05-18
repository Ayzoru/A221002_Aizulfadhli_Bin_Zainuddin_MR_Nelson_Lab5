package com.example.A221002_Aizulfadhli_Bin_Zainuddin_MR_Nelson_Lab5

import android.app.Application
import com.example.A221002_Aizulfadhli_Bin_Zainuddin_MR_Nelson_Lab5.data.OfflineOrderRepository
import com.example.A221002_Aizulfadhli_Bin_Zainuddin_MR_Nelson_Lab5.data.OrderDatabase


class CupcakeApplication : Application() {
    val database: OrderDatabase by lazy { OrderDatabase.getDatabase(this) }
    val repository: OfflineOrderRepository by lazy { OfflineOrderRepository(database.orderDao()) }
}