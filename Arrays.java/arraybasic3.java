//arrays in java are MUTABLE.
import java.util.*;
public class arraybasic3 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);    

    //ARRAYS of object.
String [] names=new String[5];
for(int i=0;i<names.length;i++){
    names[i]=sc.next();
}
System.out.println(Arrays.toString(names));

//modify
names[1]="singh";
System.out.println(Arrays.toString(names));


        
    }
}