fun main() {

}

// Task 1
fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (num in nums) {
        result = result xor num
    }
    return result
}

// Task 2
fun minSplit(amount: Int): Int {
    val coinValues = intArrayOf(50, 20, 10, 5, 1)
    var remainingAmount = amount
    var count = 0

    for (coin in coinValues) {
        count += remainingAmount / coin
        remainingAmount %= coin
    }

    return count
}

// Task 3
fun notContains(array: IntArray): Int {
    val set = HashSet<Int>()
    for (num in array) {
        if (num > 0) {
            set.add(num)
        }
    }

    var smallest = 1
    while (set.contains(smallest)) {
        smallest++
    }

    return smallest
}

// Task 4
fun addBinary(a: String, b: String): String {
    val numA = a.toBigInteger(2)
    val numB = b.toBigInteger(2)
    val sum = numA + numB
    return sum.toString(2)
}

// Task 5
fun countVariants(stairsCount: Int): Int {
    val memo = IntArray(stairsCount + 1)
    return countWays(stairsCount, memo)
}

fun countWays(n: Int, memo: IntArray): Int {
    if (n <= 1) return 1

    if (memo[n] != 0) return memo[n]

    memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo)
    return memo[n]
}
