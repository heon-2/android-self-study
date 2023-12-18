fun main() {
    // 1. 익명함수
    // 2. 변수처럼 사용되서, 함수의 argumnet, return이 될 수 있음.
    // 3. 한 번 사용되고, 재사용되지 않는 함수
    val a = fun(){
        println("hello")
    }
    val b : (Int,Int) -> Int = {
        x,y -> x+y
    }
    val c : (Int) -> Int = {it * 10}  // argument가 1개일 때 it으로 대체 가능
    // 함수 구현부에 맨 마지막에 오는 것이 리턴값.

    println(c(10))
    val d = { i : Int, j : Int -> i * j } // 뒤에 i*j는 타입추론에 의해.Int인걸 추론해낼 수 있음.
    // 리턴타입이나 argument 둘 중 하나는 타입을 지정해줘야 함.


    // SAM
    // Single Abstract Method : 단일 추상 메소드
//    val view = View(this)
//    view.setOnClickListener ( {
//        println("안녕")
//    })

}