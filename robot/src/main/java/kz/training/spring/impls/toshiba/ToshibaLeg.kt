package kz.training.spring.impls.toshiba

import kz.training.spring.interfaces.Leg
import org.springframework.stereotype.Component

@Component
class ToshibaLeg : Leg {
  override fun go() {
    println("Go to Toshiba!")
  }
}