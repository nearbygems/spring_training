package kz.training.spring.impls.toshiba

import kz.training.spring.interfaces.Leg

class ToshibaLeg : Leg {
  override fun go() {
    println("Go to Toshiba!")
  }
}