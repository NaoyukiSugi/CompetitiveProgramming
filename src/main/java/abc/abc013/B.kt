package abc.abc013

import nextInt
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val a = nextInt()
    val b = nextInt()
    val absNum = abs(a - b)
    val result = min(absNum, 10 - absNum)
    println(result)
}
