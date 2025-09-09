//BRUTE...

import java.util.Arrays;
public class longestSubarray {
    public static void main(String[] args){
        int[] arr={1,8,3,4,1,1,7};   
        int m=9;               
        System.out.print(Arrays.toString(longestSubarray(arr,m)));
    }

    public static int[] longestSubarray(int[]nums, int k){
         int n=nums.length;    
        int max=-1;
        int start_index=-1;
        
        for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
             sum=sum+nums[j];
            
              if(sum==k){
               int length=j-i+1;
                    if(length > max){
                        max = length;     
                        start_index = i;
                    }
              }
            }  
        }
          if(start_index == -1) return new int[0]; // no subarray found

          int[] sub=new int[max];
           for(int i=0;i<max;i++){
            sub[i]=nums[i+start_index];
           }
       return sub;
    }
  }


