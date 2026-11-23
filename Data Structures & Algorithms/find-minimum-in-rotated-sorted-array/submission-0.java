class Solution {
    public int findMin(int[] arr) {
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
            return arr[0];
        }
        else return arr[pivot+1];
        
    }
}
