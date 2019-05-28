package com.github.oduig.stageset.api

import com.github.oduig.stageset.config.properties.StageSetConfigProperties
import com.github.oduig.stageset.util.SoundSleeper
import org.springframework.stereotype.Service

@Service
class StarterService(private val stageSetConfigProperties: StageSetConfigProperties,
                     private val soundSleeper: SoundSleeper) {

  fun waitForABit() {
    soundSleeper.sleep(stageSetConfigProperties.slothDelayMs!!)
  }
}
