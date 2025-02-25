/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList.;")

    val snacks = mutableListOf<String>()

    println(snacks)

    snacks.add("chips (specifically salt and vinegar.)")
    snacks.add("L&P")
    snacks.add("dark chocolate")

    println(snacks)
    println(snacks[0])

    snacks[1] = "sprite"

    println(snacks)

    snacks.removeAt(0)
    println(snacks)

    snacks.add(0, "Ben approved flavour of chips")
    println(snacks)

    snacks.sort()
    println(snacks)

    snacks.shuffle()
    println(snacks)

    val item = snacks.random()
    println(item)

    for (snack in snacks) {
        println(snack)
    }

    println("Snacks contains dark chocolate ${snacks.contains("dark chocolate")}")
    println("Snacks contains white chocolate ${snacks.contains("white chocolate")}")

    println("Dark chocolate index: ${snacks.indexOf("dark chocolate")}")

    for (i in 0 ..< snacks.size)
        println("$i: ${snacks[i]}")

    for ((i, snack) in snacks.withIndex())
        println("$i: ${snacks[i]}")
}

