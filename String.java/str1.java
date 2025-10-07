//strings are immutable.... it means, ONCE the string is made...It cant be changed or modified. FOR CHANGING, we have to make a new string.

import java.util.*;
public class str1 {
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        String name2=sc.nextLine(); 
          System.out.println(name2);

//concatenation(combine 2 string )
String a=sc.nextLine();
String b=sc.nextLine();
 String fullname=a + b;
System.out.println(fullname.length());

for(int i=0;i<fullname.length();i++){
    System.out.println(fullname.charAt(i));
}
if(a.compareTo(b)==0){
    System.out.println("strings are equal");
}
else{
    System.out.println("strings are not equal");
    }

//substring.
String namee="khushi";
String sub=namee.substring(0,5);
System.out.println(sub);
//this will print index {0 to (5-1)}.
}
}
