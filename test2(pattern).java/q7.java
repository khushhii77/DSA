
public class q7 {
    public static void main(String args[]){

        
for(char i='A'; i<='E'; i++)        {
    char k='A';
    for(char j='A'; j<=i; j++){
        System.out.print(k++ +" ");
    }

    k= (char)(k-2);
    for(char j='A'; j<i; j++){
        System.out.print(k-- +" ");
    }
   
    System.out.println();



}

    }
    
}
