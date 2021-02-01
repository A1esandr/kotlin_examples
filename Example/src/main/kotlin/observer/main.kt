package observer

fun main() {
    val hook = Hook()
    val anotherHook = Hook()
    val observable = Observable()
    observable.addListener(hook)
    observable.addListener(anotherHook)
    observable.change("Initial")
    observable.change("Finishing")
}