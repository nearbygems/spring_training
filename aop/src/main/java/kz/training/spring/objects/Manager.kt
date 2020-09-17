package kz.training.spring.objects

interface Manager {
  fun getExtensionList(folder: String?): Set<String?>?
  fun getExtensionCount(folder: String?): Map<String?, Int?>?
}