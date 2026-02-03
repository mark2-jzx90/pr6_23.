fun main(){
    try {
        var P: Int
        var CH: Int
        var TR: Int
        var DV: Int

        println("Введите кол-во пятёрок: ")
        P = readln().toInt()
        println("Введите кол-во четвёрок: ")
        CH = readln().toInt()
        println("Введите кол-во троек: ")
        TR = readln().toInt()
        println("Введите кол-во двоек: ")
        DV = readln().toInt()
        var total = when{
            P >= 0 && CH >= 0 && TR >= 0 && DV >= 0 -> P + CH + TR + DV
            else -> 0
        }



        println("Всего учеников в классе: $total")
    }
    catch (e:NumberFormatException) {
        println("неверный формат данных")
    }
}