fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)

    val sum = list.sum()
    println(sum)

    val average = list.average()
    println(average)
}