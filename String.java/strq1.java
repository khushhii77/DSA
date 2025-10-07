import java.util.*;

public class strq1 {
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
int size=sc.nextInt();
String str[]=new String[size];
int totLength=0;

System.out.println("enter the strings:");
for(int i=0;i<size;i++){
    
    str[i]=sc.next();  // str[i]=sc.nextLine(); 
    totLength=totLength+ str[i].length();    // totLength += array[i].length() 

}
  System.out.println(totLength);

    }
}
