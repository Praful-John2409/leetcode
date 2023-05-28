// Q)The value of an alphanumeric string can be defined as:
// The numeric representation of the string in base 10, if it comprises of digits only.
// The length of the string, otherwise.
// Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
class Solution {
    public int maximumValue(String[] strs) {
    List<Integer> ls=new ArrayList();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            boolean ch=false;
            for(int j=0;j<strs[i].length();j++){
                if(Character.isLetter(s.charAt(j))){
                    ch=true;
                    break;
                }
            }
            if(ch){
                ls.add(strs[i].length());
            }
            else{
                int num=Integer.parseInt(strs[i]);
                ls.add(num);
            }
        }
        return Collections.max(ls);
    }
}
