import java.io.File

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = File("/home/egor/Downloads/input.txt").readLines().map { it.toInt() }
        var counter = 0
        for (i in 1 until input.size)
            if (input[i - 1] < input[i])
                counter++
        print(counter)
    }
}
