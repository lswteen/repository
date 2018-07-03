package com.sunu.demo.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.validation.constraints.NotEmpty

class User(userName: String){
    constructor(userName: String, userId: Long) : this(userName) {}
    constructor(userName: String, userId: Long, userNickName: String) : this(userName,userId) {}

    @NotEmpty
    val userName : String = ""

    @NotEmpty
    val userId : Long = 0

    @NotEmpty
    @JsonIgnore
    val userNickName : String = ""

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "User(userName='$userName', userId=$userId, userNickName='$userNickName')"
    }

}