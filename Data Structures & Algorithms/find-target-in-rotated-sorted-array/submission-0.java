class Solution {
    public int search(int[] arr, int target) {
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
            
            else if(arr[mid]>arr[start]){
                start=mid+1;
            }
            else end=mid-1;
        }
        
        if(pivot==-1){
            pivot=arr.length-1;
            return fun(0,arr.length-1,arr,target);
        }
       
        if(arr[pivot]==target){
            return pivot;
        }
         int ans=fun(0,pivot,arr,target);
        
         if(ans!=-1){
            return ans;
        }
        else return fun(pivot+1,arr.length-1,arr,target);
    }
        public  int fun(int start,int end,int[] arr,int target){
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
                else return mid;
            }
            return -1;

        }
        
    
}
