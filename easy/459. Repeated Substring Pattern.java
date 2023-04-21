// Q Repeated Substring Pattern
// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size=s.length();
        for(int i=size/2;i>=1;i--){
            if(size%i==0){
                int fac=size/i;
                String str=s.substring(0,i);
                StringBuilder sb= new StringBuilder();
                for(int j=0;j<fac;j++){
                    sb.append(str);
                }
                if(sb.toString().compareTo(s)==0){
                    return true;
                }
            }
        }
        return false;
    }
}
