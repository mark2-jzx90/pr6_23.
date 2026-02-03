fun main(){
    try {
        var num1: Double
        var num2: Double
        var num3: Double

        println("Введите первое число: ")
        num1 = readln().toDouble()
        println("Введите второе число: ")
        num2 = readln().toDouble()
        println("Введите третье число: ")
        num3 = readln().toDouble()
        var result = when{
            (num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3) -> num1
            (num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3) -> num2
            else -> num3

        }


println("Среднее число $result")
    }
    catch (e:NumberFormatException) {
        println("неверный формат данных")
    }
}
