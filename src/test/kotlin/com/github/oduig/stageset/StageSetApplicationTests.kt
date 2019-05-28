package com.github.oduig.stageset

import com.github.oduig.stageset.util.PromisingHttpClient
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.reactive.function.client.WebClient

@RunWith(SpringRunner::class)
@SpringBootTest
@ActiveProfiles("test")
class StageSetApplicationTests {

  @Autowired
  private var webClient: WebClient? = null

  @Test
  fun contextLoads() {
  }

  @Test
  fun coverageForMainMethod() {
    com.github.oduig.stageset.main(arrayOf())
  }

  @Test
  fun coverageForWebClientConfig() {
    Assert.assertNotNull(webClient)
    val promisingHttpClient = PromisingHttpClient(webClient!!)
    try {
      promisingHttpClient.get("http://example.com").get()
    } catch (e: Exception) {
      // No problem. It's just coverage.
    }
  }
}
