/*
1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어보자
 */

//fun printString(str: String, cnt: Int) {
//    for (i in 1..cnt) println(str)
//}
//
//printString("N", 5)

/*
2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어보자
 */

//fun sum(number:Int) : Int {
//    var result:Int = 0
//    for (i in 1..number)  result += i
//    return result
//}
//println(sum(10))

/*
3. 1부터 100까지의 수 중에서 7의 배수의 합을 구하는 함수를 만들어보
 */

//fun sum7(number:Int) : Int {
//    var result:Int = 0
//    for (i in 1..number) {
//        if (i % 7 == 0) result += i
//    }
//    return result
//}
//println(sum7(100))

/*
4. 100보다 작은 숫자를 넣어주면, 1씩 증가시키고 100이 되면 종료되는 함수
 */
//fun increaseNum(number:Int) : Int {
//    var start:Int = number
//    while (start < 100) start++
//    return start
//}
//println(increaseNum(89))


/*
5. 시험 성적 리스트 [70, 71, 72, 77, 78, 79, 80, 82, 90, 99]
와 동일한 크기의 같은 배열을 만들고, 합격이면 True, 불합격이면 false를 담는 함수
(80점 이상부터 합격)
 */
//
//val scoreArr = listOf(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)
//
//fun checkPassOrNot(examScores: List<Int>): MutableList<Boolean> {
//    var resultArr = MutableList<Boolean>(scoreArr.size, {false})
//
//    examScores.withIndex().forEach {
//        if (examScores[it.index] >= 80) resultArr[it.index] = true
//        else resultArr[it.index] = false
//    }
//    return resultArr
//}
//
//println(checkPassOrNot(scoreArr))


/*
6. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수
-> [[3,3]. [1.5]. ...]
 */

//fun findSumSix(): MutableList<List<Int>> {
//    val result = mutableListOf<List<Int>>()
//
//    for (i in 1..6) {
//        for (j in 1..6) {
//            if ((i + j) == 6) {
//                result.add(listOf(i, j))
//                break
//            }
//        }
//    }
//
//    return result
//}
//
//println(findSumSix())


/*
7. 배부르기 위해서 먹어야 하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두 개를 받는 함수
함수는 "밥을 먹었다" 한 번 출력할 때 마다 밥을 1회 먹은 것으로 간주
배가 부를 때 까지 밥을 먹어야 함
배가 부를 경우 "배가 부르다" 출력
배가 아무리 불러도 최소 한 번은 무조건 먹음

fun eat(3,2): {}
 */

//fun eat(remain:Int, current:Int) {
//    var remainCount: Int = current
//
//    do {
//        println("밥을 먹었다")
//        remainCount++
//    } while (remainCount < remain)
//
//    println("배가 부르다")
//
//}
//
//eat(3,3)

/*
8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두 개의 병사 그룹을 합친다.
fun abc( ["A", "B", "C", "D", "E"], ["F", "G", "H"], 2 ) -> null || [["A", "B", "D", "E"], ["F", "G"]]

함수 실행이 어려운 조건을 만나면 null 을 리턴
fun abc( ["A", "B", "C", "D", "E"], ["F", "G", "H"], 100)
 */
//
//fun abc(firstArmy: MutableList<String>, secondArmy: MutableList<String>, removeIdx: Int): List<MutableList<String>>? {
//    var first = firstArmy
//    var second = secondArmy
//
//    if ((firstArmy.lastIndex < removeIdx) && (secondArmy.lastIndex < removeIdx)) return null
//
//    first.removeAt(removeIdx)
//    second.removeAt(removeIdx)
//
//    return listOf(first, second)
//}
//
//println(abc(mutableListOf<String>("A", "B", "C", "D", "E"), mutableListOf<String>("A", "B", "C"), 2))
//println(abc(mutableListOf<String>("A", "B", "C", "D", "E"), mutableListOf<String>("A", "B", "C"), 100))

/*
9. 단수를 입력받아 해당 단수의 값을 리스트로 출력하는 함수
fun abc(3) -> [3,6,9,12,15,18,21,24,27]
 */
//fun gugudan(dan: Int) {
//    var result = MutableList<Int>(9, {0})
//    for (i in 1..9) result[i-1] = i*dan
//    println(result)
//}
//
//gugudan(3)

/*
10. 숫자 리스트 두 개를 넣어주면 짝수와 홀수로 분리된 Map을 만드는 함수
(Map의 키는 "짝수, "홀수")
 */

//fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
//    val result = mutableMapOf<String, MutableList<Int>>()
//    val totalIntList = mutableListOf<Int>()
//    totalIntList.addAll(firstIntList)
//    totalIntList.addAll(secondIntList)
//
//    println(totalIntList)
//
//    totalIntList.forEach {
//        if (it%2 == 0) {
//            val even = result.getOrDefault("짝수", mutableListOf<Int>())
//            even.add(it)
//            result.put("짝수", even)
//        } else {
//            val odd = result.getOrDefault("홀수", mutableListOf<Int>())
//            odd.add(it)
//            result.put("홀수", odd)
//        }
//    }
//    return result
//}
//
//println(splitNumbers(listOf(1,2,3,4,5), listOf(6,7,8,9,10)))