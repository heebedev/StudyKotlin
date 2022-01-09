// For 문
//for (value in 0..3) {
//    println(value)
//}
//println("***********************")
//for (value in 0..5 step (2)) {
//    println(value)
//}
//println("***********************")
//for (value in 5 downTo 0) {
//    println(value)
//}

//println("***********************")
//val numbers = listOf<Int>(5, 6, 7, 8)

//for (number in numbers) {
//    println(number)
//}

//for ((index, number) in numbers.withIndex()) {
//    println("" + index + "  |  " + number)
//}
//
//numbers.forEach {
//    println(it)
//}

//numbers.forEach { number ->
//    println(number)
//}

// 기타
//for (i in 1..3) {
//    println("****** i :" + i)
//    for (j in 1..3) {
//        println(j)
//    }
//}

// for 문이 끝난다.
//println("******** BREAK")
//for (i in 1..3) {
//    println("****** i :" + i)
//    for (j in 1..3) {
//        if (j == 2) break
//        else println(j)
//    }
//}

// for 문 재시작
//println("******** CONTINUE")
//for (i in 1..3) {
//    println("****** i :" + i)
//    for (j in 1..3) {
//        if (j == 2) continue
//        else println(j)
//    }
//}

//println("******** RETURN")
//fun returnFunction(): Unit {
//    for (i in 1..3) {
//        println("****** i :" + i)
//        for (j in 1..3) {
//            if (j == 2) return
//            else println(j)
//        }
//    }
//}
//
//returnFunction()

// 기타 - Label

//println("******** BREAK")
//loop@ for (i in 1..3) {
//    println("****** i :" + i)
//    for (j in 1..3) {
//        if (j == 2) break@loop
//        else println(j)
//    }
//}
//println("******** CONTINUE")
//loop@ for (i in 1..3) {
//    println("****** i :" + i)
//    for (j in 1..3) {
//        if (j == 2) continue@loop
//        else println(j)
//    }
//}

// return 밖에 안 됨
//println("******** FOR EACH")
//listOf(1,2,3).forEach loof@{
//    if (it==2) return@loof
//    else println(it)
//}

