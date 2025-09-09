import java.util.*;
public class arrayBasics {
    public static void main(String args[]){

    int[] marks= {5,4,3,2,1};  // Int is datatype. Marks is reference variable. New is used to create an object. [SIZE] is size of array.
    
      // System.out.println(marks[0]);
      // System.out.println(marks[1]);
      // System.out.println(marks[2]);
      // System.out.println(marks[3]);
      // System.out.println(marks[4]);

// Another method of print the given marks is through the LOOP:- 
//  for(int i=0; i<5; i++){
//     System.out.println(marks[i]);
//  }

 for(int i:marks){               //Enhanced forLOOP.
    System.out.println(i);
 }

 //for(int i:marks){
    System.out.println(Arrays.toString(marks));
 //}

    }
}
