package abc.abc011

import next

fun main() {
    var s = next()
    s = s.toLowerCase().let {
        it[0].toUpperCase() + it.substring(1)
    }
    println(s)
}
