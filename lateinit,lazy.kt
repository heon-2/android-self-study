

lateinit var  text : String // 무조건 타입지정은 해줘야함.
val test : Int by lazy {
    println("초기화")
    100
}

fun main1() {
    text = "name"
    println("메인함수실행")

}

/*
lateinit,var
- 변수 타입을 지정해줘야함.
- primitive type은 안됨.
- 선언 후, 나중에 초기화 해줘도 됨.

lazy, val
- 선언과 동시에 초기화를 해야함
- 호출시점에 초기화가 이루어짐


 */