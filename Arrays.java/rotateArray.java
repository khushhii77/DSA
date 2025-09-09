public class rotateArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};                   //5 6 7 1 2 3 4
        int n=arr.length;
        int r=3;
        rotate(arr,r);

          for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }    
    }

    public static int rotate(int[] nums,int k){
              int n = nums.length;
              k = k % n;

        reverse(nums, 0, n - 1);       // Step 1: Reverse entire array
        reverse(nums, 0, k - 1);       // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);       // Step 3: Reverse remaining
  return 0;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}

        //int j=0;
        // for(int i=n-k;i<n;i++){
        //     nums[j]=nums[i];
        //     j++;
        // }

        //  for(int i=0;i<=k;i++){
        //     nums[j]=nums[i];
        //     j++;
        // }


        // int n=nums.length;
        //  int temp[];
         
        //  for(int i=0;i)


        //  for(int i=0;i<k;i++){
        //     nums[i]=nums[k+1+i];
        // }

        // int j=0;
        // for(int i=k;i<n;i++){
        //     nums[i]=nums[j];
        //     j++;
        // }
        // return 0