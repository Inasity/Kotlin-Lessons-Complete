package Lesson2

fun main()
{
    // Basic Operations
    println ("You'll have ${2 + 71 + 233 - 13} fish and you will need ${1+((2 + 71 + 233 - 13)/30)} aquariums.")

// Variables
    var rainbowColor = "Blue"
    rainbowColor = "Red"
    var blackColor = "Black"
    blackColor = "Not Black"

// Nullability
    var greenColor = null
    var blueColor : Int? = null

//Nullability/Lists
    var List: List<Int?> = listOf(null, null)
    var List2 = arrayOfNulls<Int>(5)
    var List3: List<Int>? = null

//Null Checks
    var nullTest: Int? = null
    println(nullTest?.inc() ?:0)

//Fish String Template
    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"
    println("I like to eat $trout, but I do not like to eat $haddock or $snapper")

//When Statement
    val fishName = "Fishy"
    when(fishName.length)
    {
        0 ->  println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("Ok fish name")
    }

//Basic example
    var numbers = listOf(11,12,13,14,15)
    val list: MutableList<String> = mutableListOf()
    for(number in numbers)
    {
        list.add(number.toString())
    }

//Challenge example
    var numbers2: MutableList<Int> = mutableListOf()
    for (i in 1..100)
    {
        if (i % 7 == 0)
        {
            numbers2.add(i)
        }
    }
    for (number in numbers2)
    {
        println("$number ")
    }
}