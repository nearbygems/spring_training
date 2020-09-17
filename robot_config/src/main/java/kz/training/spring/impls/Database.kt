package kz.training.spring.impls

class Database {
  private fun testConnection() {
    println("Test connection!")
  }

  init {
    testConnection()
  }
}