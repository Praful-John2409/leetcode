// Q) You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers 
// can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
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
