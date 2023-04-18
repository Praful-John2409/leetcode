// Q You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s1 =new StringBuilder();
        int i=0,j=0,k=0;
        while(j<word1.length() && k<word2.length()){
            if(i%2==0){
                s1.append(word1.charAt(j++));
            }       else{
                s1.append(word2.charAt(k++));
            }
            i++;
        }
        while(j<word1.length()){
            s1.append(word1.charAt(j++));
        }
        while(k<word2.length()){
            s1.append(word2.charAt(k++));
        }
        return s1.toString();
    }
}
