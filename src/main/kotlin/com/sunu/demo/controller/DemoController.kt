package com.sunu.demo.controller


import com.sunu.demo.domain.HttpExternalRequest
import com.sunu.demo.domain.User
import com.sunu.demo.web.binder.HttpResponseBinder
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class DemoController{

    @Autowired
    commonProperties: Co

    @RequestMapping("/getDemo",method= arrayOf(RequestMethod.GET))
    fun getDemo(httpRequest: HttpExternalRequest): ResponseEntity<*>?{
        return null
    }

    //@RequestMapping(value="/user", method= arrayOf(RequestMethod.GET))
    @GetMapping("/user")
    fun getUser(httpRequest: HttpExternalRequest): ResponseEntity<*>{

        return HttpResponseBinder.toResponseEntity(HttpStatus.OK,"getUser")
    }

    @RequestMapping(value="/user", method = arrayOf(RequestMethod.POST))
    fun createUser(httpRequest: HttpExternalRequest): ResponseEntity<*>{
        return HttpResponseBinder.toResponseEntity(HttpStatus.OK,"createUser")
    }

    @RequestMapping(value="/user", method= arrayOf(RequestMethod.PUT))
    fun modifyUser(httpRequest: HttpExternalRequest): ResponseEntity<*>{
        return HttpResponseBinder.toResponseEntity(HttpStatus.OK,"modifyUser")
    }

    @RequestMapping(value="/user", method= arrayOf(RequestMethod.DELETE))
    fun removeUser(httpRequest: HttpExternalRequest): ResponseEntity<*>{
        return HttpResponseBinder.toResponseEntity(HttpStatus.OK,"removeUser")
    }

}