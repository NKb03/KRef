/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.Ref
import java.lang.ref.SoftReference

internal class SoftRef<T : Any>(value: T) : Ref<T> {
    private val softReference = SoftReference(value)

    override val referent: T?
        get() = softReference.get()
}