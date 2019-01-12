package leetQ61

/**
 * Created by zhangzhongwen on 2019/1/12
 */
fun main(args: Array<String>) {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    var listNode = rotateRight(node1, 2)
    while (listNode != null) {
        println("value : " + listNode.`val`)
        listNode = listNode.next
    }
}

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head?.next == null) return head
    var last: ListNode = head
    var length = 1
    while (last.next != null) {
        last = last.next
        length++
    }
    last.next = head
    var temp: ListNode = head
    val flag = length - k % length
    for (i in 1 until flag) {
        temp = temp.next
    }
    val ans = temp.next
    temp.next = null
    return ans
}