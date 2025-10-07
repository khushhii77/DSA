public class binarySearch {
    public static void main(String args[]){
        int[]arr={-3,-1,0,3,5,9,14,24,32};
        int target=24;
        int ans=binarySrch(arr,target);
        System.out.println(ans);
    }

    static int binarySrch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

     while(start<=end){
        int mid=start+(end-start)/2;
     if(target<arr[mid]){
        end=mid-1;
     }
     else if(target>arr[mid]){
        start=mid+1;
    }
    else{
        return mid;
    }
     }

 return -1;
    }
}
