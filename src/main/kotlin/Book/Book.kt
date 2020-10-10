package Book

open class Book (val title: String, val author: String) {
    var currentPage: Int = 0

    open fun readPage() {
        currentPage += 1
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}