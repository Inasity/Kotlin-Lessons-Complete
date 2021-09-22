package Lesson5

fun main(args: Array<String>)
{
    val book = Book("Booker", "Auter", 2022)
    val titleName = book.returnTitleAuthor()
    val titleNameYear = book.returnAll()

    println("Here is your book ${titleName.first} by ${titleName.second}")
    println("Here is your book ${titleNameYear.first} by ${titleNameYear.second} published in ${titleNameYear.third}")
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks = mutableMapOf("Dunes" to "Frank Herbert")
    moreBooks.getOrPut("Dunes") {"Frank Herbert"}
    moreBooks.getOrPut("Tsukihime") {"Nasu"}
    println(moreBooks)
    book.printUrl()
    val dog = Puppy()

    while(book.pages > 0)
    {
        dog.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }

}

fun Book.weight() : Double { return (pages * 1.5) }
fun Book.tornpages(remove: Int) {pages-=remove}
