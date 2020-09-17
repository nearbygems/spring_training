package kz.training.spring.impls.pool

import kz.training.spring.enums.ColorStyle
import kz.training.spring.interfaces.Robot
import kz.training.spring.qualifiers.RobotType
import org.springframework.beans.factory.annotation.Autowired

class T1000Pool {

  @Autowired
  @RobotType(sound = false, color = ColorStyle.BLACK)
  val blackRobot: Robot? = null

  @Autowired
  @RobotType(sound = true, color = ColorStyle.BLACK)
  val blackSoundableRobot: Robot? = null

  init {
    println("t1000 pool constructor()")
  }
}