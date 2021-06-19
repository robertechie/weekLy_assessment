fun main(){
    //print("Robert you are a good boy".reversed().toString()), the short form
   println(reverseString("Good food"))

}

fun reverseString(words:String):String{
    var theString =""
    var contentReverse: CharArray = words.toCharArray()
    var countn = contentReverse.count()-1

    while(countn>=0){
        theString+=contentReverse[countn]
        countn--
    }

    return theString
}