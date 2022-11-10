package com.financemain.port

import com.financemain.model.User

interface FinanceServicePort {
    fun insertUser(user: User): User
}