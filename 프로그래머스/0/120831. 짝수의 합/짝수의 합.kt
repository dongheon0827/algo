class Solution {
    fun solution(n: Int): Int {
        var answer: Int = (0 until n+1).filter {it%2==0}.sum()
        return answer
    }
}