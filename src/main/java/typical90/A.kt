package typical90

import nextInt
import nextIntList

fun main() {
    val (n, l) = nextIntList()
    val k = nextInt()
    val aList = nextIntList()
    val diffList = mutableListOf<Int>()
    val score = Int.MIN_VALUE

    for (i in 0 until k) {
        if (i == 0) aList[i]

        diffList.add(l - aList[i])
    }

    println(diffList.minOrNull())
}