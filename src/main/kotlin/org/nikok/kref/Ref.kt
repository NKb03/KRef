/**
 * @author Nikolaus Knop
 */

package org.nikok.kref

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * A reference to an object of type [T]
*/
interface Ref<out T : Any> : ReadOnlyProperty<Any?, T?> {
    /**
     * The object referenced by this [Ref]
     */
    val referent: T?

    /**
     * The type of reference this object holds
     */
    val type: RefType

    override fun getValue(thisRef: Any?, property: KProperty<*>): T? = referent
}