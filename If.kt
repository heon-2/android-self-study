fun main() {
    max(10,3)
}

fun max(a:Int, b:Int) {
    val result = if(a>b) {
        a
    } else {
        b
    }
    println(result)
    val result2 = if (a>b) a else b


}

// 자바에서는 switch 문, 코틀린에서는 when

// 월화수목금토일
fun isHoliday(dayOfWeek : String) {
    when(dayOfWeek) {
        "월" -> false
        "화" -> false
        "수" -> false
        "금" -> false
        "토" -> true
        "일" -> true

        /*
        "토",
        "일" -> true
        else -> false

        이런식으로 줄여서도 가능함.
         */

//        in 2..4 {}
//        in listOf( "월")
        // 코틀린에서는 삼항연산자가 없음.

    }

}