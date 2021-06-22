package com.example.notification

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Repository
interface NotiRepository : JpaRepository<NotiModel, Long>{
    @Query("SELECT * FROM noti ORDER BY user_id", nativeQuery = true)
    fun sortByUserId(): List<NotiModel>
}
