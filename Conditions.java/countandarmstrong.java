import java.util.*;
public class countandarmstrong {
    public static void main(String args[]){

int count=0; int newno=0; int digits=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int nn=n;
int nnn=n;
while(n!=0){
  n=n/10;
  count++;
}
System.out.println(+count);

while(nn!=0){
   digits= nn%10;
   nn=nn/10;
   newno= newno + (int)Math.pow(digits,count);
}
 
if(nnn==newno){
  System.out.println("armstrong no");
}
else{
  System.out.println("not armstrong no");
}
  }
}

