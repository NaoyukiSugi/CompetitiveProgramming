package abc.abc006

import nextInt

fun main() {
    val n = nextInt()
    when {
        n == 3 -> println("YES")
        n % 3 == 0 -> println("YES")
        else -> println("NO")
    }
}
