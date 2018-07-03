package com.sunu.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class DemoApplication : SpringBootServletInitializer(),CommandLineRunner {
    override fun run(vararg args: String?) {
        // 최초 시작단계에서 실행할 내용 보통 cache처리시
    }
}

fun main(args: Array<String>){
    val runApplication = runApplication<DemoApplication>(*args)
}


