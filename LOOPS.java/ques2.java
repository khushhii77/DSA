import java.util.* ;
public class ques2 {
    public static void main(String args[]) {

    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();

    
    for(int i=n; i<=n*10; i=i+n){
     System.out.println(i) ;
     }

    // another way of taking loop for this question...
    
    for( int i=1; i<=10  ; i++){
      System.out.println(i*n);
    }
    
}
}

