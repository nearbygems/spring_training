package kz.training.spring.main

import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor

class MyBeanPostProcessor : BeanPostProcessor {
  @Throws(BeansException::class)
  override fun postProcessAfterInitialization(`object`: Any, name: String): Any {
    return `object`
  }

  @Throws(BeansException::class)
  override fun postProcessBeforeInitialization(`object`: Any, name: String): Any {
    println("$`object` - postProcessBeforeInitialization()")
    return `object`
  }
}