package abc.abc199

fun main() {
    val (a, b, c) = nextIntList()
    if (a * a + b * b < c * c) {
        println("Yes")
    } else {
        println("No")
    }
}

fun next() = readLine()!!
fun nextIntList() = next().split(" ").map { it.toInt() }
