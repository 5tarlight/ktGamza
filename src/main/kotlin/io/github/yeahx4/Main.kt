package io.github.yeahx4

import io.github.yeahx4.util.Console

fun main() {
    Console.printLogo()
    val name = Console.readLine("이름 : ", 1)
    println(name)
}
