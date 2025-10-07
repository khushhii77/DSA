public class ques3 {
    public static void main(String args[]){
        //12345767879
    int n=12376767;
// int i,count=0,digit;
// while(n>0){
//     digit=n%10;
//     n=n/10;
// if(digit==7){
//     count++;
// }
// }
// System.out.println(count);
int i,rev=0,digit;
while(n>0){
    digit=n%10;
    n=n/10;
    rev=rev*10+digit;
}
System.out.println(rev);
    }
}