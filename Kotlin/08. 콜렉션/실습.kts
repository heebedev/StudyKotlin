// LIST

val numbers = listOf<Int>(1,2,3)
val numbers2 = mutableListOf<Int>(1,2,3)

//println(numbers)
//numbers1[0] = 3
// 이뮤터블은 변경 불가능

//println(numbers2)
//numbers2[0] = 3
//println(numbers2)

// SET
val numbers3 = setOf<Int>(1,1,2,3,3,3,4)
val numbers4 = mutableSetOf<Int>(1,1,2,3,3,3,4)
println(numbers3)

// MAP
val numbers5 = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
val numbers6 = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
val numbers7 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
println(numbers5)
println(numbers7)