package kz.training.spring.logging

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Component
@Aspect
class MyLogger {
  @Pointcut("execution(* kz.training.spring.aop.objects.Manager.*(..))")
  private fun allMethods() {
  }

  @Around("allMethods() && execution(java.util.Map *(..))")
  fun watchTime(joinpoint: ProceedingJoinPoint): Any? {
    val start = System.currentTimeMillis()
    println("method begin: " + joinpoint.signature.toShortString() + " >>")
    var output: Any? = null
    for (`object` in joinpoint.args) {
      println("Param : $`object`")
    }
    try {
      output = joinpoint.proceed(arrayOf<Any>("c:\\eclipse"))
    } catch (e: Throwable) {
      e.printStackTrace()
    }
    val time = System.currentTimeMillis() - start
    println("method end: " + joinpoint.signature.toShortString() + ", time=" + time + " ms <<")
    return output
  }

  @AfterReturning(pointcut = "allMethods() && execution(java.util.Map *(String)) && args(folder)", returning = "obj")
  fun printMap(obj: Any, folder: String) {
    println("Printing map >>")
    println("Folder = $folder")
    val map = obj as Map<*, *>
    for (`object` in map.keys) {
      println("key=" + `object` + ", " + map[`object`])
    }
    println("End printing map <<")
    println()
  }

  @AfterReturning(pointcut = "allMethods() && execution(java.util.Set *(String)) && args(folder)", returning = "obj")
  fun printSet(obj: Any, folder: String) {
    println("Printing set >>")
    println("Folder = $folder")
    val set = obj as Set<*>
    for (`object` in set) {
      println(`object`)
    }
    println("End printing set <<")
    println()
  }
}
