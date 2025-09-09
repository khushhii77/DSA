import java.util.*;
public class twoDArrayLIST2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);    
        // ArrayList<Integer> list = new ArrayList<> (10); 
        // for(int i=0;i<8;i++){
        //     list.add(sc.nextInt());          
        //   }
          
        //   for(int i=0;i<8;i++){
        //    System.out.println(list.get(i));  //pass index here, list[i] will not work here.
        //   }
        //   System.out.println(list);     
               

//for multi-dimensional
ArrayList<ArrayList<Integer>> list = new ArrayList<> (); 
 
  for(int i=0;i<5;i++){                 //if this will not add...then it will give error
       list.add(new ArrayList<>());
   }
     //add elements
       for(int i=0;i<5;i++){
        for(int j=0;j<2;j++){
          list.get(i).add(sc.nextInt());
        }
       }
       System.out.println(list);
        }          
}  

  