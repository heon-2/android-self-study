fun main() {
    val user = User("이지헌")
    println(user.age) // 이런식으로 접근 가능함. but 밑에 있는 코드처럼 private 지정을 하면 접근 불가능함.
}

class User(val name : String, var age : Int = 100) {
}

//class User(private val name : String, var age : Int) {
//
//}

// 이런식으로 앞에 private 대신에 open 붙이면, 새로운 클래스를 만들 때 바로 값을 받아서 쓸 수 있음.
// 대신 class 앞에도 open을 붙여줘야함.
open class User2(open val name : String, open var age : Int ){

}

// constructor 붙이면 주 생성자라는 뜻.
class Kid constructor(override val name : String, override var age : Int ) : User2(name,age){

}

// 컨스트럭쳐와 init 공부하기.
// init은 주 생성자가 호출될 때 실행되는 코드 블럭임.