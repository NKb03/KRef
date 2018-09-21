/**
 * @author Nikolaus Knop
 */

package org.nikok.kref

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * A mutable reference to an object of type [T]
*/
interface MutableRef<T>: Ref<T>, ReadWriteProperty<Any?, T?> {
    override var referent: T?

    override fun getValue(thisRef: Any?, property: KProperty<*>) = referent

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
        referent = value
    }
}