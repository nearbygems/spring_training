package kz.training.spring

import kz.training.spring.impls.ModelT1000
import org.springframework.context.ApplicationContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
  val context: ApplicationContext = ClassPathXmlApplicationContext("context.xml")
  val t1000: ModelT1000 = context.getBean("t1000") as ModelT1000
  t1000.action()
  (context as ConfigurableApplicationContext).close() // закрытие контекста вручную
}