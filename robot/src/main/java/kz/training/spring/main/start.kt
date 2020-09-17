package kz.training.spring.main

import kz.training.spring.impls.robot.ModelT1000
import org.springframework.context.ApplicationContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
  val context: ApplicationContext = ClassPathXmlApplicationContext("all_context.xml")
  val model1: ModelT1000 = context.getBean("model1") as ModelT1000
  val model2: ModelT1000 = context.getBean("model2") as ModelT1000
  model1.action()
  model2.action()
  (context as ConfigurableApplicationContext).close()
}