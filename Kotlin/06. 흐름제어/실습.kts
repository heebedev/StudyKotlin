
//if문 간단한 함수면 아래와 같이 실행 가능

//val number: Int = 30
//
//if (number == 10) println("10입니다.")
//else if (number == 20) println("20입니다.")
//else println("10,20 둘 다 아닙니다.")

// 변수에
//val number2: Int = 10 + 20
//val number3: Int = if (number2 > 30) 40 else 50
//println(number3)


// when
val number4:Int = 5

//when (number4) {
//    4 -> {
//        println("4 입니다.")
//    }
//    5 -> {
//        println("5 입니다.")
//    }
//    else -> {
//        println("else")
//    }
//}

when (number4) {
    4 -> println("4 입니다.")
    5 -> println("5 입니다.")
    else -> println("else")
}

when (number4) {
    4 -> println("4 입니다.")
    "안녕하세요." -> println("5 입니다.")
    is Boolean -> println("else")
}

when (number4) {
    in 1..10 -> println("4 입니다.")
    in 20..30 -> println("5 입니다.")
    in 40..60 -> println("else")
}



