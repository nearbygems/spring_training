package kz.training.spring.impls.sony

import kz.training.spring.interfaces.Hand

class SonyHand : Hand {
  override fun catchSomething() {
    println("Catched from Sony!!")
  }
}