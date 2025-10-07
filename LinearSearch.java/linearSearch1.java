public class linearSearch1 {
    public static void main(String args[]){
         int[] arr={12,34,2,4,0,-1,89};
         int target=9;
           int ans=linearSearch(arr,target);
             System.out.println(ans);
        }
    
    static int linearSearch(int[] arr,int target){
       // for(int i=0;i<arr.length;i++){   
          for(int element:arr){                   //enhanced for loop.
          // if(target==arr[i]){
          if(element==target){
              return element;
           }
        }
          return -1;
    }
        }
    
    

