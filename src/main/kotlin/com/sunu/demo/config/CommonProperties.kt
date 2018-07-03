package com.sunu.demo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "demo.info")
object CommonProperties{
    val codeA: String = ""
    val codeB: String = ""
}