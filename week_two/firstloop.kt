fun main(args: Array<String>){
        //define a loop 1 - 100
        var n:Int = 1
        while (n<=100){
            println(n)
            n++
        }
        //loop to print from 1-10 without printing 4 and 5
        var numberToTen:Int = 1
        while (numberToTen<=10){
            when(numberToTen){
                !in 4..5 -> println(numberToTen)
            }
            numberToTen++
        }
}