package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
open class SuperMethod {
    open fun func() {}
}

@Suppress("unused")
class ChildMethod : SuperMethod() {
    // A member marked override is itself open, i.e. it may be overridden in subclasses.
    // If you want to prohibit re-overriding, use final
    final override fun func() {}
}