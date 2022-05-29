package noteService

open class NoteAndComment<T : Node> {
    val elements = mutableListOf<T>()
    private var nextID = 1

    fun add(elem: T): T {
        elem.id = nextID++
        elements.add(elem)
        return elements.last()
    }

    fun update(elem: T): Boolean {
        for ((index, node) in elements.withIndex()) {
            if (node.id == elem.id) {
                elements[index] = elem
                return true
            }
        }
        return false
    }


    fun getById(id: Int): T? {
        return elements.find { it.id == id }
    }


//     fun restore(elem: T): T

}