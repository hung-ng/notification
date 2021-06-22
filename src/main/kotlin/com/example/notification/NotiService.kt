package com.example.notification

import org.aspectj.weaver.ast.Not
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Service

@Service
class NotiService(private val NotiRepository: NotiRepository) {

    fun getAllNoti(): List<NotiModel> = NotiRepository.findAll()

    fun sortByUserId(): List<NotiModel> = NotiRepository.sortByUserId()

    fun createNoti(Noti: NotiModel): NotiModel = NotiRepository.save(Noti)

}