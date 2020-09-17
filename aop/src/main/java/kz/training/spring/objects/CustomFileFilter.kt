package kz.training.spring.objects

import java.io.File
import java.io.FilenameFilter

class CustomFileFilter(private val extension: String) : FilenameFilter {
  override fun accept(file: File, name: String): Boolean {
    return name.toUpperCase().endsWith("." + extension.toUpperCase())
  }
}