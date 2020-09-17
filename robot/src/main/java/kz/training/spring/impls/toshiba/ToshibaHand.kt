package kz.training.spring.impls.toshiba

import kz.training.spring.interfaces.Hand
import org.springframework.stereotype.Component

@Component
class ToshibaHand : Hand {
  override fun catchSomething() {
    println("Catched from Toshiba!")
  }
}