/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.Ref

internal class StrongRef<T : Any>(override val referent: T) : Ref<T>