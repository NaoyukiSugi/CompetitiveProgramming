package abc.abc007

import next

fun main() {
    val s = next()
    val result = if (s.length >= 2)
        s.dropLast(1)
    else {
        val c = s[0]
        if (c == 'a') "-1"
        else (c.toByte() - 1).toChar().toString()
    }
    println(result)
}
