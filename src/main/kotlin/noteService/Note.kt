package noteService

open class Note(id: Int, val text: String, val comments: MutableList<Comment> = mutableListOf()) : Node(id) {
    override fun toString(): String {
        return "Заметка с номером $id ,  текст: $text, комментарий: $comments"
    }
}



