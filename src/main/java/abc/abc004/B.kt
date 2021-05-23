package abc.abc004

import next

fun main() {
    val c0 = next().split(" ")
    val c1 = next().split(" ")
    val c2 = next().split(" ")
    val c3 = next().split(" ")

    println(c3.reversed().joinToString(" "))
    println(c2.reversed().joinToString(" "))
    println(c1.reversed().joinToString(" "))
    println(c0.reversed().joinToString(" "))
}
