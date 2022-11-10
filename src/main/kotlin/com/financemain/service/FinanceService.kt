package com.financemain.service

import com.financemain.kafka.FinanceProducer
import com.financemain.model.User
import com.financemain.port.FinanceServicePort
import jakarta.inject.Singleton

@Singleton
class FinanceService(private val financeProducer: FinanceProducer):FinanceServicePort {
    override fun insertUser(user: User): User {
        financeProducer.sendMessage(user.name, user)
        return user
    }

}