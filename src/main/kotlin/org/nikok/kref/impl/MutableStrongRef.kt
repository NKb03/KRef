/**
 *@author Nikolaus Knop
 */

package org.nikok.kref.impl

import org.nikok.kref.MutableRef

internal class MutableStrongRef<T>(override var referent: T?) : MutableRef<T> {}