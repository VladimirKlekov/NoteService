package noteService

import org.junit.Test

import org.junit.Assert.*

class NoteServiceTest {

    @Test
      fun addComment() {
        //создал заметку
           val testNote = Note(1, "Test",mutableListOf())
            val service = NoteService()
        service.add(testNote)
        //проверяю размер списка вначале
            val countBefore =  service.getById(1)?.comments?.size ?: 0
        service.addComment(1, Comment(1, "Тест", false))
        //проверяю размер списка после
            val countAfter =  service.getById(1)?.comments?.size ?: 0

            assertNotEquals(countBefore, countAfter)
        }


    @Test
    fun editComment() {
        //создал заметку
        val testNote = Note(1, "Test",mutableListOf())
        val service = NoteService()
        service.add(testNote)
        //создал комментарий
        val testComment = Comment(1, "Тест", false)
        service.addComment(1,testComment)
        //проверяю функцию
        val result =  service.getById(1)?.comments?.get(0)
//
//      Результат
       assertEquals(testComment.id, result?.id)

    }


    @Test
    fun deleteComment() {
        //создал заметку
        val testNote = Note(1, "Test",mutableListOf())
        val service = NoteService()
        service.add(testNote)
        //создал комментарий
        val testComment = Comment(1, "Тест", false)
        service.addComment(1,testComment)

        //Проверяю функцию
        val result = service.deleteComment(1, 0)

        //сравниваю результаты
        assertNotEquals(testComment.deleted, result?.id)
    }

    @Test
    fun restoreComment() {
        //создал заметку
        val testNote = Note(1, "Test",mutableListOf())
        val service = NoteService()
        service.add(testNote)
        //создал комментарий
        val testComment = Comment(1, "Тест", true)
        service.addComment(1,testComment)

        //Проверяю функцию
        val result = service.restoreComment(1, 0)

        //сравниваю результаты
        assertNotEquals(testComment.deleted, result?.id)
    }
}