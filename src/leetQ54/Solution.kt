package leetQ54

import java.util.ArrayList

/**
 * Created by zhangzhongwen on 2019/1/9
 */
fun main(args: Array<String>) {
    val ans = spiralOrder(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))) as ArrayList<Int>
    println(ans)
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    if (matrix.isEmpty() || matrix[0].isEmpty()) return ArrayList()
    val ans = ArrayList<Int>()
    var top = 0
    var bottom = matrix.size - 1
    var left = 0
    var right = matrix[0].size - 1
    var i = 0
    var j = 0
    // 0:right 1:bottom 2:left 3:top
    var current = 0
    ans.add(matrix[i][j])
    while (true) {
        if (left > right || bottom < top) {
            break
        }
        when (current) {
            0 -> if (j < right) {
                j++
                ans.add(matrix[i][j])
            } else {
                top++
                current++
            }
            1 -> if (i < bottom) {
                i++
                ans.add(matrix[i][j])
            } else {
                right--
                current++
            }
            2 -> if (j > left) {
                j--
                ans.add(matrix[i][j])
            } else {
                bottom--
                current++
            }
            3 -> if (i > top) {
                i--
                ans.add(matrix[i][j])
            } else {
                left++
                current = 0
            }
        }
    }
    return ans
}