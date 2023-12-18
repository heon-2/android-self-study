fun main() {
    println(check("안녕"))
    cast("지헌")
    cast(10) // 숫자를 문자열로 바꿀 수 없으므로 null을 반환함.
}

fun check(a:Any) : String {
    return if(a is String) {
        "문자열"
    } else if (a is Int) {
        "정수"
    } else if (a is Float) {
        "실수"
    } else {
        "모르겠음"
    }
}


// 코틀린에서는 타입체킹할 때 이런 걸 쓸 수 있음.
fun cast(a : Any) {
    val result = a as? String // 물음표 없는데 만약 cast(10) 이런식으로 넣으면 에러뜸.
    println(result)
}

fun smartcast(a : Any) {
    if(a is String) {
        a.length // 이런식으로 스마트 캐스트가 됨.
    } else if (a is Int) {
        a.plus(10) // 이런식으로 스마트 캐스트가 됨.
    }
}
// 값을 아직 받지 않았지만, 이미 string이나 int라고 가정하고 사용할 수 있음.

