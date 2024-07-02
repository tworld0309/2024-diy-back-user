package diy.user.data.entity

import jakarta.persistence.*

@Entity
data class UserEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String = ""
)