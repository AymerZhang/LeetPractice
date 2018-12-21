package leetQ26

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var length = nums.size
        while (i < length - 1) {
            if (nums[i + 1] == nums[i]) {
                //在这删除i这个元素    kotlin 的 IntArray没有删除的方法 无解
//                nums -= nums[i]
                length -= 1
            } else {
                i += 1
            }
        }
        return nums.size
    }
}

fun main(args: Array<String>) {
    val nums = intArrayOf(0, 0, 1, 1, 2)
    val length = Solution().removeDuplicates(nums)
    print("长度是$length, 数据是$nums")
}