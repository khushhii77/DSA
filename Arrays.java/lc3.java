public class lc3 {
        public static boolean searchInSorted(int arr[], int k) {
             boolean ans=false;
            for(int i=0;i<arr.length;i++){
                if(k==arr[i]){
                    ans=true;
                    break;
                }
            }
          return ans;
        }
        
         public static void main(String[] args){
             int[] arr={1,2,3,4,6};
             int k=6;
             System.out.println(searchInSorted(arr,k));
         }
    }
    

