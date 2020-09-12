package kz.training.spring.impls.sony

import kz.training.spring.interfaces.Leg

class SonyLeg : Leg {
  override fun go() {
    println("Go to Sony!")
  }
}