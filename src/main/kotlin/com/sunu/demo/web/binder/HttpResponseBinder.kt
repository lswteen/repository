package com.sunu.demo.web.binder

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

object HttpResponseBinder{
    fun toResponseEntity(code: HttpStatus): ResponseEntity<*>{
        return ResponseEntity(code.reasonPhrase, code);
    }

    fun <T> toResponseEntity(code: HttpStatus, payload: T): ResponseEntity<T>{
        return ResponseEntity(payload,code)
    }
}