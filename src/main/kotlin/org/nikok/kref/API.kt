/**
 * @author Nikolaus Knop
 */

package org.nikok.kref

import org.nikok.kref.impl.MutableSoftRef
import org.nikok.kref.impl.MutableWeakRef
import org.nikok.kref.impl.SoftRef
import org.nikok.kref.impl.WeakRef
import java.lang.ref.SoftReference
import java.lang.ref.WeakReference

/**
 * @return a property delegate holding a [WeakReference] to [referent]
*/
fun <T> weak(referent: T): Ref<T> = WeakRef(referent)

/**
 * @return a property delegate holding a [SoftReference] to [referent]
 */

fun <T> soft(referent: T): Ref<T> = SoftRef(referent)

/**
 * @return a property delegate holding a strong reference to [referent]
 */

fun <T> strong(referent: T): Ref<T> = SoftRef(referent)

/**
 * @return a property delegate holding a [WeakReference] to [referent]
 */
fun <T> mutableWeak(referent: T): MutableRef<T> = MutableWeakRef(referent)

/**
 * @return a property delegate holding a [SoftReference] to [referent]
 */

fun <T> mutableSoft(referent: T): MutableRef<T> = MutableSoftRef(referent)

/**
 * @return a property delegate holding a strong reference to [referent]
 */

fun <T> mutableStrong(referent: T): MutableRef<T> = MutableSoftRef(referent)

/**
 * @return a [RefWrapper] wrapping [ref]
*/
fun <T> wrapper(ref: Ref<T>): RefWrapper<T> = RefWrapper(ref)

/**
 * @return a [MutableRefWrapper] wrapping [ref]
*/
fun <T> mutableWrapper(ref: MutableRef<T>) = MutableRefWrapper(ref)