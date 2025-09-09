public class maxConsecutive {
     public static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=1;
        int j=0;
        int max=0;

     for(int i=1;i<n;i++){
      if(nums[i]==nums[j]){
        j++;
        count++;
        
            if(count>max){
                max=count;
            }
      }
      else {
        j++;
        count=1;
      }
     }
       return max;
    }

    public static void main(String args[]){
        int[] arr={1,2,3,2,2,3,4,3,3,3,3};
        System.out.print(findMaxConsecutiveOnes(arr));
    }
}
