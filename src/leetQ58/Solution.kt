package leetQ58

/**
 * Created by zhangzhongwen on 2019/1/10
 */

fun main(args: Array<String>) {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("a"))
}

fun lengthOfLastWord(s: String): Int {
    val words = s.split("[ //,//?//!]".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    return if (words.isEmpty()) 0 else words[words.size - 1].length
}