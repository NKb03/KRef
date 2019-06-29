/**
 *@author Nikolaus Knop
 */

package org.nikok.kref

/**
 * Getting the referent of a [ForcedRef] always returns a non-null value or throws an [IllegalStateException] if
 * the referent has already been garbage collected.
 */
class ForcedRef<T : Any> internal constructor(private val original: Ref<T>) : Ref<T> {
    override val referent: T get() = original.referent ?: error("Object already garbage collected")
}