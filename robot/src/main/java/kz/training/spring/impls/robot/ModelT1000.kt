package kz.training.spring.impls.robot

import kz.training.spring.abstracts.BaseModel
import kz.training.spring.enums.ColorStyle
import kz.training.spring.interfaces.Hand
import kz.training.spring.interfaces.Head
import kz.training.spring.interfaces.Leg
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component


@Component
class ModelT1000 : BaseModel, InitializingBean, DisposableBean {
  var color: ColorStyle? = null
  var year = 0
  var isSoundEnabled = false

  constructor() {}

  @Bean
  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  fun model1(): ModelT1000 {
    return ModelT1000()
  }

  @Bean
  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  fun model2(): ModelT1000 {
    return ModelT1000(ColorStyle.BLACK, 2005, true)
  }

  constructor(hand: Hand?, leg: Leg?, head: Head?, color: ColorStyle?, year: Int, soundEnabled: Boolean) {
    this.color = color
    this.year = year
    isSoundEnabled = soundEnabled
  }

  constructor(color: ColorStyle?, year: Int, soundEnabled: Boolean) {
    this.color = color
    this.year = year
    isSoundEnabled = soundEnabled
  }

  fun action() {
    head?.calc()
    hand?.catchSomething()
    leg?.go()
    println("color: $color")
    println("year: $year")
    println("can play sound: $isSoundEnabled")
    println()
  }

  fun dance() {
    println("T1000 is dancing!")
  }

  @Throws(Exception::class)
  override fun destroy() {
    println("$this - method destroy()")
  }

  @Throws(Exception::class)
  override fun afterPropertiesSet() {
    println("$this - method init()")
  }
}