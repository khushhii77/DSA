 import java.util.Scanner;
 public class switchques {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);

while(true){
 System.out.println("press any button: (+,-,*,/,%)");
      char button=sc.next().charAt(0);
   if( button=='+' || button=='-' || button=='*' || button=='%' || button=='%' ){

    System.out.println("enter a and b:");
  int a=sc.nextInt(); int b=sc.nextInt();  
switch(button){
case '+': System.out.println("\nRESULT:"+(a+b));
break;
case '-': System.out.println("RESULT:"+(a-b) );
break;
case '*': System.out.println("RESULT:"+(a*b));
break;
case '/': System.out.println("RESULT:"+(a/b));
break;
case '%': System.out.println("RESULT:"+(a%b));
break;
}

}
else{
    System.out.println("INVALID!!\n");
}
}

}
 }

