class InfixEx {
    fun prints() {
        infix fun Int.times(str: String) = str.repeat(this)        // 1
        println(2 times "Bye ")                                    // 2

        val pair = "Ferrari" to "Katrina"                          // 3
        println(pair)

        infix fun String.onto(other: String) = Pair(this, other)   // 4
        val myPair = "McLaren" onto "Lucas"
        println(myPair)

        val sophia = Person("Sophia")
        val claudia = Person("Claudia")
        sophia likes claudia
        println(sophia.likedPeople)
    }
}