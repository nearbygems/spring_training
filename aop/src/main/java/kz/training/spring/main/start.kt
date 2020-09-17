package kz.training.spring.main

import kz.training.spring.objects.FileManager
import kz.training.spring.objects.FileManager2
import org.springframework.context.ApplicationContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {

  val context: ApplicationContext = ClassPathXmlApplicationContext("context.xml")
  val fileManager = context.getBean("fileManager") as FileManager
  val fileManager2 = context.getBean("fileManager2") as FileManager2

  fileManager.getExtensionCount("~/Documents")
  fileManager2.getExtensionCount("~/Documents")
  fileManager.getExtensionCount("~/Documents")
  fileManager.getExtensionList("~/Documents")

  (context as ConfigurableApplicationContext).close() // закрытие контекста вручную

}