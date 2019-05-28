package com.github.oduig.stageset.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "stageset")
data class StageSetConfigProperties(
    // These need to be nullable so Spring Boot can load them
    var slothDelayMs: Long? = null,
    var cors: CorsConfigProperties? = CorsConfigProperties(),
    var webClient: WebClientConfigProperties? = WebClientConfigProperties()
)
