package kz.training.spring.main

import kz.training.spring.impls.ModelT1000
import org.springframework.context.ApplicationContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {
  val context: ApplicationContext = ClassPathXmlApplicationContext("all_context.xml")

  val t1000 = context.getBean("t1000") as ModelT1000
  t1000.action()

  val t1000Empty = context.getBean("t1000Empty") as ModelT1000
  t1000Empty.action()

  (context as ConfigurableApplicationContext).close()
}