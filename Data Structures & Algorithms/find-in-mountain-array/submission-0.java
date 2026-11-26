/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         int peak=0;

        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)) {           
                end=mid;
            }
            else {                                        
                start=mid+1;
            }
        }
        peak=end;
        int ans=fun(target, mountainArr,peak);
        
        if(ans!=-1) return ans;
        else return methfun(target, mountainArr,peak);

    }
    public int fun(int target, MountainArray mountainArr,int peak){
        int start=0;
        int end=peak;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>mountainArr.get(mid))
                start=mid+1;
            else if(target<mountainArr.get(mid))
                end=mid-1;
            else return mid;
        }
        return -1;
    }
     public int methfun(int target, MountainArray mountainArr,int peak){
        int start=peak;
        int end=mountainArr.length()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>mountainArr.get(mid))
                end=mid-1;
            else if(target<mountainArr.get(mid))
                
                start=mid+1;
            else return mid;
        }
        return -1;
    }
}