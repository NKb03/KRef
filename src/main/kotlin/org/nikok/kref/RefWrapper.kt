/**
 *@author Nikolaus Knop
 */

package org.nikok.kref

/**
 * A wrapper around a [Ref] which simplifies swapping references dynamically
*/
class RefWrapper<T> internal constructor(var ref: Ref<T>): Ref<T> {
    override val referent: T? get() = ref.referent
}