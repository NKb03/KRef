/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.MutableRef

internal class MutableStrongRef<T : Any>(override var referent: T?) : MutableRef<T>