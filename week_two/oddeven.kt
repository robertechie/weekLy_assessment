fun main(){
    //print all even numbers between 10 and 20 and all odd numbers between 20 and 30
    var evenOdd:Int = 10
    while (evenOdd<=30){
        when(evenOdd){
            in 10..20 -> {
            when {
                evenOdd % 2 == 0 -> println(evenOdd)
            }
        }
            //odd numbers between 20 to 30
            in 20..30 -> {
                when {
                    evenOdd % 2 != 0 -> println(evenOdd)
                }
            }
        }
        if(evenOdd == 20){
            println("-----------------------------")
        }
        evenOdd++
    }

}