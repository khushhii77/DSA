import java.util.*;
public class arraybasic2 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);

    //ARRAYS of primitive.
int i;
int [] marks=new int[5];
for(i=0;i<5;i++){
    marks[i]=sc.nextInt();
}
 //1st method
// for(i=0;i<5;i++){
// System.out.print(marks[i] + " ");
// }

 //2nd method
// for(int num:marks){     // FOR EVERY ELEMENT IN THE ARRAY,PRINT THE ELEMENT.
//     System.out.print(num+" ");  //.....AND here num represent elements of array.
// }

//3rd method
System.out.println(Arrays.toString(marks));

    }
}
