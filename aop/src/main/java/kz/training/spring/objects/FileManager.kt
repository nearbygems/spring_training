package kz.training.spring.objects

import kz.training.spring.annotations.ShowResult
import org.springframework.stereotype.Component
import java.io.File
import java.io.FilenameFilter
import java.util.*


@Component
class FileManager : Manager {
  @ShowResult
  override fun getExtensionList(folder: String?): Set<String?>? {
    val dir = File(folder)
    val extList: MutableSet<String?> = TreeSet()
    for (fileName in dir.list()) {
      val file = File(dir.absolutePath + "\\" + fileName)
      val i = fileName.lastIndexOf(".")
      if (file.isFile && i != -1) {
        extList.add(fileName.substring(i + 1, fileName.length).toLowerCase())
      }
    }
    return extList
  }

  @ShowResult
  override fun getExtensionCount(folder: String?): Map<String?, Int?>? {
    val dir = File(folder)
    val map: MutableMap<String?, Int?> = HashMap()
    for (ext in getExtensionList(folder)!!) {
      val filter: FilenameFilter = CustomFileFilter(ext!!)
      map[ext] = dir.listFiles(filter).size
    }
    return map
  }
}
