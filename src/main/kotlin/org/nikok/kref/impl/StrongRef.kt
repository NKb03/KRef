/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.Ref
import org.nikok.kref.RefType

internal class StrongRef<T : Any>(override val referent: T) : Ref<T> {
    override val type: RefType
        get() = RefType.Strong
}