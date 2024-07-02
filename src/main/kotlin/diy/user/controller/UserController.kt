package diy.user.controller

import diy.user.data.dto.UserGetResDto
import diy.user.service.UserService
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.info.Info
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


@OpenAPIDefinition(info = Info(title = "사람 처리요청 API", description = "물품 처리요청 API", version = "v1"))
@RestController
@RequestMapping(value = ["user"])
@Slf4j
@RequiredArgsConstructor
@Validated
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @Operation(summary = "사람 조회", description = "물품 등록을 진행할 수 있다.", tags = ["addItem"])
    @RequestMapping(value = ["/users"], method = [RequestMethod.GET])
    fun getUserList(): ResponseEntity<List<UserGetResDto>> {
        return ResponseEntity.ok(userService.getUserList())

    }
}