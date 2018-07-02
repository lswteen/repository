package com.sunu.demo.service.impl

import com.sunu.demo.domain.HttpExternalRequest
import com.sunu.demo.service.DemoService
import org.apache.catalina.User
import org.springframework.stereotype.Service

@Service
class DemoServiceImpl : DemoService{

    override
    fun getUser(httpExternalRequest: HttpExternalRequest): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override
    fun insertUser(user: User): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override
    fun updateUser(user: User): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override
    fun deleteUser(userId: Long): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}