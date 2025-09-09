// basically, ARRAYLIST .... if u don't know size of array. WE want size to be handle and let me input any no.of elements that i want.

import java.util.*;

public class TWODarraylist {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);

    //syntax
    ArrayList<Integer> list = new ArrayList<> (10);  // we cant write  <int>
     list.add(67);
     list.add(667);
     list.add(7);  
     list.add(547);
     list.add(6756);
//add as many as you want.
System.out.println(list);

// many operation you can do here...
   System.out.println(list.contains(7));   //tells whether true or false.

list.set(1,68);
System.out.println(list);

list.remove(3);
System.out.println(list);

for(int i=0;i<8;i++){
  list.add(sc.nextInt());
}

for(int i=0;i<8;i++){
 System.out.println(list.get(i));  //pass index here, list[i] will not work here.
}


    }
}









