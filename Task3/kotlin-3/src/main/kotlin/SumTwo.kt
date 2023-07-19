fun main() {
    val a = intArrayOf(1, 4, 5, 11, 12, 6, 3)
    val target = 9
    val pairs = targetSum(a, target)

    for (x in pairs!!) println("{ ${x[0]} , ${x[1]} }")

}

fun targetSum(a: IntArray, target: Int): MutableList<IntArray>? {
    val mutableList = mutableListOf<IntArray>()

    for (i in 0 until a.size - 1) {
        for (j in i + 1 until a.size) {
            if (a[i] + a[j] == target) {
                mutableList.add(intArrayOf(a[i], a[j]))
            }
        }
    }
    return mutableList
}

