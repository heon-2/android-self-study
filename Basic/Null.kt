fun main() {
    var name = "지헌"
//    name= null // 이런식으로 null을 넣을 수 없음. null을 넣으려면, 타입을 명시적으로 지정해줘야함.
    var name2 : String? = null // 이런식으로 ?를 붙여주면, null을 넣을 수 있음.

    /*
    val result = if(nickname == null) {
        "이름이 없음"
    } else {
        nickname
    }
    코틀린에서는 이런식으로 null 체크를 하기 보다는 아래처럼 엘비스 오퍼레이터를 사용하는 경우가 많음.
     */
//    val result = name2? : "값이 없음" // 엘비스 오퍼레이터

    val nickname = "지헌"
//    val size = nickname.length // 이렇게 하면 null pointer exception
    val size = nickname?.length // 닉네임이 널이면 더이상 실행하지 않고 null을 반환함. 널이 아니면 nickname을 반환함.
//    val size = nickname!!.length // 널이 아니라는 확신이 있으면 이걸 쓰는거.
    // 근데 이것보단 null 될수 없는 타입을 선언하고 사용하는 것이 좋음.


}