fun main(){
    odd()
    println(namess(arrayOf("Nkimalantoi","kamau","judy","sintamei")))
    drinks(3)
    drinks(14)
    drinks(20)
    numbers()
}/*
trol 1nction that prints out all the odd numbers between 1 and 100 (2pts)

2. Create a function that takes in an array of names and returns the number of
names longer than 5 characters (2pts)

3. You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of coca cola. Create a function that will make these
decisions, printing out the name of the drink each person gets according to
their age. (2pts)

4. Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number. (4pts)
1. Create a fu*/
fun odd(){
    for (b in 1..100){
        if (b%2 !==0)
            println(b)

    }
}
fun namess(name:Array<String>):Int{
    var nm=0
    name.forEach { c->
        if(c.length>5){
            nm++
        }
    }
    return nm
}
fun drinks(age:Int){
    if (age<=6){
        println("a glass of milk")
    }
    else if (age>6 && age<=15){
        println("fanta")
    }
    else{
        println("cocacola")
    }
}
fun numbers(){
    for (s in 1..100){
        if (s%3==0){
            println("Fizz")
        }
        else if (s%5==0){
            println("Buzz")
        }
        if (s%3==0 && s%5==0){
            println("FizzBuzz")

        }


    }
}


