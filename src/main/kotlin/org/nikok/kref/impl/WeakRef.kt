/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.Ref
import org.nikok.kref.RefType
import java.lang.ref.WeakReference

internal class WeakRef<T : Any>(value: T) : Ref<T> {
    private val weakRef = WeakReference(value)

    override val referent: T? get() = weakRef.get()

    override val type: RefType
        get() = RefType.Weak
}