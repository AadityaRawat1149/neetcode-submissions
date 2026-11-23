class Solution {
    public boolean search(int[] arr, int target) {
       int pivot=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                pivot=mid;
                break;
            
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                pivot=mid-1;
                break;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end] ){
                if(start<arr.length-1 && arr[start]>arr[start+1]){
                    pivot=start;
                    break;
                }
                start++;
                if(end>0 && arr[end-1]>arr[end]){
                    pivot=end-1;
                    break;
                }
                end--;
            }
            
            else if(arr[mid]>arr[start]){
                start=mid+1;
            }
            else end=mid-1;
        }
        
        if(pivot==-1){
            
            
            return fun(0,arr.length-1,arr,target);
        }
       
        if(arr[pivot]==target){
            return true;
        }
        boolean ans=fun(0,pivot,arr,target);
        
        if(ans){
            return ans;
        }
        return fun(pivot+1,arr.length-1,arr,target);
    }
        public boolean fun(int start,int end,int[] arr,int target){
            int s=start;
            int e=end;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]>target){
                    e=mid-1;
                }
                else if(arr[mid]<target){
                    s=mid+1;
                }
                else return true;
            }
            return false;

        }
}