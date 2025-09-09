public class movezero {
      public static void main(String[] args){
        int[] arr={1,0,3,4,0,6,7};                  
        int n=arr.length;
      moveZeroes(arr);

      for(int i=0;i<n;i++){
         System.out.print(arr[i] + " ");
      }
    }

 public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
      int count=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
                count++;
            }
        }
     for(int i=count;i<n;i++){
         nums[i]=0;
     }
}


}












