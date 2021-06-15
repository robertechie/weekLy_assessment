fun main(args: Array<String>){
    //10 if statement
   var score: Int = 45
   if (score>=70 && score <=100){
       println("A")
   }else if(score>=60 && score<70){
       println("B")
   }else if(score>=50 && score<60){
       println("C")
   } else if(score>=40 && score<50){
       println("D")
   }else if( score<40){
       println("F")
   }else{
       println("Invalid input")
   }
// second if statement
   var isSelected: Boolean = false
   if (isSelected){
       println("Item selected")
   }else{
       println("Not selected")
   }
//third if statement
  
   var criteriaMark: Int = 50
   if (criteriaMark >=70){
       println("you are qualified for this programme")
   }else{
       println("you are not qualified, wait for another session")
   }

   //fouth if statement
   var naijaSeason: Int = 1
   if ( naijaSeason == 1){
       println("Dry season")
   }else if(naijaSeason == 2){
       println("Raining Season")
   }else{
       println("please select a valid season number")
   }
   //fifth if statement
   var isLogin: Boolean = false
   if (isLogin){
       println("LoggedIn")
   }else{
       println("You are not loggedIn")
   }

   //sixth if statement
   var speed: Int = 100
   if (speed > 400){
       println("slow down, speed too high")
   }else if(speed >=300 && speed <400){
       println("don't go beyond this speed, you are on maximum speed already")
   }else if(speed >=200 && speed <300){
       println("don't go beyond this speed, you are on maximum speed already")
   }else if(speed >=50 && speed <200) {
       println("you are on average speed")
   }else if(speed >=10 && speed <50){
       println("you are running on a low speed ")
   }
   else{
       println("Select a valid speed")
   }

   //seventh if statement
   var positiveNumber: Int = 1
   if ( positiveNumber > 0){
       println("The number is positive")
   }

   //eight if statement
   if ( 3>5){
       println("true")
   }else{
       println("false")
   }

   //nine if statement
   if ( 3>5 && 7<10){
       println("true")
   }else{
       println("false")
   }
   //10th if statement
   if ( 3>5 || 7<10){
       println("true")
   }else{
       println("false")
   }

   //5 when conditions
   var scoreWhen: Int = 45
   when(scoreWhen){
       in 70..100 -> println("A")
       in 60..69 -> println("B")
       in 50..59 -> println("C")
       in 40..49 -> println("D")
       in 39 downTo 0 -> println("F")
       else -> println("invalid score")
   }

   // second when statement
   var isSelectedWhen: Boolean = false
   when (isSelectedWhen) {
       true-> println("Item selected")
       else-> println("item not selected")
   }

   //third
   var criteriaMarkWhen: Int = 50
   when (criteriaMarkWhen) {
       in 70..100 -> println("you are qualified for this programme")
       in 69 downTo 0  -> println("you are not qualified, wait for another session")
       else -> println("Invalid mark")
   }
   //fouth when statement
   var checkDataType:Int =56
   when(checkDataType){
       is Int -> println("an interger numner")
   }

   var naijaSeasonWhen: Int = 1
   when (naijaSeasonWhen) {
       1 -> println("Dry season")
       2 -> println("Raining season")
       else -> println("please select a valid season number")
   }
}