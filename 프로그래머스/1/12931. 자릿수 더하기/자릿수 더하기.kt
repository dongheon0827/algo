class Solution {
    fun solution(n: Int): Int {
        var answer = n.toString().sumBy{it.toInt()-48}
        return answer
    }
}