package abc.abc006

import nextInt

private const val MOD = 10_007

fun main() {
    val n = nextInt()
    if (n in setOf(1, 2)) {
        println(0)
        return
    }
    if (n == 3) {
        println(1)
        return
    }
    val memo = Array(n) { 0 }
    memo[2] = 1
    for (i in 3 until n) {
        memo[i] = (memo[i - 1] + memo[i - 2] + memo[i - 3]) % MOD
    }
    println(memo[n - 1])
}

