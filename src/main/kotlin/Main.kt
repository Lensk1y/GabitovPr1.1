fun main(args: Array<String>) {
    print("Введите строку a: ")
    val input = readln()
    println("Введенная строка: "+input)
    var i:Int
    var j:Int = 0
    var stop:Boolean = false
    var s:Char = 's'
    var number:Int = 0
    var b:String = ""
    for (i in 0..input.length-1)
    {
        if (i == j)
        {
            while (!stop) {
                if(j == input.length) break;
                stop = false
                s = input[i]
                if (s == input[j]) {
                    number++; j++
                } else stop = true
            }
            b += s;
            if (number != 1) b += number.toString()
            s = 's'
            number = 0
            stop = false
        }
    }
    print("Результат: " + b);
}