/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.Ref
import org.nikok.kref.RefType
import java.lang.ref.SoftReference

internal class SoftRef<T : Any>(value: T) : Ref<T> {
    private val softReference = SoftReference(value)

    override val referent: T?
        get() = softReference.get()

    override val type: RefType
        get() = RefType.Soft
}