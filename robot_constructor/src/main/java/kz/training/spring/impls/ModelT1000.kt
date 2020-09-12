package kz.training.spring.impls

import kz.training.spring.interfaces.Hand
import kz.training.spring.interfaces.Head
import kz.training.spring.interfaces.Leg
import kz.training.spring.interfaces.Robot

class ModelT1000(
  private var head: Head?,
  private var hand: Hand?,
  private var leg: Leg?) : Robot {

  override fun action() {
    head?.calc()
    hand?.catchSomething()
    leg?.go()
  }

  override fun dance() {
    println("T1000 is dancing!")
  }

}