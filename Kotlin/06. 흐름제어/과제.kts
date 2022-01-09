// [ 과제 ]

/*
1. 변수 A와 변수B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 c를 선언한다.
단, 변수 A와 변수 B의 자료형은 자유지만 에러가 발생하면 안된다.
 */

//val A:Int = 10
//val B:Int = 15
//val C:Boolean = ( A == B )
//
//println(A)
//println(B)
//println(C)

/*
2. 정수형 변수 A를 선언하고, 변수 B를 선언한다. 이 때, 변수 B는 변수 A의 두 배가 되어야 한다.
 */
//
//val A:Int = 10
//val B:Int = A*2
//println(A)
//println(B)

/*
3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오. (90점 이상의 A학점, 80~89점 B학점, 70~79 C학점 그렇지 않으면 F학점)
 */
//
//fun returnGrade(testScore:Int) : String {
//    when (testScore) {
//        in 90..100 -> return "A"
//        in 80..89 -> return "B"
//        in 70..79 ->return "C"
//        else -> return "F"
//    }
//}
//
//println(returnGrade(79))

/*
4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수점(정수)를 반환하는 함수를 만드시오. (시험 총 20문제, 만점 100 문제)
 */

//fun returnScore(correctCnt:Int) : Int { return correctCnt*5 }
//
//println(returnScore(2))

/*
5. nullable 정수형 두 개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환나다. 이 때 인수중에 null이 있으면 0으로 취급하여 합을 구한다.
 */

fun nullableReturn(A: Int? = 0, B: Int? = 0): Int {
    return (A ?: 0) + (B ?: 0)
}

println(nullableReturn(null, null))