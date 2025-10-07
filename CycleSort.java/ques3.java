import java.util.ArrayList;
import java.util.List;

public class ques3 {
    public static void main(String args[]){
        int[] arr={3,5,3,1,1};
        System.out.println(disappearNum(arr));
     }

     public static List<Integer>disappearNum(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;   
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
         List<Integer> ans= new ArrayList<>();
         for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(i+1);
            }
         }
          return ans;
     }

     static void swap(int[] arr,int first,int second){
         int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
     }
 
 }
 
 