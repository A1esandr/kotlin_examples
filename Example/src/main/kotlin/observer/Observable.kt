package observer

class Observable {
    private var listeners: MutableList<Listener> = mutableListOf()
    private lateinit var state: String

    fun addListener(listener: Listener) {
        listeners.add(listener)
    }

    fun change(value: String) {
        state = value
        send("Current state = $value")
    }

    fun send(message: String) {
        for (listener in listeners) {
            listener.update(message)
        }
    }
}