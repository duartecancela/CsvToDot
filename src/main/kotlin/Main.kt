import java.io.File

fun main(args: Array<String>) {
    println("Kotlin program! \n")

    // read from file
    val lines = File("dep-pl.txt").readLines()

    // output filename
    var outFilename = "final.dot"

    val delimit = ", "

    // write first line of output file
    File(outFilename).writeText("digraph ProgramingLanguages { \n")

    // process each line
    for (line in lines) {
        //println("$line")

        val parts = line.split(delimit) // create string array from each line
        //println(parts) // show array of strings splitted by ", "
        //println(parts.size)
        val partsSize = parts.size // size of strings array

        var count = 0
        for (i in parts) { // iterate array of strings
            if (count != 0) {
                //println("\"" + i + "\"" + " -> " + "\"" + parts[0] + "\"" + ";")
                File(outFilename).appendText("\"" + i + "\"" + " -> " + "\"" + parts[0] + "\"" + ";\n")
            }
            count += 1
            println(count)
        }

    }

    // write last line of file
    File(outFilename).appendText("}")

    // execute dot
    Runtime.getRuntime().exec("dot -Tpdf $outFilename -o out.pdf")
}