/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.MutableRef
import java.lang.ref.WeakReference

internal class MutableWeakRef<T : Any>(value: T) : MutableRef<T> {
    private var weakReference = WeakReference(value)

    override var referent: T?
        get() = weakReference.get()
        set(value) {
            weakReference = WeakReference(value)
        }
}