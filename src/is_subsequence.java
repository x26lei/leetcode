//392 Is Subsequence
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original string 
//by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if (t.length()==0){
            if (s.length()==0){
                return true;
            }
        }
        while (i<t.length()){
            if (j<s.length()){
                if (t.charAt(i) == s.charAt(j)){
                    j++;
                }
            }
            i++;
        }
        if (j>=s.length()){
            return true;
        }
        return false;
    }
}