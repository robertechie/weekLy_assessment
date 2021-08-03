let myNumber = (arrayA, arrayB)=>{

    var newArray = []
    for(var i = 0; i<arrayA.length; i++){
 //check if arrayB contains arrayA position value
        if(arrayB.indexOf(arrayA[i]) != -1){
            continue
        }
        newArray.push(arrayA[i])

    }

    for(var j = 0; j<arrayB.length; j++){
        //check if arrayA contains arrayB position value
        if(arrayA.indexOf(arrayB[j]) != -1){
            continue
        }
        newArray.push(arrayB[j])
    }

    return newArray

}

let myA = [3,5,4,5,6,7,6]
let myB = [9,6,8,5,6,1,5]

console.log(myNumber(myA, myB))