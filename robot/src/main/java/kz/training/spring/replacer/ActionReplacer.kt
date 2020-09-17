package kz.training.spring.replacer

import org.springframework.beans.factory.support.MethodReplacer
import java.lang.reflect.Method

class ActionReplacer : MethodReplacer {
  @Throws(Throwable::class)
  override fun reimplement(arg0: Any, arg1: Method, arg2: Array<Any>): Any? {
    println("new action!")
    return null
  }
}