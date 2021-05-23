package abc.abc002

import next

fun main() {
    val w = next()
    val result = w.replace(Regex("[aiueo]"), "")

    println(result)
}
