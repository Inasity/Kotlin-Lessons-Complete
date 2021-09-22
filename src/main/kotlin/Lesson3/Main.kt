package Lesson3

import java.util.*

fun dayOfWeek()
{
    println("What day is it today?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> "Time broke"
    }
}

fun kotlinHour()
{
    if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) println("Good morning, Kotlin") else println("Good night, Kotlin")
}

fun feedTheFish()
{
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    swim()
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val day = Random().nextInt(7)
    return week[day]
}

fun fishFood(day : String) :String
{
    return when (day)
    {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "Fasting"
    }
}

fun getFortuneCookie(): String {
    var birthday = 0
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    for (i in 1..10)
    {
        birthday = getBirthday() ?: 1
        if (birthday%fortunes.size == 5)
        {
            return fortunes[5]
        }
    }
    return when (birthday%fortunes.size)
    {
        0 -> fortunes[0] //it was so much prettier before it wanted me to use a when case
        1 -> fortunes[1]
        2 -> fortunes[2]
        3 -> fortunes[3]
        4 -> fortunes[4]
        6 -> fortunes[6]
        else -> "Fortune machine broke"
    }
}

fun getBirthday() : Int?
{
    print("Enter your birthday")
    return readLine()?.toIntOrNull()
}

fun swim(speed: String = "fast")
{
    println("Swimming $speed")
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    var fishSpace = if (hasDecorations) tankSize * .8 else tankSize
    for (fish in currentFish)
    {
        fishSpace -= fish
    }
    //println(fishSpace)
    return fishSpace >= fishSize
}

fun whatShouldIDoToday(
    mood: String? = getMood(),
    weather: String = "sunny",
    temperature: Int = 24
): String {
   return when
    {
        amIBoiling(temperature) -> "Die from heatstroke"
        goWalk(mood, weather, temperature) -> "Go for a walk"
        sadTVBinge(mood, weather) -> "Watch Netflix and ignore the sunny day"
        else -> "Stay home and read"
    }
}

fun getMood() : String? {
    print("Enter your mood")
    return readLine() ?: "sad"
}
fun getWeather() : String? {
    print("Enter your weather")
    return readLine() ?: "cloudy"
}

fun goWalk(mood: String?, weather: String, temperature: Int) = mood == "happy" && weather == "sunny" && temperature < 50

fun amIBoiling(temperature: Int) = temperature >= 50

fun sadTVBinge(mood: String?, weather: String) = mood == "sad" && weather == "sunny"

fun sortSpices()
{
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val organizedCurries = spices.filter {it.contains("curry")}.sortedBy {it.length}
    for (curry in organizedCurries) println(curry)
    val spicesCE = spices.filter{it[0] == 'c'}.filter{it[it.length - 1] == 'e'}
    for (spice in spicesCE) println(spice)
    val threeSpices = spices.take(3).filter{it[0] == 'c'}
    for (spice in threeSpices) println(spice)
}

fun main(args: Array<String>)
{
    println("Hello, Kotlin}!") //hardcoded because args does not return anything
    dayOfWeek()
    kotlinHour()
    feedTheFish()
    //println("Your fortune is: " + getFortuneCookie())
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
    println(whatShouldIDoToday())
    println(whatShouldIDoToday("sad", "sunny",50))
    println(whatShouldIDoToday("sad", "sunny",34))
    println(whatShouldIDoToday("smad"))
    sortSpices()
    var rollDice = {1 + Random().nextInt(12)}
    var rollDice2 = {sides: Int -> 1 + Random().nextInt(sides)}
    var rollDice3 = {sides: Int ->
        if (sides == 0) 0 else Random().nextInt(sides) + 1
    }

    fun gamePlay(roll: Int)
    {
        println(roll)
    }
    gamePlay(rollDice2(10))

}