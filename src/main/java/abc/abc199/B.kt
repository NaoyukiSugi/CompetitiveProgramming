package abc.abc199

import nextInt
import nextIntList

fun main() {
    val n = nextInt()
    val aList = nextIntList()
    val bList = nextIntList()
    var seqList = (1..1000).toList()

    for (i in 0 until n) {
        seqList = seqList
            .filter { it >= aList[i] }
            .filter { it <= bList[i] }
    }
    val result = seqList.size
    print(result)
}
