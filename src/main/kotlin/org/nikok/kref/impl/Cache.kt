/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import kotlin.reflect.KProperty

/**
 * A lazy and weak cache that only computes the value when it was not computed before or was garbage collected.
 * Note that the cache holds a strong reference to the given [initializer]!
 */
class Cache<T : Any>(private val initializer: () -> T) {
    private var value: T? = null

    fun get(): T {
        value?.let { return it }
        return initializer().also { value = it }
    }

    operator fun getValue(receiver: Any?, property: KProperty<*>) = get()
}