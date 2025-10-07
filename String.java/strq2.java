 import java.util.*;
public class strq2 {
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of person:");
int size=sc.nextInt();
 String email[]=new String[size];

 System.out.println("enter the email ID of any person:");
 for(int i=0;i<size;i++){
   email[i]=sc.next();
  System.out.println(email[i].substring(0,email[i].length()-1-9));
}
}
}

// import java.util.*;
// public class strq2 {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      String email = sc.next();
//      String userName = "";

//      for(int i=0; i<email.length(); i++) {
//        if(email.charAt(i) == '@') {
//         break;
//        } else {
//          userName += email.charAt(i);
//        }
//      }
//      System.out.println(userName);
//    }
// }

