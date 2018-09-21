/**
 * @author Nikolaus Knop
 */

package org.nikok.kref

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * A reference to an object of type [T]
*/
interface Ref<out T> : ReadOnlyProperty<Any?, T?> {
    /**
     * The object referenced by this [Ref]
    */
    val referent: T?

    override fun getValue(thisRef: Any?, property: KProperty<*>): T? = referent
}