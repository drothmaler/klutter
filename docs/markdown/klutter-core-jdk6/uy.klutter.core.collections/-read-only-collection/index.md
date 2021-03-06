[uy.klutter.core.collections](../index.md) / [ReadOnlyCollection](.)


# ReadOnlyCollection
<code>class ReadOnlyCollection<T> : Collection<T>, [ReadOnly](../-read-only.md), [Serializable](http://docs.oracle.com/javase/6/docs/api/java/io/Serializable.html)</code> [(source)](https://github.com/kohesive/klutter/blob/master/core-jdk6/src/main/kotlin/uy/klutter/core/common/Immutable.kt#L34)<br/>
Wraps a Collection with a lightweight delegating class that prevents casting back to mutable type



### Constructors

|&nbsp;|&nbsp;|
|---|---|
| [&lt;init&gt;](-init-.md) | <code>ReadOnlyCollection(delegate: Collection<T>)</code><br/>Wraps a Collection with a lightweight delegating class that prevents casting back to mutable type |

### Functions

|&nbsp;|&nbsp;|
|---|---|
| [equals](equals.md) | <code>fun equals(other: Any?): Boolean</code><br/> |
| [hashCode](hash-code.md) | <code>fun hashCode(): Int</code><br/> |
| [iterator](iterator.md) | <code>fun iterator(): Iterator<T></code><br/> |
| [toString](to-string.md) | <code>fun toString(): String</code><br/> |

### Companion Object Properties

|&nbsp;|&nbsp;|
|---|---|
| [serialVersionUID](serial-version-u-i-d.md) | <code>val serialVersionUID: Long</code><br/> |

### Extension Functions

|&nbsp;|&nbsp;|
|---|---|
| [asReadOnly](../kotlin.collections.-collection/as-read-only.md) | <code>fun <T> Collection<T>.asReadOnly(): Collection<T></code><br/>Wraps the Collection with a lightweight delegating class that prevents casting back to mutable type |
| [batch](../kotlin.collections.-iterable/batch.md) | <code>fun <T> Iterable<T>.batch(n: Int): <ERROR CLASS><List<T>></code><br/>Batch a sequence into a sequence of lists of max N size<code>fun <T> Iterable<T>.batch(n: Int, forEachDo: (List<T>) -> Unit): Unit</code><br/>Batch a sequence into a sequence of lists of max N size, and execute a lambda for each group |
| [lazyBatch](../kotlin.collections.-iterable/lazy-batch.md) | <code>fun <T> Iterable<T>.lazyBatch(n: Int, forEachDo: (<ERROR CLASS><T>) -> Unit): Unit</code><br/>A purely Lazy batch must have the source consumed to progress, but does not need to materialize a list per iteration<br/>So, for purely lazy we only allow basically forEach when completely lazy |
| [whenAllNotNull](../../uy.klutter.core.common/kotlin.collections.-collection/when-all-not-null.md) | <code>fun <T : Any, R : Any> Collection<T?>.whenAllNotNull(block: (List<T>) -> R): Unit</code><br/> |
| [whenAnyNotNull](../../uy.klutter.core.common/kotlin.collections.-collection/when-any-not-null.md) | <code>fun <T : Any, R : Any> Collection<T?>.whenAnyNotNull(block: (List<T>) -> R): Unit</code><br/> |
