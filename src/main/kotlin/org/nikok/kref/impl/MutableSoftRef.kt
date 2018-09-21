/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.MutableRef
import java.lang.ref.SoftReference

internal class MutableSoftRef<T>(value: T) : MutableRef<T> {
    private var softReference = SoftReference(value)

    override var referent: T?
        get() = softReference.get()
        set(value) {
            softReference = SoftReference(value)
        }
}