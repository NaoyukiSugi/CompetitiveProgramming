package abc.abc005

import nextInt

fun main() {
    val n = nextInt()
    val tList = mutableListOf<Int>()
    for (i in 0 until n) {
        val t = nextInt()
        tList.add(t)
    }
    println(tList.minOrNull())
}
