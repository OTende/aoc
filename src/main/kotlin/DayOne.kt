import java.io.File

object DayOne {
    private val input = File("input/day1.txt").readLines().map { it.toInt() }

    fun partOne(): Int {
        return input.zipWithNext().count { (first, second) -> first < second }
    }

    fun partTwo(): Int {
        return input.windowed(3).map { it.sum() }.zipWithNext().count { (first, second) -> first < second }
    }
}