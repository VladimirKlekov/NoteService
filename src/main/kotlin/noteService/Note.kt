package noteService

open class Note(id: Int, val text: String, val comments: MutableList<Comment> = mutableListOf()) : Node(id) {
    override fun toString(): String {
        return "$id with $text and comment: $comments"
    }
}



