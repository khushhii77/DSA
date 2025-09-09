public class leetcode1{     
  public static void main(String[] args){
        int[] arr={1,8,7,56,90};
        System.out.println(largest(arr));
  }

    public static int largest(int[] arr) {
         int lar=arr[0];
        for(int i=1;i<arr.length;i++){
             if(arr[i]>lar){
                 lar=arr[i];
             }
        }
        return lar;
    }
}
