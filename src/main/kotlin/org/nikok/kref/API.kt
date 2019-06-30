/**
 * @author Nikolaus Knop
 */

package org.nikok.kref

import org.nikok.kref.impl.*
import java.lang.ref.SoftReference
import java.lang.ref.WeakReference

/**
 * @return a property delegate holding a [WeakReference] to [referent]
*/
fun <T : Any> weak(referent: T): Ref<T> = WeakRef(referent)

/**
 * @return a property delegate holding a [SoftReference] to [referent]
 */

fun <T : Any> soft(referent: T): Ref<T> = SoftRef(referent)

/**
 * @return a property delegate holding a strong reference to [referent]
 */

fun <T : Any> strong(referent: T): Ref<T> = StrongRef(referent)

/**
 * @return a property delegate holding a [WeakReference] to [referent]
 */
fun <T : Any> mutableWeak(referent: T): MutableRef<T> = MutableWeakRef(referent)

/**
 * @return a property delegate holding a [SoftReference] to [referent]
 */

fun <T : Any> mutableSoft(referent: T): MutableRef<T> = MutableSoftRef(referent)

/**
 * @return a property delegate holding a strong reference to [referent]
 */

fun <T : Any> mutableStrong(referent: T): MutableRef<T> = MutableSoftRef(referent)

/**
 * @return a [RefWrapper] wrapping [ref]
*/
fun <T : Any> wrapper(ref: Ref<T>): RefWrapper<T> = RefWrapper(ref)

/**
 * @return a [MutableRefWrapper] wrapping [ref]
*/
fun <T : Any> mutableWrapper(ref: MutableRef<T>) = MutableRefWrapper(ref)

/**
 * @return a [Cache] computing the given [initializer]
 */
fun <T : Any> cached(initializer: () -> T) = Cache(initializer)

/**
 * @return a [ForcedRef] wrapping this Ref
 */
fun <T : Any> Ref<T>.forced(): ForcedRef<T> = ForcedRef(this)

/**
 * @return a [ForcedRef] wrapping the given [referent]
 */
fun <T : Any> forcedWeak(referent: T): ForcedRef<T> = weak(referent).forced()