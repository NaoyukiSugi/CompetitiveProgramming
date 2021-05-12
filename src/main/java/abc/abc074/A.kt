package abc.abc074

fun main() {
    val N = nextInt()
    val A = nextInt()
    val entireNum = N * N
    val blackNum = entireNum - A
    println(blackNum)
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
