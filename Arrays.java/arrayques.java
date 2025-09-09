//max value of array,  swap value of array
import java.util.*;
public class arrayques{ 
     public static void main(String args[]){
Scanner sc= new Scanner(System.in);

int size= sc.nextInt();
int numbers[] = new int[size];

for(int i=0; i<size; i++){
    numbers[i]= sc.nextInt();
}

int x= sc.nextInt();

for(int i=0; i<numbers.length; i++){
    if (numbers[i]== x){                                //process to find this "x" is LINEAR SEARCH.
    System.out.println("x found on index: " +i  );
}

}
}
}



//
