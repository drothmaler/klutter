package uy.klutter.reflect.conversion.jdk7

import uy.klutter.reflect.conversion.SelfRegisteringConverters
import uy.klutter.reflect.conversion.TypeConverters
import uy.klutter.reflect.isAssignableFrom
import java.lang.reflect.Type
import java.nio.file.Path
import java.nio.file.Paths

public class RegisterJdk7Converters: SelfRegisteringConverters {
    override fun registerInto(conversion: TypeConverters) {
        conversion.register(fun (fromType: Type, toType: Type):Boolean {
            return when {
                String::class.isAssignableFrom(fromType) -> when (toType) {
                    Path::class.java -> true
                    else -> false
                }
                fromType == Path::class.java -> when (toType) {
                    String::class.java -> true
                    else -> false
                }
                else -> false
            }
        }, fun TypeConverters.ExactConverter.(value: Any): Any {
            return  when (value) {
                is String -> when (toType) {
                    Path::class.java -> Paths.get(value)
                    else ->  throw IllegalStateException("Invalid String conversion for ${fromType} to ${toType}")
                }
                is Path -> when (toType) {
                    String::class.java -> value.toString()
                    else ->  throw IllegalStateException("Invalid Path conversion for ${fromType} to ${toType}")
                }
                else -> throw IllegalStateException("Cannot convert ${fromType} to ${toType}")
            }
        })
    }

}

