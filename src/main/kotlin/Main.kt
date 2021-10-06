

fun main(args: Array<String>) {
    println("Kotlin program! \n")

    val delimit = ","

    // read file
    val lines = listOf("Kotlin, Java, C#, JavaScript, Scala, Groovy",
        "Groovy, Java",
        "JavaScript, Hypertalk ",
        "Java, C++, Smalltalk-80")

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
}