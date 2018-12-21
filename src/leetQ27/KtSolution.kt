package leetQ27

/**
 * Created by zhangzhongwen on 2018/12/19
 */
fun main(args: Array<String>) {
    print(removeElement(intArrayOf(1,2,2,3,2,2),2))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) return 0
    var other = 0
    for (i in 0 until nums.size){
        if (nums[i] != `val`){
            if (other != i){
//                val temp = nums[i]
//                nums[i] = nums[other]
//                nums[other] = temp
                nums[other] = nums[i]
            }
            other++
        }
    }
    return other
}