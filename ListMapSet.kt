fun main() {
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))

    // 이렇게는 add를 사용 못함. listOf는 Immutable임. 변경 불가.
    val list1 = listOf(1,2,3,4)
//    list1.add(7)
    println(list.map { it * 10 }.joinToString("/")) // 10/20/30/40/50/60/70/80/90


    println(list.joinToString(",")) // 1,2,3,4,5,6,7,8,9

    val map = mapOf((1 to "안녕"), (2 to "hello"))
    val map1 = mutableMapOf((1 to "안녕"), (2 to "hello"))
    map1.put(3,"응") // map1[3] = "응" 이거와 같음. 이 부분은 파이썬과 같음.
    map1[100] = "호이"

    println(map1)

    // print와 println의 차이 알아보자.

    val diverseList = listOf(1,"안녕",1.78,true)

    // collection에는 mutable과 immutable가 있는데, mutable은 변경이 가능하고, immutable은 변경이 불가능함.
    // 기본적으로 제공되는 것은 immutable이기 떄문에 값을 변경하려면 mutable로 바꿔야 함.
}