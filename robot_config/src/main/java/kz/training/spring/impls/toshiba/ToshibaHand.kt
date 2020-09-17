package kz.training.spring.impls.toshiba

import kz.training.spring.interfaces.Hand

class ToshibaHand : Hand {
  override fun catchSomething() {
    println("Catched from Toshiba!")
  }
}