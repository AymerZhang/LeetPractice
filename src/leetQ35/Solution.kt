package leetQ35

/**
 * Created by zhangzhongwen on 2018/12/27
 */
fun main(args: Array<String>) {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(searchInsert(intArrayOf(1, 3, 5, 9), 7))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 7))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 0))
    println(searchInsert(intArrayOf(1), 1))
    println(searchInsert(intArrayOf(1, 3, 5), 4))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var i = 0
    if (nums[0] == target)
        return 0

    if (target < nums[0])
        return 0
    i = 1
    while (i < nums.size) {
        if (nums[i] == target)
            return i
        else if (nums[i] > target && nums[i - 1] < target)
            return i
        ++i
    }

    return i
}