package com.github.oduig.stageset.config

import com.github.oduig.stageset.config.properties.StageSetConfigProperties
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class ConfigChecker(private val stageSetConfigProperties: StageSetConfigProperties) {

  @EventListener(ApplicationReadyEvent::class)
  fun checkConfig() {
    // Perform a basic check to make sure the configuration is loaded on startup
    requireNotNull(stageSetConfigProperties.cors)
  }
}
