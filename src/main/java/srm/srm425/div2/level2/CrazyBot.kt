package srm.srm425.div2.level2

fun main() {
    val ex1 = CrazyBot.Example(1, 25, 25, 25, 25, 1.0)
    val ex2 = CrazyBot.Example(2, 25, 25, 25, 25, 0.75)
    val ex3 = CrazyBot.Example(7, 50, 0, 0, 50, 1.0)
    val ex4 = CrazyBot.Example(14, 50, 50, 0, 0, 1.220703125E-4)

    val crazyBot = CrazyBot()

    ex1.run {
        val result = crazyBot.getProbability(n, east, west, south, north)
        println(result)
    }
}

class CrazyBot {
    private var grid = Array(100) { Array(100) { false } }
    private var vx = arrayOf(1, -1, 0, 0)
    private var vy = arrayOf(0, 0, 1, -1)
    private var prob = Array(4) { 0.0 }

    fun getProbability(n: Int, east: Int, west: Int, south: Int, north: Int): Double {
        prob[0] = east / 100.0
        prob[1] = west / 100.0
        prob[2] = south / 100.0
        prob[3] = north / 100.0

        return dfs(50, 50, n)
    }

    private fun dfs(x: Int, y: Int, n: Int): Double {
        if (grid[x][y]) return 0.0
        if (n == 0) return 1.0

        grid[x][y] = true
        var ret = 0.0
        for (i in 0 until 4) {
            // east, west, south, northの順にロボットを動かす
            ret += dfs(x + vx[i], y + vy[i], n - 1) * prob[i]
        }
        grid[x][y] = false

        return ret
    }

    data class Example(
        val n: Int,
        val east: Int,
        val west: Int,
        val south: Int,
        val north: Int,
        val returns: Double
    )
}
