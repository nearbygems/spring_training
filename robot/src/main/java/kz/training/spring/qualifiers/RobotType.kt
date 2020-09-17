package kz.training.spring.qualifiers

import kz.training.spring.enums.ColorStyle
import org.springframework.beans.factory.annotation.Qualifier

@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class RobotType(val color: ColorStyle, val sound: Boolean)