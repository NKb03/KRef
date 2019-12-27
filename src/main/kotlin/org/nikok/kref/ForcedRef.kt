/**
 *@author Nikolaus Knop
 */

package org.nikok.kref

import kotlin.reflect.KProperty

/**
 * Getting the referent of a [ForcedRef] always returns a non-null value or throws an [IllegalStateException] if
 * the referent has already been garbage collected.
 */
class ForcedRef<T : Any> internal constructor(private val original: Ref<T>) : Ref<T> {
    override val referent: T get() = original.referent ?: error("Object already garbage collected")

    override val type: RefType
        get() = RefType.Forced

    override fun getValue(thisRef: Any?, property: KProperty<*>): T = referent
}