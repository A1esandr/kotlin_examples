fun main() {
    val ex = WhenEx()
    ex.cases("Hello")
    ex.cases(1)
    ex.cases(0L)
    ex.cases(MyClass())
    ex.cases("hello")
}

class MyClass