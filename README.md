# KRef - Better support for java.lang.ref in Kotlin

## Getting started
### Prerequisites
- You only need to have Kotlin and Java 1.8

### Installing
To install KRef you need to follow these steps:
- Clone the repository: `git clone https://github.com/NKB03/KRef <target_dir>`
- Build with gradle: `gradle build`
- Publish to maven local to make the library available for other projects: `gradle publishToMavenLocal`
- Open in IntelliJ or any other IDE   
If any errors occur while installing please feel free to create an issue or write me an e-mail.

### Running tests
To run the tests you IntelliJ and the Kotlin Spek Plugin.  
Just the `Spec` in package `org.nikok.kref` in the test source root and see the results.  
Testing via gradle is not supported.

## Contributing
Contributing is very much appreciated. Please feel free to suggest any improvements by creating an issue.  
If you have questions about the API or the internals just contact me via e-mail.

## Authors
- Nikolaus Knop (niko.knop003@gmail.com)

## The KRef API
### Readonly reference delegates
#### Strong references
``
val int by strong(23)
``
#### Soft references
``
val int by soft(34)
``
#### Weak references 
``
val i by weak(45)
``

### Read-Write reference delegates
#### Strong references
``
var int by mutableStrong(23)
``
#### Soft references
``
var int by mutableSoft(34)
``
#### Weak references 
``
var i by mutableWeak(45)
``

### RefWrapper
Reference wrappers simplify changing the kind of reference to an object
