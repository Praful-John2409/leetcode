//Q Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
class Solution {
    public int longestPalindrome(String s) {
        int freq[]= new int[256];
        int count=0;
        for(int i=0;i<s.length();i++){
            freq[(int) s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){     //counting all the even occuring characters
            if(freq[i]%2==0){
                count=count+freq[i];
            }
        }
        int countMax=0;
        for(int i=0;i<256;i++){
            if(freq[i]%2==1){
               countMax=Math.max(countMax,freq[i]);  // searching for the character which is occuring maximum number of time
               count=count+freq[i]-1;   //taking only the even occurence of the character from the odd occuring character 
            }
        }
        if(countMax!=0){
            count++;
        }
        return count;
    }
}

// optimized code
class Solution {
    public int longestPalindrome(String s) {
        int freq[]= new int[256];
        int count=0;
        for(int i=0;i<s.length();i++){
            freq[(int) s.charAt(i)]++; 
        }
        // for(int i=0;i<256;i++){     //counting all the even occuring characters
        //     if(freq[i]%2==0){
        //         count=count+freq[i];
        //     }
        // }
        //int countMax=0;
        for(int i=0;i<256;i++){
            if(freq[i]%2==1){
               // countMax=Math.max(countMax,freq[i]);  // searching for the character which is occuring maximum number of time
               //count=count+freq[i]-1;   //taking only the even occurence of the character from the odd occuring character 
                count++;
            }
        }
        // if(countMax!=0){
        //     count++;
        // }
        // return count;
        if(count>1)
         return s.length()-count+1;
        return s.length();
    }
}
