import java.util.*;
public class leaderOPT {
    public static ArrayList<Integer> leaderInArray(int[]arr,int n){
      ArrayList<Integer> ans= new ArrayList<>();
      
        int max = arr[n - 1];  // last element is always a leader
        ans.add(max);

      for(int i=n-2;i>=0;i--){
        if(arr[i]>max){
         max=arr[i];
          ans.add(max);
        }
      }
      Collections.reverse(ans);
      return ans;
    }

    public static void main(String[] args){
      int n=6;
      int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> ans= leaderInArray(arr,n);
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }
    }

}
