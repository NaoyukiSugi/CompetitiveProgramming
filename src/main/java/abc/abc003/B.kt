package abc.abc003

import next

fun main() {
    val s = next()
    val t = next()
    val regex = Regex("[atcoder]")
    var isFalse = false

    run loop@{
        s.zip(t).forEach {
            isFalse = when {
                it.first == '@' && it.second == '@' -> return@forEach
                it.first == '@' -> regex.containsMatchIn(it.second.toString()).not()
                it.second == '@' -> regex.containsMatchIn(it.first.toString()).not()
                else -> it.first != it.second
            }
            if (isFalse) return@loop
        }
    }

    if (!isFalse) println("You can win")
    else println("You will lose")
}
