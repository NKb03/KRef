package org.nikok.kref.impl

import org.nikok.kref.Ref

object NullRef: Ref<Nothing> {
    override val referent: Nothing?
        get() = null
}