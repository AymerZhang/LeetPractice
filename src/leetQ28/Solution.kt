package leetQ28

/**
 * Created by zhangzhongwen on 2018/12/19
 */
fun main(args: Array<String>) {
    print(strStr("hello","ll"))
}

fun strStr(haystack: String, needle: String): Int {
    var head = 0
    var end = needle.length
    while (end <= haystack.length) {
        if (haystack.substring(head, end).equals(needle)) {
            return head
        }
        head++
        end++
    }
    return -1
}