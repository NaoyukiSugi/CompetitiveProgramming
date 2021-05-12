package abc.abc199

import nextIntList

fun main() {
    val (a, b, c) = nextIntList()
    if (a * a + b * b < c * c) {
        println("Yes")
    } else {
        println("No")
    }
}
