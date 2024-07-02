package diy.user.data.dto

import diy.user.data.entity.UserEntity

data class UserGetResDto (
    val id: Long,
    val name: String
) {
    companion object {
        fun toDto(userEntity: UserEntity): UserGetResDto {
            return UserGetResDto(userEntity.id, userEntity.name)
        }
    }
}