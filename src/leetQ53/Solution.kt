package leetQ53

/**
 * Created by zhangzhongwen on 2019/1/9
 */

fun main(args: Array<String>) {
    print(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
}

fun maxSubArray(nums: IntArray): Int {
    var maxSoFar: Int = nums[0]
    var maxEndingHere: Int = nums[0]
    nums.indices.forEach { i ->
        if (i != 0) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i])
            maxSoFar = Math.max(maxSoFar, maxEndingHere)
        }
    }
    return maxSoFar
}