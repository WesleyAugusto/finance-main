package com.financemain.controller

import com.financemain.model.User
import com.financemain.port.FinanceServicePort
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/user")
class FinanceController(private val financeServicePort: FinanceServicePort) {

    @Post("/")
    fun insertUser(@Body user: User):User{
        return financeServicePort.insertUser(user)


    }
}