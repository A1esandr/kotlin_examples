fun main() {
    val op = VarargsEx()
    op.printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    op.printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "你好",
            prefix = "Greeting: "
    )
    op.log("Hello", "Hallo", "Salut", "Hola", "你好")
}