package com.example.notification

import javax.persistence.*

@Entity
@Table(name= "noti")
data class NotiModel (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var noti_id: Long = 0,
    var user_id: Long? = 0,
    var title: String? = "",
    var content: String? = ""
)