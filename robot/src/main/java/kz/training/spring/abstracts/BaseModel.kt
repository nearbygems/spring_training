package kz.training.spring.abstracts

import kz.training.spring.interfaces.Hand
import kz.training.spring.interfaces.Head
import kz.training.spring.interfaces.Leg
import org.springframework.beans.factory.annotation.Autowired
import java.awt.Robot

abstract class BaseModel : Robot() {

  @Autowired
  var hand: Hand? = null

  @Autowired
  var leg: Leg? = null

  @Autowired
  var head: Head? = null

  init {
    println("$this - BaseModel constructor()")
  }
}
