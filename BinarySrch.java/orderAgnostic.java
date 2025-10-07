//Whether array is in ascending or descending order...
public class orderAgnostic {
    public static void main(String args[]){
       // int[]arr={-3,-1,0,3,5,9,14,24,32};
        int[] arr={71,21,3,2,1,0,-4,-5};
        int target=-4;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

     boolean isAscending= arr[start]<arr[end];
     while(start<=end){
        int mid=start+(end-start)/2;
         if(arr[mid]==target){
            return mid;
         }

if(isAscending){
     if(target<arr[mid]){
        end=mid-1;
     }
     else {
        start=mid+1;
    }
     }
else{
    if(target>arr[mid]){
        end=mid-1;
     }
     else {
        start=mid+1;
    }
}
     }
 return -1;
    
}
}


