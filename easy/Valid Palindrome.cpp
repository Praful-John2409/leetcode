//QA phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
//it reads the same forward and backward. 
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise. 
class Solution {
public:
    bool isPalindrome(string s) {
       if(s.size()==0)
            return true;
        string s1;
        for(int i=0;i<s.size();i++)
        {
            if(isalpha(s[i]) || isdigit(s[i]))
                s1.push_back(tolower(s[i]));
        }
        int start=0,end=s1.size()-1;
        while(start<end)
        {
            if(s1[start]!=s1[end]) 
                return false;
           
                start++;
                end--;
            
        }
        return true;
    }
};
