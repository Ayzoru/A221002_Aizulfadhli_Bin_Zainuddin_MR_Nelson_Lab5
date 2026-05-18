package com.example.A221002_Aizulfadhli_Bin_Zainuddin_MR_Nelson_Lab5.data


import kotlinx.coroutines.flow.Flow

interface OrderRepository {
    fun getAllOrdersStream(): Flow<List<OrderEntity>>
    suspend fun insertOrder(order: OrderEntity)
}

class OfflineOrderRepository(private val orderDao: OrderDao) : OrderRepository {
    override fun getAllOrdersStream(): Flow<List<OrderEntity>> = orderDao.getAllOrders()
    override suspend fun insertOrder(order: OrderEntity) {
        orderDao.insert(order)
    }
}