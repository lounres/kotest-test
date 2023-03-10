package com.lounres.kotestTest

fun normalFunction(): Int = 57

fun buggedFunction(): Int {
    var t = 1
    var count = 1000
    while (true) {
        if (count >= 0) {
            println(t)
            count--
        }

        if (t and 1 == 0) t /= 2
        else t = t * 3 + 1
    }
}