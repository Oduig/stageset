package com.github.oduig.stageset.api

import com.github.oduig.stageset.config.properties.StageSetConfigProperties
import com.github.oduig.stageset.util.SoundSleeper
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class StarterServiceTest {

  private val starterConfigProperties = StageSetConfigProperties(slothDelayMs = 100)

  private var soundSleeperMock = mockk<SoundSleeper>()

  private val starterService = StarterService(starterConfigProperties, soundSleeperMock)

  @Test
  fun starterServiceTest() {
    // given
    givenSoundSleeperSleepsFor(100)

    // when
    starterService.waitForABit()

    // then
    thenSoundSleeperSlept()
  }

  private fun givenSoundSleeperSleepsFor(expectedSleepDuration: Long) {
    every { soundSleeperMock.sleep(expectedSleepDuration) } returns expectedSleepDuration
  }

  private fun thenSoundSleeperSlept() {
    verify { soundSleeperMock.sleep(any()) }
  }
}
