//Q Keyboard Row 
//Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".
class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        ArrayList<String> wordList=new ArrayList<>();
        for(String a:words){
            String word=a.toLowerCase();
            int s1=0,s2=0,s3=0;
            for(int i=0;i<word.length();i++){
                for(int j=0;j<r1.length();j++){
                    if(word.charAt(i)==r1.charAt(j))
                        s1++;
                }
            }
            for(int i=0;i<word.length();i++){
                for(int j=0;j<r2.length();j++){
                    if(word.charAt(i)==r2.charAt(j))
                        s2++;
                }
            }
            for(int i=0;i<word.length();i++){
                for(int j=0;j<r3.length();j++){
                    if(word.charAt(i)==r3.charAt(j))
                        s3++;
                }
            }
            if(s1==word.length()){
                wordList.add(a);   
            }else if(s2==word.length()){
                wordList.add(a); 
            }else if(s3==word.length()){
                wordList.add(a); 
            }
        }
        String result[]= new String[wordList.size()];
        int i=0;
        for(String x:wordList){
            result[i++]=x;
        }
        return result;
    }
}
