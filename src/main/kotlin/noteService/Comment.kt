package noteService


open class Comment(id: Int, var text: String, var deleted: Boolean = false) : Com(id) {

    override fun toString(): String {
        return "Comment($id, text='$text', deleted=$deleted)"
    }
}
