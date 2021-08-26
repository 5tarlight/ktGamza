package io.github.yeahx4.util

import java.io.IOException
import java.util.Scanner

class Console {
    companion object {
        fun clear() {
            print("\u001b[H\u001b[2J")
        }

        fun readLine(text: String?): String {
            print(text)
            with (Scanner(System.`in`)) {
                return nextLine()
            }
        }

        fun pause() {
            println("${Color.RESET}Press Enter to continue")
            try {
                System.`in`.read()
            } catch (ex: IOException) {}
        }

        fun printLogo() {
            println("==============================")
            println("Welcome to ${Color.CYAN}Gamza${Color.RESET}.")
            println("")
            println("Experience ${Color.PURPLE}RPG ${Color.RESET}on mud!")
            println("==============================")

            pause()
        }
    }
}
