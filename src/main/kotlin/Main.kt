import java.io.File

fun main(args: Array<String>) {
    println("Kotlin program! \n")

    // read from file
    val lines = File("dep-pl.txt").readLines()

    val delimit = ","

    // process each line
    for (line in lines) {
        println("$line")

        val parts = line.split(delimit)
        println(parts)
        println(parts.size)

        for (i in parts) {
            println(i)
        }
    }
    // write file
    //File("fileName").writeText("fileContent")

}