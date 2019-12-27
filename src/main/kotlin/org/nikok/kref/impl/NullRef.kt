package org.nikok.kref.impl

import org.nikok.kref.Ref
import org.nikok.kref.RefType

internal object NullRef : Ref<Nothing> {
    override val referent: Nothing?
        get() = null

    override val type: RefType
        get() = RefType.Null
}