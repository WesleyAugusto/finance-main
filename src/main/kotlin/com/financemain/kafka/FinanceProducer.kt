package com.financemain.kafka

import com.financemain.model.User
import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.context.annotation.Factory

@KafkaClient
@Factory
interface FinanceProducer {

    @Topic("insertFinance")
    fun sendMessage(@KafkaKey key:String, user:User)
}