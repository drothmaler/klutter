[uy.klutter.vertx](../index.md) / [io.vertx.core.shareddata.SharedData](index.md) / [getLock](.)


# getLock
<code>fun SharedData.getLock(name: String): Promise<Lock, [Exception](http://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html)></code> [(source)](https://github.com/kohesive/klutter/blob/master/vertx3-jdk8/src/main/kotlin/uy/klutter/vertx/VertxSharedData.kt#L50)<br/>
Retrieve a vert.x cluster wide lock (see Vert.x SharedData class for more documentation)
This alias for [SharedData.promiseLock(name)](#) and might be harder
to locate due to code completion favoring the built-in method of the same name.

### Parameters
`name` - of the lock

**Return**
Promise&lt;Lock, Exception&gt;


