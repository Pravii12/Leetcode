class Solution {
    public int mySqrt(int x) {
        if (x==1) return 1;
        int low=1;
        int high=x/2;
        int res=0;
        while(low<=high){
             int mid=(low+high)/2;
             long sq=(long)mid*mid;
            if(sq==x){
                return mid;
            }
            else if(sq<x){
                
                 res=mid;
                 low=mid+1;
                 
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
}