import java.util.*;
public class {

    public static void main(String args[] ) {


// if else, else if, switch, break :-

Scanner sc = new Scanner (System.in);
int a= sc.nextInt();
int b= sc.nextInt();
int sum=a+b;

if(sum > 18) {
    System.out.println("Adult");
}

else {
    System.out.println("not adult");
}



Scanner sd = new Scanner (System.in);
int c= sd.nextInt();
if(c%2==0) {
    System.out.println("even");
}
   else {
    System.out.println("odd");
}

Scanner se = new Scanner (System.in);
int first = se.nextInt();
int second = se.nextInt();

if(first == second){
    System.out.println("equal");
}
else{
if(first > second){
    System.out.println("greater");
}
else{
    System.out.println("lesser");
}
}


//     if(button=1){
//         System.out.println("hey");
//     } else if(button=2){
//         System.out.println("hello");
//     }  else if(button=3){
//         System.out.println("hii");
//     } else{ System.out.println("INVALID");
//    }

switch (button) {
 case 1: System.out.println("heloo");
   break;
 case 2: System.out.println("helooo");
   break;
 case 3: System.out.println("heloooo");
   break;
 default: System.out.println("INVALID BUTTON");

 }

}
}
    



















