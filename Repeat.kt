fun main() {
    for(i in 1..10) {
        println(i)
    }

    1..10 == IntRange(1,10)

    for(i in 1 until 10) { // 얘는 그 숫자 전까지임.
    print(i) // 1~9까지.
    }

    for(i in 1..10 step(2)) {
        print(i) // 13579
    }

    for(i in 10 downTo 1) {
        print(i) // 10부터 1까지 작아짐.
    }

    var c = 1
    while(c < 11) {
        print(c)
        c++
    }
}

