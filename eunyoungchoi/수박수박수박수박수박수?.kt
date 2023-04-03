class Solution {
    fun solution(n: Int): String {
      if(n % 2 == 0) return("수박".repeat(n / 2))
      return("수박".repeat(n / 2) + "수")   
     // return "수박".repeat(n / 2) + if (n % 2 != 0) "수" else ""
    }
}
