
fun main() {
    // 확장함수 Extension function
    // 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
    val test = Test()
    test.hello() // Test 클래스의 기본 함수
    test.hi()    // Test 클래스의 확장 함수
}

class Test() {
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}

// Test 클래스에 hi 함수를 추가하는 확장 함수
fun Test.hi() = println("hi")

