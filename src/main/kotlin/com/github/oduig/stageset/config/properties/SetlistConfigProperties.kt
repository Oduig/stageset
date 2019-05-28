package com.github.oduig.stageset.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "setlist")
data class SetlistConfigProperties(
    var name: String? = null,
    var songs: List<Song> = emptyList()
)
