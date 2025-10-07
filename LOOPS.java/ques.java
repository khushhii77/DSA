import java.util.*;
public class ques {
    public static void main(String args[]) {
int digit,sum=0;

Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n>0){
    digit=n%10;
    n=n/10;
    sum=sum+digit;
   }
   System.out.println(sum);

   }











    }


