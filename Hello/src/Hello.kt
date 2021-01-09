class Hello {
    fun run() {
        println("Hello")
    }

    fun runName() {
        println("What's your name?")
        val name= readLine()
        println("Hello $name!")
    }
}