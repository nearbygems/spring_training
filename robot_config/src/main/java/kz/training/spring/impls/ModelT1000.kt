package kz.training.spring.impls

import kz.training.spring.interfaces.Hand
import kz.training.spring.interfaces.Head
import kz.training.spring.interfaces.Leg
import kz.training.spring.interfaces.Robot
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean

class ModelT1000 : Robot, InitializingBean, DisposableBean {
  var head: Head? = null
  var hand: Hand? = null
  var leg: Leg? = null
  var color: String? = null
  var year = 0
  var isSoundEnabled = false

  constructor(head: Head?, hand: Hand?, leg: Leg?) : super() {
    this.hand = hand
    this.leg = leg
    this.head = head
  }

  constructor(head: Head?, hand: Hand?, leg: Leg?, color: String?, year: Int, soundEnabled: Boolean) : super() {
    this.hand = hand
    this.leg = leg
    this.head = head
    this.color = color
    this.year = year
    this.isSoundEnabled = soundEnabled
  }

  constructor(color: String?, year: Int, soundEnabled: Boolean) : super() {
    this.color = color
    this.year = year
    this.isSoundEnabled = soundEnabled
  }

  override fun action() {
    head!!.calc()
    hand!!.catchSomething()
    leg!!.go()
    println("color: $color")
    println("year: $year")
    println("can play sound: $isSoundEnabled")
  }

  override fun dance() {
    println("T1000 is dancing!")
  }

  override fun destroy() {
    println("$this - method destroy()")
  }

  override fun afterPropertiesSet() {
    println("$this - method init()")
  }
}