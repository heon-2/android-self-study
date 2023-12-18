fun main() {
    // let, run, apply, also / with
    // 1. let
    val a = 3
    a.let {
    }
    val user = User("이지헌",10,true)
    user.let {
        println(it.age)
    }

    // 수신객체.let { it ->
//
//    마지막 줄이 return
// }
    // 이런식으로 바로 변수에 담을 수도 있음.
    val age = user.let {
        user.age
    }
}
// 수신객체를 통해서 let이란 확장함수를 호출 가능함. it으로 받음.
// let은 null safe할 때도 많이 사용함.

    // 2. run
    // 수신객체.run { this ->
    // 마지막 줄이 리턴이 됨.
    // }
    val kid = User("아이",10,true)
    val kidAge = kid.run {
        age // 이런식으로 run에서는 바로 적으면 변수 받아짐. ( this가 생략 가능함. )
        // let에서는 it.age 이런식으로 해야 함.
    }
    // run 같은 경우는 객체를 초기화할 때 주로 사용함.


    // 3. apply
    // 수신객체.apply { this ->
    // asdfasdfs
    // }
    // apply는 리턴값이 수신객체
    val kidName = kid.run {
        name
    }
    println(kidName) // 이 경우 name이 출력된느 것이 아니라 객체 kid가 나옴.

    // 4. also
    // 수신객체.also { it -> // local variable
    // asdfasdf
    // }

    // 얘도 return 수신객체 자기자신
    // also는 초기화작업을 할 떄 추천하지 않음.
    // also를 추천하는 경우는 수신객체의 내용을 확인해보고 싶을 때, log를 찍어볼 때 권장함.

    // 5. with
    // with(수신객체) {
    // ----
    // 마지막줄
    // }
    // with는 수신객체를 지정해줘야 함.
    val result = with(male) {
        hasGlasses = false
        true
    }



class User(
    val name : String,
    val age:  Int,
    val gender : Boolean,

)