package observer

class Hook : Listener {
    override fun update(message: String) {
        println(message)
    }
}