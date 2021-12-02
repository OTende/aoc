import java.io.File

object DayTwo {
    class Position(val direction: String, val value: Int)

    data class Submarine(var vertical: Int, var horizontal: Int)

    private val input = File("input/day2.txt")
        .readLines()
        .map {
            val (name, value) = it.split(" ")
            Position(name, value.toInt())
        }

    fun partOne(): Int {
        val submarine = Submarine(0, 0)
        for (position in input) {
            position.apply {
                when (direction) {
                    "forward" -> submarine.horizontal += value
                    "up" -> submarine.vertical -= value
                    "down" -> submarine.vertical += value
                }
            }
        }
        return submarine.vertical * submarine.horizontal
    }
}

