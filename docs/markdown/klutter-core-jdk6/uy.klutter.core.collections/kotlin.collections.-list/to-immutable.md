[uy.klutter.core.collections](../index.md) / [kotlin.collections.List](index.md) / [toImmutable](.)


# toImmutable
<code>fun <T> List<T>.toImmutable(): List<T></code> [(source)](https://github.com/kohesive/klutter/blob/master/core-jdk6/src/main/kotlin/uy/klutter/core/common/Immutable.kt#L222)<br/>
Copies the List and then wraps with a lightweight delegating class that prevents casting back to mutable type,
specializing for the case of the RandomAccess marker interface being retained if it was there originally


