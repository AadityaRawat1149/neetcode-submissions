class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        long start=1;
        long end=x/2;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid>x){
                end=mid-1;
            }
            else if(mid*mid<x){
                start=mid+1;

            
            }
            else return (int)mid;
        }
        return (int)end;
        
    }
}