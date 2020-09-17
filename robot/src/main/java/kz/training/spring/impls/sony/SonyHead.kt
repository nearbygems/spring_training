package kz.training.spring.impls.sony

import kz.training.spring.interfaces.Head

class SonyHead(
  var color: String?) : Head {

  override fun calc() {
    println("Thinking about Sony...")
  }
}