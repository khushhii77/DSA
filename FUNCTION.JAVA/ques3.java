import java.util.*;
  public class ques3 {

  public static int printFactorial(int n){
   int fact=1;
    for(int i=1; i<=n; i++){
        fact=fact*i;
    }
    return fact;
   }
public static void main(String args[]){
       
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int fac=printFactorial(n);

   System.out.println(fac);
    

    }
}

















    

