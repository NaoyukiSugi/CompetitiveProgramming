package abc.abc014

import nextInt

fun main() {
    val a = nextInt()
    val b = nextInt()

    if (a % b == 0) println(0)
    else println(b - (a % b))
}
