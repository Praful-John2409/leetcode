// Q
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class Solution {
    public int strStr(String haystack, String needle) {
        int hSize=haystack.length(),nSize=needle.length();
        if(hSize<nSize)
            return -1;
        for(int i=0;i<(hSize-nSize)+1;i++){
            String sub=haystack.substring(i,i+nSize); //finding the substring in the haystack
            System.out.println(sub);
            if(sub.compareTo(needle)==0){      // comparing that substring to needle
                return i;
            } 
        }
        return -1;
        
    }
}
