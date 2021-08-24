package io.github.yeahx4.util

import java.util.*

class Console {
    companion object {
        private fun isWindows(): Boolean {
            return System.getProperty("os.name").lowercase().contains("windows")
        }

        fun clear() {
            val cmd = when (isWindows()) {
                true -> "cls"
                false -> "clear"
            }
            Runtime.getRuntime().exec(cmd)
        }

        fun readLine(text: String?): String {
            print(text)
            with (Scanner(System.`in`)) {
                return nextLine()
            }
        }

        fun pause() {
            println("${Color.RESET}계속하려면 아무키나 누르십시오.")
            with (Scanner(System.`in`)) {
                next()
            }
        }
    }
}
