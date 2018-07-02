package com.sunu.demo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "demo.info")
class DemoConfig{
    var codeA : String = ""
    var codeB : String = ""
}