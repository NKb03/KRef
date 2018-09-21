### KRef - Better support for java.lang.ref in Kotlin

#### Readonly reference delegates
##### Strong references
``
val int by strong(23)
``
##### Soft references
``
val int by soft(34)
``
##### Weak references 
``
val i by weak(45)
``

#### Read-Write reference delegates
##### Strong references
``
var int by mutableStrong(23)
``
##### Soft references
``
var int by mutableSoft(34)
``
##### Weak references 
``
var i by mutableWeak(45)
``

#### RefWrapper
Reference wrappers simplify changing the kind of reference to an object