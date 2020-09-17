package kz.training.spring.impls.conveyor

import kz.training.spring.interfaces.Robot
import kz.training.spring.interfaces.RobotConveyor

abstract class T1000Conveyor : RobotConveyor {
  abstract override fun createRobot(): Robot?
}