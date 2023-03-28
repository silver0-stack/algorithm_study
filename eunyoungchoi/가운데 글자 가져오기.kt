class Solution {
    fun solution(s: String): String  {
        var len:Int=s.length
        if(len % 2 ==1) return s.get(len / 2).toString()
        else return s.substring(len/2-1..len/2)
     }
}
