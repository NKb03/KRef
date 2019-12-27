/**
 * @author Nikolaus Knop
 */

package org.nikok.kref

/**
 * Represents the type of a reference, either weak, strong or forced
 */
enum class RefType {
    Weak, Strong, Soft, Forced, Null
}