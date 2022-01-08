// 가변 인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    // for 문에 괄호 필수..
    for (number in numbers) {
        println(number)
    }
}
plusMultipleNumbers(1, 2, 3, 4, 5)
