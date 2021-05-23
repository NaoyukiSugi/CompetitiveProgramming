package abc.abc008

import next
import nextInt

fun main() {
    val n = nextInt()
    val mList = mutableListOf<String>()
    for (i in 1..n) {
        val s = next()
        mList.add(s)
    }
    val maxVotedPerson = mList.groupBy { it }.maxBy { it.value.size }?.key
    println(maxVotedPerson)
}
