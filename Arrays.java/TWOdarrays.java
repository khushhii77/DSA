//QUES 1 & 2....
import java.util.*;
public class TWOdarrays {

public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
int rows= sc.nextInt();
int cols= sc.nextInt();
 int i,j; 
 //int sum1=0,sum2=0;
 int[][] numbers= new int[rows][cols];
 
 for(i=0; i<rows; i++){
    for(j=0; j<cols; j++){     //for(j=0;j<numbers[i].length;j++))    ....if cols is varying.
   numbers[i][j]=sc.nextInt();
   }
 }
 for(i=0; i<rows; i++){
    for(j=0; j<cols; j++){
        System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
}
          
       //ANOTHER METHOD TO PRINT....
                //     for(i=0; i<rows; i++){
               //    System.out.println(Arrays.toString(numbers[i]));
              //        } 

       //ANOTHER METHOD...
               //     for(int[]a:numbers){
               //      System.out.println(Arrays.toString(a));
               //     }


     //QUES 1: To search an element in a 2d array.
//  int x= sc.nextInt();
// for(i=0; i<rows; i++){
//     for(j=0; j<cols; j++){
//        if(numbers[i][j]==x){
//             System.out.println("x found at indices: ( "+i+" , "+j+" )"  );
//         }
//     }
//  }

//QUES 2: sum the element of 2d array.
    // for(i=0; i<rows; i++){
    //     for(j=0; j<cols; j++){
//         sum1=sum1+numbers[i][j];
//        }   
//     System.out.print(" " + sum1 + " ");  
//     sum1=0;
// System.out.println();
// }

// for(j=0; j<cols; j++){
//     for(i=0; i<rows; i++){
//         sum2=sum2+numbers[i][j];
//     }   
//     System.out.print(" " + sum2 + " ");  
//     sum2=0;
// System.out.println();
// }



 }
 }




















