package org.example

fun answer() = 42

fun unusedAnswer(a: Int): Int {
    val b = 42
    return if (b == 42) {
        42
    } else {
        42
    }
}