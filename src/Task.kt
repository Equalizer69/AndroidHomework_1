fun main(args: Array<String>) {
    println("Hello world!")

    println(
        prodMinusSum(123)
    )
}

private fun prodOf(number: Int): Int {
    var prod = 1
    number.toString().forEach { it ->
        prod *= it.toInt()
    }

    return prod
}

private fun sumOf(number: Int): Int {
    var sum = 0
    number.toString().forEach { it ->
        sum += it.toInt()
    }

    return sum
}

private fun prodMinusSum(number: Int): Int = prodOf(number) - sumOf(number)