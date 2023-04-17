// Q)Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int s=flowerbed.size();
        if(n==0 or (s==1 and flowerbed[0]==0 and n==1))
            return true;
        if(s==1 and flowerbed[0]==1)
            return false;
        for(int i=0;i<s-1;i++){
            if(i==0 and flowerbed[0]==0 and flowerbed[1]==0 ){
                flowerbed[i]=1;
                n--;
            }
            else if(flowerbed[i]==0 and flowerbed[i+1]==0 and flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        if(flowerbed[s-1]==0 and flowerbed[s-2]==0){
            flowerbed[s-1]=1;
            n--;
        }
        if(n<=0)
            return true;
        return false;
    }
};
