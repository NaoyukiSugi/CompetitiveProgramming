package abc.abc001

import nextDouble

fun main() {
    val m = nextDouble()
    val km = m / 1000.0

    var result = when {
        km < 0.1 -> 0.0
        km in 0.1..5.0 -> km * 10
        km in 6.0..30.0 -> km + 50
        km in 35.0..70.0 -> (km - 30.0) / 5 + 80
        else -> 89.0
    }

    println(result.toInt().toString().padStart(2, '0'))
}
