package kz.training.spring.impls.toshiba

import kz.training.spring.interfaces.Head
import org.springframework.stereotype.Component

@Component
class ToshibaHead : Head {
  override fun calc() {
    println("Thinking about Toshiba...")
  }
}