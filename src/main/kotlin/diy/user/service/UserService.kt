package diy.user.service

import diy.user.data.UserRepository
import diy.user.data.dto.UserGetResDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    fun getUserList(): List<UserGetResDto> {
        val user = userRepository.findAll();
        return user.map { UserGetResDto.toDto(it) }

    }
}