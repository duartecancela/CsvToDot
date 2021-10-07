import java.io.File

fun main(args: Array<String>) {
    println("Kotlin program to convert CSV to DOT \n")

    // output filename
    val outFilename = "final.dot"

    // input filename
    val inFilename = "dep-pl.txt"

    // read from file
    val lines = File(inFilename).readLines()

    // String delimiter
    val delimit = ", "

    // write first line of output file
    File(outFilename).writeText("digraph ProgramingLanguages { \n")

    // process each line
    for (line in lines) {
        //println("$line") // debug

        val parts = line.split(delimit) // create string array from each line
        //println(parts) // show array of strings splitted by ", " // debug
        //println(parts.size) // debug
        val partsSize = parts.size // size of strings array

        var count = 0
        for (i in parts) { // iterate array of strings
            if (count != 0) {
                //println("\"" + i + "\"" + " -> " + "\"" + parts[0] + "\"" + ";") // debug
                File(outFilename).appendText("\"" + i + "\"" + " -> " + "\"" + parts[0] + "\"" + ";\n")
            }
            count += 1
            //println(count) // debug
        }
    }

    // write last line of output file
    File(outFilename).appendText("}")

    // execute dot
    Runtime.getRuntime().exec("dot -Tpdf $outFilename -o out.pdf")
}