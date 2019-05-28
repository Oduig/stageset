package com.github.oduig.stageset.util

/**
 * An alternative, more convenient interface for iteration
 */
fun <T> Collection<T>.enumerate(): Enumerator<T> {
  return Enumerator(this.iterator())
}
