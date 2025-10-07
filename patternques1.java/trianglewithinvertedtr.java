import java.util.*;
public class trianglewithinvertedtr {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    int i,j;
       //outer loop;
    for(i=1;i<=2*n-1;i++){
// //inner loop;
if(i<=n){
         for( j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(j=1;j<=i;j++){
            System.out.print("* ");
         }
       }
else{
    for(j=1;j<=i-n;j++){
        System.out.print(" ");
     }
     for(j=1;j<=2*n-i;j++){
        System.out.print("* ");
     }
}
System.out.println();
    }
    }
    }

    //chatgpt code....
//     for (int i = 1; i <= 2 * n - 1; i++) {
            
//         // For the upper part of the pattern (first n rows)
//         if (i <= n) {
//             // Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//         } 
//         // For the lower part of the pattern (remaining rows)
//         else {
//             // Print leading spaces
//             for (int j = 1; j <= i - n; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int j = 1; j <= 2 * n - i; j++) {
//                 System.out.print("* ");
//             }
//         }
//         // Move to the next line after printing each row
//         System.out.println();
//     }
// }
// }
