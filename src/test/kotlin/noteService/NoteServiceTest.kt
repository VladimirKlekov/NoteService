package noteService

import org.junit.Test

import org.junit.Assert.*

class NoteServiceTest {

    @Test
    fun addComment() {
        val testAddComment = NoteService()
        testAddComment.addComment(1, Comment(1,"Тест", false))

        val newTestAddComment = Comment(1,"Тест", false)

        //val resultAddComment = testAddComment.addComment(newTestAddComment)

       assertEquals(testAddComment,newTestAddComment)
    }

    @Test
    fun editComment() {
        val testEditComment = 1

        val result = NoteService()
            result.editComment(testEditComment)

        //assertEquals()

    }



    @Test
    fun deleteComment() {
    }

    @Test
    fun restoreComment() {
    }
}