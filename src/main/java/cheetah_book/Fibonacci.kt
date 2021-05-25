package cheetah_book

fun main() {
    val fibonacci = Fibonacci()
    for (i in 0..10) println(fibonacci.fibonacci(i))
}

class Fibonacci {
    fun fibonacci(n: Int): Int {
        if (n <= 1) return 1
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}


