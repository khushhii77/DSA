public class ques2 {    
    public static void main(String args[]){
     
    int[] arr={1,2,3,4,5,6};
    int i;
     
  for(i=0;i<arr.length; i++){  
    if(i%2!=0){

      if(arr.length%2==0){
        System.out.print(arr[arr.length-i]);
       }
        else{
          System.out.print(arr[arr.length-i-1]);
      }
    }

   else{
        System.out.print(arr[i]);
       }
}


//1 6 3 4 5 2




  }
}
    