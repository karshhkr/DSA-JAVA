class Solution {
    public int mySqrt(int x) {
        int low =0;
        int high=x;
        int ans=0;
        while(low<=high){
           //  int mid=(low+high)/2;
           int mid=low+(high -low)/2;
           Long square=(long) mid*mid;
          //  if(mid*mid == x)
          if(square == x){
                return mid;
            }//else if (mid*mid <x)
            else if (square <x){
                low=mid+1;
                ans=mid;

            }else{
                high =mid-1;

            }
        }
        return ans;
    }
}