package kz.training.spring.postprocessors

import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component
import kotlin.jvm.Throws

@Component
class MyBeanPostProcessor : BeanPostProcessor {

  @Throws(BeansException::class)
  override fun postProcessAfterInitialization(`object`: Any, name: String): Any {
    System.err.println("$`object` - postProcessAfterInitialization()")
    return `object`
  }

  @Throws(BeansException::class)
  override fun postProcessBeforeInitialization(`object`: Any, name: String): Any {
    return `object`
  }
}