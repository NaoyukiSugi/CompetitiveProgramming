package abc.abc010

import nextInt
import nextIntList

fun main() {
    val removalSet = setOf(2, 4, 5, 6, 8)
    var sumCount = 0

    val n = nextInt()
    val aList = nextIntList()
    aList.forEach {
        for (i in it downTo 1) {
            if (i !in removalSet) break
            else sumCount++
        }
    }
    println(sumCount)
}
