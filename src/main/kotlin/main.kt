import noteService.Note
import noteService.Comment
import noteService.NoteService



fun main() {

    val service = NoteService()
    println(service.elements)
    println("Создал заметки")
    service.add(Note(1, "Заметка 1"))
    service.add(Note(2, "Заметка 2"))
    println(service.elements)
    println("Нашел")
    println(service.getById(1))
    println("Изменил заметку")
    service.update(Note(1, "Заметка 3"))
    println(service.getById(1))
    println(service.getById(100))
    println("Удалил заметку")
    service.delete(1)
    println(service.elements)
    println("Создал комментарии")
    service.addComment(1, Comment(1,"Создал первый комментарий"))
    service.addComment(1, Comment(2,"Создал второй комментарий"))
    println(service.getById(1))
    println("Редактировал комментарий")
    service.editComment(1,1)
    println(service.getById(1))
    println("Удалил комментарий")
    service.deleteComment(1, 1)
    println(service.getById(1))
    println("Восстановил комментарий")
    service.restoreComment(1,1)
    println(service.getById(1))
}

