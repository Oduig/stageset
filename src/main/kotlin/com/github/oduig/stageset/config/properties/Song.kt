package com.github.oduig.stageset.config.properties

data class Song(
    var name: String? = null,
    var guitarLeft: TunableInstrument? = null,
    var guitarRight: TunableInstrument? = null,
    var bass: TunableInstrument? = null
)
