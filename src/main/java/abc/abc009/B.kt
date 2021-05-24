package abc.abc009

import nextInt

fun main() {
    val n = nextInt()
    val aList = mutableListOf<Int>()
    for (i in 1..n) {
        val a = nextInt()
        aList.add(a)
    }
    val result = aList.groupBy { it }.toList().sortedByDescending { it.first }[1].first
    println(result)
}
