import noteService.Note
import noteService.Comment
import noteService.NoteService



fun main() {

    val service = NoteService()
    println(service.elements)
    service.add(Note(1, "Текст заметки"))
    println(service.elements)
    println(service.getById(1))
    service.update(Note(1, "Текст заметки2"))
    println(service.getById(1))
    println(service.getById(100))
    service.addComment(1, Comment(1,"Создал первый комментарий"))
    service.addComment(1, Comment(2,"Создал второй комментарий"))
    println(service.getById(1))
    service.editComment(1)
    println(service.getById(1))
    service.deleteComment(1 )
    println(service.getById(1))
    service.restoreComment(1)
    println(service.getById(1))
}

