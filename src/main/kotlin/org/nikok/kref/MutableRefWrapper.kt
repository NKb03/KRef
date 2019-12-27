/**
 *@author Nikolaus Knop
 */

package org.nikok.kref

/**
 * A wrapper around a [MutableRef] which simplifies changing references dynamically
*/
class MutableRefWrapper<T : Any> internal constructor(var ref: MutableRef<T>) : MutableRef<T> {
    override var referent: T?
        get() = ref.referent
        set(value) {
            ref.referent = value
        }

    override val type: RefType
        get() = ref.type
}