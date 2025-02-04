fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    //Using toList() to handle potential exceptions during map operation
    val doubledList = list.map { it * 2 }.toList()
    println(doubledList)

    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)

    val sum = list.sum()
    println(sum)

    val average = list.average()
    println(average)

    //Example of handling potential exceptions for larger lists
    val largeList = (1..1000000).toList()
    val sumLargeList = try{
        largeList.sum()
    } catch (e:OutOfMemoryError){
        println("Error calculating sum for large list: ${e.message}")
        0
    }
    println("Sum of large list:" + sumLargeList)
}