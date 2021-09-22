package Lesson5

import kotlin.random.Random

class Puppy
{
    fun playWithBook(poorBook: Book)
    {
        poorBook.tornpages(Random.nextInt(250))
    }
}