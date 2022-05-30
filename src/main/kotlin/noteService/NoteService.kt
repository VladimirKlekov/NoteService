package noteService


class NoteService : NoteAndComment<Note>() {

    //private val notes = mutableListOf<Note>()

    fun addComment(noteId: Int, comment: Comment) {
        getById(noteId)?.comments?.add(comment)
    }

    fun editComment(noteId: Int, commentId: Int): Comment? {
        var edit = getById(noteId)?.comments?.get(commentId)
        println("Введите текст")
        edit?.text = readln()
        return edit

    }


    fun deleteComment(noteId: Int, commentId: Int): Comment? {
        var del = getById(noteId)?.comments?.get(commentId)
        del?.deleted = true
        return del

    }

    fun restoreComment(noteId: Int, commentId: Int): Comment? {
        var rest = getById(commentId)?.comments?.get(commentId)
        rest?.deleted = false
        return rest

    }
}


