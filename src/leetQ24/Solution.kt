package leetQ24

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        val ansList = ListNode(0)
        var tempList = ListNode(0)
        var temp = 0
        var index = 1
        var tempHead = head
        ansList.next = tempList
        while (true) {
            val value = tempHead?.`val` ?: break
            if (index % 2 == 0) {
                tempList.next = ListNode(value)
                tempList = tempList.next!!
                tempList.next = ListNode(temp)
                tempList = tempList.next!!
            } else {
                temp = value
                if (tempHead.next == null) {
                    tempList.next = ListNode(temp)
                    break
                }
            }
//            tempHead ?: break
            tempHead = tempHead.next
            index++
        }

        return ansList.next!!.next
    }
}

fun main(args: Array<String>) {
    val node1 = ListNode(1)
//    val node2 = ListNode(2)
//    val node3 = ListNode(3)
//    val node4 = ListNode(4)
//    node3.next = node4
//    node2.next = node3
//    node1.next = node2
    var ansnode = Solution().swapPairs(node1)
    var temp = ansnode

    while (true) {
        print(temp?.`val`)
        temp = ansnode?.next ?: break
        ansnode = temp
    }
}