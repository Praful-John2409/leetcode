//Q Write a function to find the longest common prefix string amongst an array of strings.

//If there is no common prefix, return an empty string "".

class Solution {
    public String longestCommonPrefix(String[] strs) {        
        Arrays.sort(strs);
        String first=strs[0],last=strs[strs.length-1];
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i))
               sb.append(first.charAt(i));
            else 
                break;
        }
        return sb.toString();
    }
}
