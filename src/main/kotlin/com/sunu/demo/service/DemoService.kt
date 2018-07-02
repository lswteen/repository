package com.sunu.demo.service

import com.sunu.demo.domain.HttpExternalRequest
import org.apache.catalina.User


open interface DemoService {
    fun getUser(httpExternalRequest: HttpExternalRequest): User
    fun insertUser(user: User): Boolean
    fun updateUser(user: User): Boolean
    fun deleteUser(userId: Long): Boolean
}
