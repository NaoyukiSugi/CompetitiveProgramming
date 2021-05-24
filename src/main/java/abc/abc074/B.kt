package abc.abc074

import nextInt

fun main() {
    val n = nextInt()
    val h = n / 3600
    val m = (n % 3600) / 60
    val s = n % 60

    println("%02d:%02d:%02d".format(h, m, s))
}
