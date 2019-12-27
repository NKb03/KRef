/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.MutableRef
import org.nikok.kref.RefType

internal class MutableStrongRef<T : Any>(override var referent: T?) : MutableRef<T> {
    override val type: RefType
        get() = RefType.Strong
}