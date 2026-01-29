package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val letters = str.takeWhile { it.isLetter() }
    val digits = str.takeLastWhile { it.isDigit() }

    return if (digits.isNotEmpty()) {
        val multiplied = digits.toInt() * int
        "$letters$multiplied"
    } else {
        "$str$int"
    }
}
