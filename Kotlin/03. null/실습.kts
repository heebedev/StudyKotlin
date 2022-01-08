val number: Int? = null
//val number2: Int = null // non-null type에는 null이 변수로 들어갈 수 없다.

var number2: Int? = 2
var number3: Int? = 10
var number4: Int? = number2!! + number3!!
// 느낌표로 강제 언랩핑 가능
println(number4)