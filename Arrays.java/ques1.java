public class ques1 {    
public static void main(String args[]){
 
int[] arr={1,0,1,1,1,1};
int i,sum=0,mult=1;
 
 for(i=0; i<arr.length; i++){ 
      if(i%2==0){
        sum=sum+arr[i];
      }
    mult=mult*arr[i];
}

System.out.print("sum of all even index:"+ sum);
System.out.println("\nmultiplication of all index:"+ mult);



    
    }
}