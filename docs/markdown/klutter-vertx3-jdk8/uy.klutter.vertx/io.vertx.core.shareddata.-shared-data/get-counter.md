[uy.klutter.vertx](../index.md) / [io.vertx.core.shareddata.SharedData](index.md) / [getCounter](.)


# getCounter
<code>fun SharedData.getCounter(name: String): Promise<Counter, [Exception](http://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html)></code> [(source)](https://github.com/kohesive/klutter/blob/master/vertx3-jdk8/src/main/kotlin/uy/klutter/vertx/VertxSharedData.kt#L96)<br/>
Retrieve a vert.x cluster wide counter (see Vert.x SharedData class for more documentation)
This alias for [SharedData.promiseCounter(name)](#) and might be harder
to locate due to code completion favoring the built-in method of the same name.

### Parameters
`name` - of the counter

**Return**
Promise&lt;Counter, Exception&gt;


