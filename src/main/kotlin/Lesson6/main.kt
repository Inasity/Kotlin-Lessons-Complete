package Lesson6

fun main(args: Array<String>)
{
val game = Game()
    println(game.map.size)
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    val divisibleNumbers = mutableListOf<Int>()
    divisibleNumbers.addAll(numbers.filter { it%3 == 0 })
    println(divisibleNumbers)
    while(true)
    {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}