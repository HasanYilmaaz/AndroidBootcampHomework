package com.example.androidbootcamp.homeworks


fun celsiusToFahrenheit(celsius: Double) {
    var printFahrenheit  = println((celsius * 1.8) + 32)
    return printFahrenheit
}

fun calculateRectanglePerimeter(length: Int, width: Int) {
    var printPerimeter = println(2 * (length + width))
    return printPerimeter
}

fun calculateFactorial(number: Int): Int {
    var factorial = 1
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}
fun calculateCharInWords(word: String, char: Char): Int {
    var count = 0
    for (i in word) {
        if (i == char) {
            count++
        }
    }
    return count
}
fun calculateInteriorAngleSum(sides: Int): Int {
    var sum = (sides - 2) * 180
    return sum
}

fun calculateSalary (day : Int) :Double{
    var dailyWorkHours = 8
    var hourlyWage = 10.0
    var extraWorksWage = 20.0
    var totalSalary = 0.0
    if (day <= 20){
        totalSalary = day * dailyWorkHours * hourlyWage
    }else if (day > 20){
        var extraDays = day - 20
        totalSalary = (20 * dailyWorkHours * hourlyWage) + (extraDays * dailyWorkHours * extraWorksWage)
    }
    return totalSalary
}

fun calculateInternetBill(usage: Double): Double {
    var internetBill = 0.0
    if (usage <= 50) {
        internetBill = 100.0
    } else if (usage > 50) {
        internetBill = 100.0 + ((usage - 50) * 4.0)


    }
    return internetBill
}
fun main() {
    println(celsiusToFahrenheit(10.0))
    calculateRectanglePerimeter(7, 8)
    println(calculateFactorial(5))
    println(calculateCharInWords("Dağlarda", 'a'))
    println(calculateInteriorAngleSum(5))
    println(calculateSalary(25))
    println(calculateInternetBill(60.0))
}
