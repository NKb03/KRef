/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.Ref
import java.lang.ref.WeakReference

internal class WeakRef<T : Any>(value: T) : Ref<T> {
    private val weakRef = WeakReference(value)

    override val referent: T? get() = weakRef.get()
}