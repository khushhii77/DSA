import java.util.*;
public class xtra {
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int number=3;

for(int i=1;i<=2*n-1;i++){
   for(int j=1;j<=n;j++){

if(i<=n){
    for(i=1;i<=n;i++){
       for(j=1;j<=i;j++){
        System.out.print(number);
       }
       for(j=i+1;j<=n;j++){
        System.out.print(" ");
       }
       System.out.println();
    }
}
else{
    for(i=n+1;i<=2*n-1;i++){
        for(j=1;j<=          ){
        System.out.print(number);
    }
        for(j=n;j>i-n;j--){
            System.out.print(" ");
        }
        System.out.println();
    }
}









   }
}
    }
}