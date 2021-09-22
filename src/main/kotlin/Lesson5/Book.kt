package Lesson5

class Book (var title: String, var author: String, var year: Int, var pages: Int = 500)
{
    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    fun returnTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun returnAll(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(books: Int): Boolean {
        return (books < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println("$BASE_URL$title.html")
    }

}

const val MAX_NUMBER_BOOKS = 3

