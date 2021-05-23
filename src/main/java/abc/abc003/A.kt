package abc.abc003

import nextInt

fun main() {
    val n = nextInt()
    val result = 10_000 * (1..n).sum() / n
    println(result)
}
